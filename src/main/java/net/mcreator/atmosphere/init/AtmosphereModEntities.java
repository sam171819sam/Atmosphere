
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atmosphere.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.atmosphere.entity.SaintEntity;
import net.mcreator.atmosphere.entity.RayvenEntity;
import net.mcreator.atmosphere.entity.BalloonFlyEntity;
import net.mcreator.atmosphere.AtmosphereMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AtmosphereModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AtmosphereMod.MODID);
	public static final RegistryObject<EntityType<BalloonFlyEntity>> BALLOON_FLY = register("balloon_fly",
			EntityType.Builder.<BalloonFlyEntity>of(BalloonFlyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BalloonFlyEntity::new)

					.sized(1.3f, 1.3f));
	public static final RegistryObject<EntityType<SaintEntity>> SAINT = register("saint",
			EntityType.Builder.<SaintEntity>of(SaintEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SaintEntity::new).fireImmune().sized(0.7999999999999999f, 3.8f));
	public static final RegistryObject<EntityType<RayvenEntity>> RAYVEN = register("rayven",
			EntityType.Builder.<RayvenEntity>of(RayvenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RayvenEntity::new)

					.sized(4.3999999999999995f, 1.4f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BalloonFlyEntity.init();
			SaintEntity.init();
			RayvenEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BALLOON_FLY.get(), BalloonFlyEntity.createAttributes().build());
		event.put(SAINT.get(), SaintEntity.createAttributes().build());
		event.put(RAYVEN.get(), RayvenEntity.createAttributes().build());
	}
}
