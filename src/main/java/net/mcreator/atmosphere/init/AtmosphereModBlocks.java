
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atmosphere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.atmosphere.block.WitchPoolBlock;
import net.mcreator.atmosphere.block.WitchCrushingStoneBlock;
import net.mcreator.atmosphere.block.TubBlock;
import net.mcreator.atmosphere.block.ShatterStoneBlock;
import net.mcreator.atmosphere.block.RawLuminumBlockBlock;
import net.mcreator.atmosphere.block.LuminumBlockBlock;
import net.mcreator.atmosphere.block.CobbledShatterStoneBlock;
import net.mcreator.atmosphere.AtmosphereMod;

public class AtmosphereModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AtmosphereMod.MODID);
	public static final RegistryObject<Block> RAW_LUMINUM_BLOCK = REGISTRY.register("raw_luminum_block", () -> new RawLuminumBlockBlock());
	public static final RegistryObject<Block> LUMINUM_BLOCK = REGISTRY.register("luminum_block", () -> new LuminumBlockBlock());
	public static final RegistryObject<Block> TUB = REGISTRY.register("tub", () -> new TubBlock());
	public static final RegistryObject<Block> WITCH_POOL = REGISTRY.register("witch_pool", () -> new WitchPoolBlock());
	public static final RegistryObject<Block> WITCH_CRUSHING_STONE = REGISTRY.register("witch_crushing_stone", () -> new WitchCrushingStoneBlock());
	public static final RegistryObject<Block> SHATTER_STONE = REGISTRY.register("shatter_stone", () -> new ShatterStoneBlock());
	public static final RegistryObject<Block> COBBLED_SHATTER_STONE = REGISTRY.register("cobbled_shatter_stone",
			() -> new CobbledShatterStoneBlock());
}
