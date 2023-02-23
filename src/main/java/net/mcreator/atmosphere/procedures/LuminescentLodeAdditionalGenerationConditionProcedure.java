package net.mcreator.atmosphere.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class LuminescentLodeAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z)))
				.is(BlockTags.create(new ResourceLocation("forge:luminescent_lode_valid_spawning_condition")))) {
			return true;
		}
		return false;
	}
}
