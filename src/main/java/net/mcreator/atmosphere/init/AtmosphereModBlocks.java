
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atmosphere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.atmosphere.block.ZorroWoodBlock;
import net.mcreator.atmosphere.block.ZorroTrapdoorBlock;
import net.mcreator.atmosphere.block.ZorroStairsBlock;
import net.mcreator.atmosphere.block.ZorroSlabBlock;
import net.mcreator.atmosphere.block.ZorroPressurePlateBlock;
import net.mcreator.atmosphere.block.ZorroPlanksBlock;
import net.mcreator.atmosphere.block.ZorroLogBlock;
import net.mcreator.atmosphere.block.ZorroLeavesBlock;
import net.mcreator.atmosphere.block.ZorroFenceGateBlock;
import net.mcreator.atmosphere.block.ZorroFenceBlock;
import net.mcreator.atmosphere.block.ZorroDoorBlock;
import net.mcreator.atmosphere.block.ZorroButtonBlock;
import net.mcreator.atmosphere.block.WitchPoolBlock;
import net.mcreator.atmosphere.block.WitchCrushingStoneBlock;
import net.mcreator.atmosphere.block.TubBlock;
import net.mcreator.atmosphere.block.ShatterStoneBlock;
import net.mcreator.atmosphere.block.RawLuminumBlockBlock;
import net.mcreator.atmosphere.block.LuminumOreBlock;
import net.mcreator.atmosphere.block.LuminumDustBlock;
import net.mcreator.atmosphere.block.LuminumBlockBlock;
import net.mcreator.atmosphere.block.LuminescentLodeBlock;
import net.mcreator.atmosphere.block.HumusSoilBlock;
import net.mcreator.atmosphere.block.HumusGrassBlockBlock;
import net.mcreator.atmosphere.block.GustyGrassBlock;
import net.mcreator.atmosphere.block.FloweringZorroLeavesBlock;
import net.mcreator.atmosphere.block.DustyGlowstoneBlock;
import net.mcreator.atmosphere.block.CobbledShatterStoneBlock;
import net.mcreator.atmosphere.block.CloudFluffBlock;
import net.mcreator.atmosphere.block.BoreaWoodBlock;
import net.mcreator.atmosphere.block.BoreaTrapdoorBlock;
import net.mcreator.atmosphere.block.BoreaStairsBlock;
import net.mcreator.atmosphere.block.BoreaSlabBlock;
import net.mcreator.atmosphere.block.BoreaPressurePlateBlock;
import net.mcreator.atmosphere.block.BoreaPlanksBlock;
import net.mcreator.atmosphere.block.BoreaLogBlock;
import net.mcreator.atmosphere.block.BoreaLeavesBlock;
import net.mcreator.atmosphere.block.BoreaFenceGateBlock;
import net.mcreator.atmosphere.block.BoreaFenceBlock;
import net.mcreator.atmosphere.block.BoreaDoorBlock;
import net.mcreator.atmosphere.block.BoreaButtonBlock;
import net.mcreator.atmosphere.block.BlosoreaVinesBlock;
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
	public static final RegistryObject<Block> BLOSOREA_VINES = REGISTRY.register("blosorea_vines", () -> new BlosoreaVinesBlock());
	public static final RegistryObject<Block> HUMUS_SOIL = REGISTRY.register("humus_soil", () -> new HumusSoilBlock());
	public static final RegistryObject<Block> HUMUS_GRASS_BLOCK = REGISTRY.register("humus_grass_block", () -> new HumusGrassBlockBlock());
	public static final RegistryObject<Block> CLOUD_FLUFF = REGISTRY.register("cloud_fluff", () -> new CloudFluffBlock());
	public static final RegistryObject<Block> ZORRO_WOOD = REGISTRY.register("zorro_wood", () -> new ZorroWoodBlock());
	public static final RegistryObject<Block> ZORRO_LOG = REGISTRY.register("zorro_log", () -> new ZorroLogBlock());
	public static final RegistryObject<Block> BOREA_DOOR = REGISTRY.register("borea_door", () -> new BoreaDoorBlock());
	public static final RegistryObject<Block> ZORRO_PLANKS = REGISTRY.register("zorro_planks", () -> new ZorroPlanksBlock());
	public static final RegistryObject<Block> BOREA_TRAPDOOR = REGISTRY.register("borea_trapdoor", () -> new BoreaTrapdoorBlock());
	public static final RegistryObject<Block> ZORRO_LEAVES = REGISTRY.register("zorro_leaves", () -> new ZorroLeavesBlock());
	public static final RegistryObject<Block> ZORRO_STAIRS = REGISTRY.register("zorro_stairs", () -> new ZorroStairsBlock());
	public static final RegistryObject<Block> ZORRO_SLAB = REGISTRY.register("zorro_slab", () -> new ZorroSlabBlock());
	public static final RegistryObject<Block> ZORRO_FENCE = REGISTRY.register("zorro_fence", () -> new ZorroFenceBlock());
	public static final RegistryObject<Block> ZORRO_FENCE_GATE = REGISTRY.register("zorro_fence_gate", () -> new ZorroFenceGateBlock());
	public static final RegistryObject<Block> ZORRO_PRESSURE_PLATE = REGISTRY.register("zorro_pressure_plate", () -> new ZorroPressurePlateBlock());
	public static final RegistryObject<Block> ZORRO_BUTTON = REGISTRY.register("zorro_button", () -> new ZorroButtonBlock());
	public static final RegistryObject<Block> FLOWERING_ZORRO_LEAVES = REGISTRY.register("flowering_zorro_leaves",
			() -> new FloweringZorroLeavesBlock());
	public static final RegistryObject<Block> ZORRO_DOOR = REGISTRY.register("zorro_door", () -> new ZorroDoorBlock());
	public static final RegistryObject<Block> ZORRO_TRAPDOOR = REGISTRY.register("zorro_trapdoor", () -> new ZorroTrapdoorBlock());
	public static final RegistryObject<Block> LUMINESCENT_LODE = REGISTRY.register("luminescent_lode", () -> new LuminescentLodeBlock());
}
