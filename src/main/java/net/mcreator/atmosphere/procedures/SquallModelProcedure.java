package net.mcreator.atmosphere.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.atmosphere.entity.SquallEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class SquallModelProcedure extends AnimatedGeoModel<SquallEntity> {
	@Override
	public ResourceLocation getAnimationResource(SquallEntity entity) {
		return new ResourceLocation("atmosphere", "animations/squall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SquallEntity entity) {
		return new ResourceLocation("atmosphere", "geo/squall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SquallEntity entity) {
		return new ResourceLocation("atmosphere", "textures/entities/squall.png");
		/**
		}
		@Override
		public void setCustomAnimations(SquallEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
