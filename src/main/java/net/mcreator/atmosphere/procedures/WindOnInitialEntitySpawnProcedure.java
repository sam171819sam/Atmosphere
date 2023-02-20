package net.mcreator.atmosphere.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class WindOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		AtmosphereMod.queueServerWork(10, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
