
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

import net.mcreator.atmosphere.item.RawLuminumItem;
import net.mcreator.atmosphere.item.LuminumIngotItem;
import net.mcreator.atmosphere.item.AmethystPowderItem;
import net.mcreator.atmosphere.AtmosphereMod;

public class AtmosphereModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AtmosphereMod.MODID);
	public static final RegistryObject<Item> LUMINUM_INGOT = REGISTRY.register("luminum_ingot", () -> new LuminumIngotItem());
	public static final RegistryObject<Item> RAW_LUMINUM_BLOCK = block(AtmosphereModBlocks.RAW_LUMINUM_BLOCK, AtmosphereModTabs.TAB_ATMUSPEHERE);
	public static final RegistryObject<Item> LUMINUM_BLOCK = block(AtmosphereModBlocks.LUMINUM_BLOCK, AtmosphereModTabs.TAB_ATMUSPEHERE);
	public static final RegistryObject<Item> RAW_LUMINUM = REGISTRY.register("raw_luminum", () -> new RawLuminumItem());
	public static final RegistryObject<Item> SAINT = REGISTRY.register("saint_spawn_egg",
			() -> new ForgeSpawnEggItem(AtmosphereModEntities.SAINT, -592138, -8082, new Item.Properties().tab(AtmosphereModTabs.TAB_ATMUSPEHERE)));
	public static final RegistryObject<Item> TUB = block(AtmosphereModBlocks.TUB, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WITCH_POOL = block(AtmosphereModBlocks.WITCH_POOL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WITCH_CRUSHING_STONE = block(AtmosphereModBlocks.WITCH_CRUSHING_STONE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> AMETHYST_POWDER = REGISTRY.register("amethyst_powder", () -> new AmethystPowderItem());
	public static final RegistryObject<Item> SHATTER_STONE = block(AtmosphereModBlocks.SHATTER_STONE, AtmosphereModTabs.TAB_ATMUSPEHERE);
	public static final RegistryObject<Item> COBBLED_SHATTER_STONE = block(AtmosphereModBlocks.COBBLED_SHATTER_STONE,
			AtmosphereModTabs.TAB_ATMUSPEHERE);
	public static final RegistryObject<Item> COBBLED_SHATTER_STONE_STAIRS = block(AtmosphereModBlocks.COBBLED_SHATTER_STONE_STAIRS,
			AtmosphereModTabs.TAB_ATMUSPEHERE);
	public static final RegistryObject<Item> COBBLED_SHATTER_STONE_SLAB = block(AtmosphereModBlocks.COBBLED_SHATTER_STONE_SLAB,
			AtmosphereModTabs.TAB_ATMUSPEHERE);
	public static final RegistryObject<Item> COBBLED_SHATTER_STONE_WALL = block(AtmosphereModBlocks.COBBLED_SHATTER_STONE_WALL,
			AtmosphereModTabs.TAB_ATMUSPEHERE);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
