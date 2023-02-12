package net.mcreator.atmosphere.block.listener;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.atmosphere.block.renderer.BlosoreaFlowerTileRenderer;
import net.mcreator.atmosphere.block.registry.TileRegistry;
import net.mcreator.atmosphere.block.registry.DisplayRegistry;
import net.mcreator.atmosphere.AtmosphereMod;

@Mod.EventBusSubscriber(modid = AtmosphereMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListener {
	@SubscribeEvent
	public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(TileRegistry.BLOSOREA_FLOWER.get(), BlosoreaFlowerTileRenderer::new);
	}

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			TileRegistry.TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
			DisplayRegistry.DISPLAY.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}
}
