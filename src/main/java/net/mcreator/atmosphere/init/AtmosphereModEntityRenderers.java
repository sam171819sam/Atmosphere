
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atmosphere.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.atmosphere.client.renderer.SaintRenderer;
import net.mcreator.atmosphere.client.renderer.RayvenRenderer;
import net.mcreator.atmosphere.client.renderer.BalloonFlyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AtmosphereModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AtmosphereModEntities.BALLOON_FLY.get(), BalloonFlyRenderer::new);
		event.registerEntityRenderer(AtmosphereModEntities.SAINT.get(), SaintRenderer::new);
		event.registerEntityRenderer(AtmosphereModEntities.RAYVEN.get(), RayvenRenderer::new);
	}
}
