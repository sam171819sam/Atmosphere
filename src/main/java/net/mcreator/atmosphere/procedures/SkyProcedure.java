package net.mcreator.atmosphere.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

public class SkyProcedure {
	public static void execute(ResourceKey<Level> dimension) {
		if (dimension == null)
			return;
		if ((dimension) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("atmosphere:atmosphere_dimension")))) {
		}
	}
}
