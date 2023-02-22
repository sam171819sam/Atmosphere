package net.mcreator.atmosphere.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.atmosphere.init.AtmosphereModItems;

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
		}
	}
}
