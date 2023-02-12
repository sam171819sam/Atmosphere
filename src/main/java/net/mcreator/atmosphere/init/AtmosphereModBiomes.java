
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atmosphere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.atmosphere.world.biome.WavyMeadowBiome;
import net.mcreator.atmosphere.world.biome.DustyLumaBiome;
import net.mcreator.atmosphere.AtmosphereMod;

public class AtmosphereModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, AtmosphereMod.MODID);
	public static final RegistryObject<Biome> WAVY_MEADOW = REGISTRY.register("wavy_meadow", WavyMeadowBiome::createBiome);
	public static final RegistryObject<Biome> DUSTY_LUMA = REGISTRY.register("dusty_luma", DustyLumaBiome::createBiome);
}
