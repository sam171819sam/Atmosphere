package net.mcreator.atmosphere.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.atmosphere.entity.SecureShieldEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class SecureShieldModelProcedure extends AnimatedGeoModel<SecureShieldEntity> {
	@Override
	public ResourceLocation getAnimationResource(SecureShieldEntity entity) {
		return new ResourceLocation("atmosphere", "animations/secure_shield.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SecureShieldEntity entity) {
		return new ResourceLocation("atmosphere", "geo/secure_shield.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SecureShieldEntity entity) {
		return new ResourceLocation("atmosphere", "textures/entities/secure_shield.png");
		/**
		}
		@Override
		public void setCustomAnimations(SecureShieldEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
