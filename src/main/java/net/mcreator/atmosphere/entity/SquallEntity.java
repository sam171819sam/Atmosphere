
package net.mcreator.atmosphere.entity;

import software.bernie.geckolib3.util.GeckoLibUtil;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.builder.ILoopType.EDefaultLoopTypes;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.IAnimatable;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.atmosphere.init.AtmosphereModEntities;

import java.util.EnumSet;

public class SquallEntity extends Monster implements IAnimatable {
	private AnimationFactory factory = GeckoLibUtil.createFactory(this);
	private boolean swinging;
	private long lastSwing;
	public String animationprocedure = "empty";

	public SquallEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(AtmosphereModEntities.SQUALL.get(), world);
	}

	public SquallEntity(EntityType<SquallEntity> type, Level world) {
		super(type, world);
		xpReward = 1;
		setNoAi(false);
		setPersistenceRequired();
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (SquallEntity.this.getTarget() != null && !SquallEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return SquallEntity.this.getMoveControl().hasWanted() && SquallEntity.this.getTarget() != null
						&& SquallEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = SquallEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				SquallEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 6);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = SquallEntity.this.getTarget();
				if (SquallEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					SquallEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = SquallEntity.this.distanceToSqr(livingentity);
					if (d0 < 25) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						SquallEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 6);
					}
				}
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 5, 20) {
			@Override
			protected Vec3 getPosition() {
				RandomSource random = SquallEntity.this.getRandom();
				double dir_x = SquallEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = SquallEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = SquallEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}
		});
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 6, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(5, new HurtByTargetGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.ILLAGER;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.FALL)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.6);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 9);
		builder = builder.add(Attributes.FOLLOW_RANGE, 40);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.1);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.1);
		builder = builder.add(Attributes.FLYING_SPEED, 0.6);
		return builder;
	}

	private <E extends IAnimatable> PlayState movementPredicate(AnimationEvent<E> event) {
		if (this.animationprocedure.equals("empty")) {
			if (event.isMoving() || !(event.getLimbSwingAmount() > -0.15F && event.getLimbSwingAmount() < 0.15F)) {
				event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", EDefaultLoopTypes.LOOP));
				return PlayState.CONTINUE;
			}
			if (this.isDeadOrDying()) {
				event.getController().setAnimation(new AnimationBuilder().addAnimation("death", EDefaultLoopTypes.PLAY_ONCE));
				return PlayState.CONTINUE;
			}
			if (this.isInWaterOrBubble()) {
				event.getController().setAnimation(new AnimationBuilder().addAnimation("swim", EDefaultLoopTypes.LOOP));
				return PlayState.CONTINUE;
			}
			if (this.isShiftKeyDown()) {
				event.getController().setAnimation(new AnimationBuilder().addAnimation("sneak", EDefaultLoopTypes.LOOP));
				return PlayState.CONTINUE;
			} else if (this.isSprinting()) {
				event.getController().setAnimation(new AnimationBuilder().addAnimation("sprint", EDefaultLoopTypes.LOOP));
				return PlayState.CONTINUE;
			}
			event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", EDefaultLoopTypes.LOOP));
			return PlayState.CONTINUE;
		}
		return PlayState.STOP;
	}

	private <E extends IAnimatable> PlayState attackingPredicate(AnimationEvent<E> event) {
		double d1 = this.getX() - this.xOld;
		double d0 = this.getZ() - this.zOld;
		float velocity = (float) Math.sqrt(d1 * d1 + d0 * d0);
		if (getAttackAnim(event.getPartialTick()) > 0f && !this.swinging) {
			this.swinging = true;
			this.lastSwing = level.getGameTime();
		}
		if (this.swinging && this.lastSwing + 15L <= level.getGameTime()) {
			this.swinging = false;
		}
		if (this.swinging && event.getController().getAnimationState().equals(software.bernie.geckolib3.core.AnimationState.Stopped)) {
			event.getController().markNeedsReload();
			event.getController().setAnimation(new AnimationBuilder().addAnimation("attack", EDefaultLoopTypes.PLAY_ONCE));
			return PlayState.CONTINUE;
		}
		return PlayState.CONTINUE;
	}

	private <E extends IAnimatable> PlayState procedurePredicate(AnimationEvent<E> event) {
		if (!(this.animationprocedure.equals("empty"))
				&& event.getController().getAnimationState().equals(software.bernie.geckolib3.core.AnimationState.Stopped)) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation(this.animationprocedure, EDefaultLoopTypes.PLAY_ONCE));
			if (event.getController().getAnimationState().equals(software.bernie.geckolib3.core.AnimationState.Stopped)) {
				this.animationprocedure = "empty";
				event.getController().markNeedsReload();
			}
		}
		return PlayState.CONTINUE;
	}

	@Override
	protected void tickDeath() {
		++this.deathTime;
		if (this.deathTime == 20) {
			this.remove(SquallEntity.RemovalReason.KILLED);
			this.dropExperience();
		}
	}

	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController<>(this, "movement", 4, this::movementPredicate));
		data.addAnimationController(new AnimationController<>(this, "attacking", 4, this::attackingPredicate));
		data.addAnimationController(new AnimationController<>(this, "procedure", 4, this::procedurePredicate));
	}

	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}
}
