package net.mcreator.atmosphere.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireAmuletDispenserOnDispenseAttemptWithResultProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new FireburstEntity(AtmosphereModEntities.FIREBURST.get(), _level);
			entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
