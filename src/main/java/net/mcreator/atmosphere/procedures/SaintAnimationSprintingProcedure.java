package net.mcreator.atmosphere.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.atmosphere.entity.SaintEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SaintAnimationSprintingProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.getAbilities().getWalkingSpeed() : 0) >= 1.4) {
			if (entity instanceof SaintEntity) {
				((SaintEntity) entity).animationprocedure = "sprint";
			}
		}
	}
}
