package net.mcreator.atmosphere.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.atmosphere.entity.RayvenEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class RayvenModelProcedure extends AnimatedGeoModel<RayvenEntity> {
	@Override
	public ResourceLocation getAnimationResource(RayvenEntity entity) {
		return new ResourceLocation("atmosphere", "animations/rayven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RayvenEntity entity) {
		return new ResourceLocation("atmosphere", "geo/rayven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RayvenEntity entity) {
		return new ResourceLocation("atmosphere", "textures/entities/rayven.png");
		/**
		}
		@Override
		public void setCustomAnimations(RayvenEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
