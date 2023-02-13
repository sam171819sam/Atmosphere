
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
import net.mcreator.atmosphere.block.LuminumOreBlock;
import net.mcreator.atmosphere.block.LuminumDustBlock;
import net.mcreator.atmosphere.block.LuminumBlockBlock;
import net.mcreator.atmosphere.block.GustyGrassBlock;
import net.mcreator.atmosphere.block.DustyGlowstoneBlock;
import net.mcreator.atmosphere.block.CobbledShatterStoneBlock;
import net.mcreator.atmosphere.block.BoreaWoodBlock;
import net.mcreator.atmosphere.block.BoreaStairsBlock;
import net.mcreator.atmosphere.block.BoreaSlabBlock;
import net.mcreator.atmosphere.block.BoreaPressurePlateBlock;
import net.mcreator.atmosphere.block.BoreaPlanksBlock;
import net.mcreator.atmosphere.block.BoreaLogBlock;
import net.mcreator.atmosphere.block.BoreaLeavesBlock;
import net.mcreator.atmosphere.block.BoreaFenceGateBlock;
import net.mcreator.atmosphere.block.BoreaFenceBlock;
import net.mcreator.atmosphere.block.BoreaButtonBlock;
import net.mcreator.atmosphere.block.BlosoreaFlowerBlock;
import net.mcreator.atmosphere.block.AtmosphereDimensionPortalBlock;
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
	public static final RegistryObject<Block> GUSTY_GRASS = REGISTRY.register("gusty_grass", () -> new GustyGrassBlock());
	public static final RegistryObject<Block> ATMOSPHERE_DIMENSION_PORTAL = REGISTRY.register("atmosphere_dimension_portal",
			() -> new AtmosphereDimensionPortalBlock());
	public static final RegistryObject<Block> LUMINUM_DUST = REGISTRY.register("luminum_dust", () -> new LuminumDustBlock());
	public static final RegistryObject<Block> DUSTY_GLOWSTONE = REGISTRY.register("dusty_glowstone", () -> new DustyGlowstoneBlock());
	public static final RegistryObject<Block> LUMINUM_ORE = REGISTRY.register("luminum_ore", () -> new LuminumOreBlock());
	public static final RegistryObject<Block> BLOSOREA_FLOWER = REGISTRY.register("blosorea_flower", () -> new BlosoreaFlowerBlock());
	public static final RegistryObject<Block> BOREA_WOOD = REGISTRY.register("borea_wood", () -> new BoreaWoodBlock());
	public static final RegistryObject<Block> BOREA_LOG = REGISTRY.register("borea_log", () -> new BoreaLogBlock());
	public static final RegistryObject<Block> BOREA_PLANKS = REGISTRY.register("borea_planks", () -> new BoreaPlanksBlock());
	public static final RegistryObject<Block> BOREA_LEAVES = REGISTRY.register("borea_leaves", () -> new BoreaLeavesBlock());
	public static final RegistryObject<Block> BOREA_STAIRS = REGISTRY.register("borea_stairs", () -> new BoreaStairsBlock());
	public static final RegistryObject<Block> BOREA_SLAB = REGISTRY.register("borea_slab", () -> new BoreaSlabBlock());
	public static final RegistryObject<Block> BOREA_FENCE = REGISTRY.register("borea_fence", () -> new BoreaFenceBlock());
	public static final RegistryObject<Block> BOREA_FENCE_GATE = REGISTRY.register("borea_fence_gate", () -> new BoreaFenceGateBlock());
	public static final RegistryObject<Block> BOREA_PRESSURE_PLATE = REGISTRY.register("borea_pressure_plate", () -> new BoreaPressurePlateBlock());
	public static final RegistryObject<Block> BOREA_BUTTON = REGISTRY.register("borea_button", () -> new BoreaButtonBlock());
}
