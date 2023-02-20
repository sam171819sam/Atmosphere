package net.mcreator.atmosphere.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class WindModelProcedure extends AnimatedGeoModel<WindEntity> {
	@Override
	public ResourceLocation getAnimationResource(WindEntity entity) {
		return new ResourceLocation("atmosphere", "animations/wind.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WindEntity entity) {
		return new ResourceLocation("atmosphere", "geo/wind.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WindEntity entity) {
		return new ResourceLocation("atmosphere", "textures/entities/wind.png");
		/**
		}
		@Override
		public void setCustomAnimations(WindEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
		/** **/
	}
}
