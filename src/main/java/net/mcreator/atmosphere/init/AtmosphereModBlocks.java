
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atmosphere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.atmosphere.block.SkyGrassBlockBlock;
import net.mcreator.atmosphere.AtmosphereMod;

public class AtmosphereModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AtmosphereMod.MODID);
	public static final RegistryObject<Block> SKY_GRASS_BLOCK = REGISTRY.register("sky_grass_block", () -> new SkyGrassBlockBlock());
}
