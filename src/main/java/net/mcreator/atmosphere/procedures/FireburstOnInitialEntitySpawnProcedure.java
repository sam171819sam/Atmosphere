package net.mcreator.atmosphere.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireburstOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("atmosphere:fire_burst")),
						SoundSource.AMBIENT, 5, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("atmosphere:fire_burst")),
						SoundSource.AMBIENT, 5, 1, false);
			}
		}
		AtmosphereMod.queueServerWork(20, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
