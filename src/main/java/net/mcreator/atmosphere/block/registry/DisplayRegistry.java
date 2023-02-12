package net.mcreator.atmosphere.block.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.atmosphere.init.AtmosphereModBlocks;
import net.mcreator.atmosphere.block.display.BlosoreaFlowerDisplayItem;
import net.mcreator.atmosphere.AtmosphereMod;

public class DisplayRegistry {
	public static final DeferredRegister<Item> DISPLAY = DeferredRegister.create(ForgeRegistries.ITEMS, AtmosphereMod.MODID);
	public static final RegistryObject<Item> BLOSOREA_FLOWER_ITEM = DISPLAY.register("blosorea_flower_item",
			() -> new BlosoreaFlowerDisplayItem(AtmosphereModBlocks.BLOSOREA_FLOWER.get(), new Item.Properties().tab(null)));
}
