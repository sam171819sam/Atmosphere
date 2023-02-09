package net.mcreator.atmosphere.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.atmosphere.entity.BalloonFlyEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class BalloonFlyModelProcedure extends AnimatedGeoModel<BalloonFlyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BalloonFlyEntity entity) {
		return new ResourceLocation("atmosphere", "animations/balloonfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonFlyEntity entity) {
		return new ResourceLocation("atmosphere", "geo/balloonfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonFlyEntity entity) {
		return new ResourceLocation("atmosphere", "textures/entities/balloonfly.png");
		/**
		}
		@Override
		public void setCustomAnimations(BalloonFlyEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
