
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atmosphere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.atmosphere.item.SoftAmuletItem;
import net.mcreator.atmosphere.item.SecureAmuletItem;
import net.mcreator.atmosphere.item.RawLuminumItem;
import net.mcreator.atmosphere.item.LuminumIngotItem;
import net.mcreator.atmosphere.item.FireAmuletItem;
import net.mcreator.atmosphere.item.AtmosphereDimensionItem;
import net.mcreator.atmosphere.AtmosphereMod;

public class AtmosphereModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AtmosphereMod.MODID);
	public static final RegistryObject<Item> LUMINUM_INGOT = REGISTRY.register("luminum_ingot", () -> new LuminumIngotItem());
	public static final RegistryObject<Item> RAW_LUMINUM_BLOCK = block(AtmosphereModBlocks.RAW_LUMINUM_BLOCK, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> LUMINUM_BLOCK = block(AtmosphereModBlocks.LUMINUM_BLOCK, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> RAW_LUMINUM = REGISTRY.register("raw_luminum", () -> new RawLuminumItem());
	public static final RegistryObject<Item> TUB = block(AtmosphereModBlocks.TUB, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WITCH_POOL = block(AtmosphereModBlocks.WITCH_POOL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WITCH_CRUSHING_STONE = block(AtmosphereModBlocks.WITCH_CRUSHING_STONE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BALLOON_FLY = REGISTRY.register("balloon_fly_spawn_egg",
			() -> new ForgeSpawnEggItem(AtmosphereModEntities.BALLOON_FLY, -14396080, -14291271,
					new Item.Properties().tab(AtmosphereModTabs.TAB_ATMOSPHERE)));
	public static final RegistryObject<Item> SAINT = REGISTRY.register("saint_spawn_egg", () -> new ForgeSpawnEggItem(AtmosphereModEntities.SAINT,
			-2368549, -3362747, new Item.Properties().tab(AtmosphereModTabs.TAB_ATMOSPHERE)));
	public static final RegistryObject<Item> RAYVEN = REGISTRY.register("rayven_spawn_egg", () -> new ForgeSpawnEggItem(AtmosphereModEntities.RAYVEN,
			-14121614, -6322895, new Item.Properties().tab(AtmosphereModTabs.TAB_ATMOSPHERE)));
	public static final RegistryObject<Item> SHATTER_STONE = block(AtmosphereModBlocks.SHATTER_STONE, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> COBBLED_SHATTER_STONE = block(AtmosphereModBlocks.COBBLED_SHATTER_STONE,
			AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> FIRE_AMULET = REGISTRY.register("fire_amulet", () -> new FireAmuletItem());
	public static final RegistryObject<Item> SOFT_AMULET = REGISTRY.register("soft_amulet", () -> new SoftAmuletItem());
	public static final RegistryObject<Item> SECURE_AMULET = REGISTRY.register("secure_amulet", () -> new SecureAmuletItem());
	public static final RegistryObject<Item> GUSTY_GRASS = block(AtmosphereModBlocks.GUSTY_GRASS, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> ATMOSPHERE_DIMENSION = REGISTRY.register("atmosphere_dimension", () -> new AtmosphereDimensionItem());
	public static final RegistryObject<Item> LUMINUM_DUST = block(AtmosphereModBlocks.LUMINUM_DUST, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> DUSTY_GLOWSTONE = block(AtmosphereModBlocks.DUSTY_GLOWSTONE, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> LUMINUM_ORE = block(AtmosphereModBlocks.LUMINUM_ORE, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> BLOSOREA_FLOWER = block(AtmosphereModBlocks.BLOSOREA_FLOWER, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> BOREA_WOOD = block(AtmosphereModBlocks.BOREA_WOOD, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> BOREA_LOG = block(AtmosphereModBlocks.BOREA_LOG, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> BOREA_PLANKS = block(AtmosphereModBlocks.BOREA_PLANKS, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> BOREA_LEAVES = block(AtmosphereModBlocks.BOREA_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BOREA_STAIRS = block(AtmosphereModBlocks.BOREA_STAIRS, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> BOREA_SLAB = block(AtmosphereModBlocks.BOREA_SLAB, AtmosphereModTabs.TAB_ATMOSPHERE);
	public static final RegistryObject<Item> BOREA_FENCE = block(AtmosphereModBlocks.BOREA_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BOREA_FENCE_GATE = block(AtmosphereModBlocks.BOREA_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BOREA_PRESSURE_PLATE = block(AtmosphereModBlocks.BOREA_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BOREA_BUTTON = block(AtmosphereModBlocks.BOREA_BUTTON, AtmosphereModTabs.TAB_ATMOSPHERE);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
