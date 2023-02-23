package net.mcreator.atmosphere.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SoftAmuletItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AtmosphereModItems.SOFT_AMULET.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AtmosphereModItems.SOFT_AMULET
						.get()) {
			if ((world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.AIR) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 20, 1, (false), (false)));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, (entity.getX()), (entity.getY() - 0.5), (entity.getZ()), 5, 0, 0, 0, 0.05);
			}
			if (entity.getY() <= 0) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 80, 20, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 1, (false), (false)));
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AtmosphereModItems.SOFT_AMULET
						.get()) {
					if (world.isClientSide())
						Minecraft.getInstance().gameRenderer
								.displayItemActivation((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CLOUD, (entity.getX()), (entity.getY() - 0.5), (entity.getZ()), 70, 0.3, 0.3, 0.3, 0.1);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
						.getItem() == AtmosphereModItems.SOFT_AMULET.get()) {
					if (world.isClientSide())
						Minecraft.getInstance().gameRenderer
								.displayItemActivation((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
					((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).shrink(1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CLOUD, (entity.getX()), (entity.getY() - 0.5), (entity.getZ()), 70, 0.3, 0.3, 0.3, 0.1);
				}
			}
		}
	}
}
