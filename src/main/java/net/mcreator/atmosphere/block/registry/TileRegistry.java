package net.mcreator.atmosphere.block.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.mcreator.atmosphere.init.AtmosphereModBlocks;
import net.mcreator.atmosphere.block.entity.BlosoreaFlowerTileEntity;
import net.mcreator.atmosphere.AtmosphereMod;

public class TileRegistry {
	public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AtmosphereMod.MODID);
	public static final RegistryObject<BlockEntityType<BlosoreaFlowerTileEntity>> BLOSOREA_FLOWER = TILES.register("blosorea_flower_block",
			() -> BlockEntityType.Builder.of(BlosoreaFlowerTileEntity::new, AtmosphereModBlocks.BLOSOREA_FLOWER.get()).build(null));
}
