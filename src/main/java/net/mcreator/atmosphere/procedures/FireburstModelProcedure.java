package net.mcreator.atmosphere.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.atmosphere.entity.FireburstEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class FireburstModelProcedure extends AnimatedGeoModel<FireburstEntity> {
	@Override
	public ResourceLocation getAnimationResource(FireburstEntity entity) {
		return new ResourceLocation("atmosphere", "animations/fireburst.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FireburstEntity entity) {
		return new ResourceLocation("atmosphere", "geo/fireburst.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FireburstEntity entity) {
		return new ResourceLocation("atmosphere", "textures/entities/fire_burst.png");
		/**
		}
		@Override
		public void setCustomAnimations(FireburstEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
