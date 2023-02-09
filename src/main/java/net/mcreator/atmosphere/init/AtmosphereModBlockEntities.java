
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atmosphere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.atmosphere.block.entity.WitchPoolBlockEntity;
import net.mcreator.atmosphere.block.entity.WitchCrushingStoneBlockEntity;
import net.mcreator.atmosphere.AtmosphereMod;

public class AtmosphereModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			AtmosphereMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> WITCH_POOL = register("witch_pool", AtmosphereModBlocks.WITCH_POOL,
			WitchPoolBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WITCH_CRUSHING_STONE = register("witch_crushing_stone",
			AtmosphereModBlocks.WITCH_CRUSHING_STONE, WitchCrushingStoneBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
