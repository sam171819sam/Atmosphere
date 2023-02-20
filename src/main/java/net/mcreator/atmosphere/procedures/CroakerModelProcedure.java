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
public class CroakerModelProcedure extends AnimatedGeoModel<CroakerEntity> {
	@Override
	public ResourceLocation getAnimationResource(CroakerEntity entity) {
		return new ResourceLocation("atmosphere", "animations/croaker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CroakerEntity entity) {
		return new ResourceLocation("atmosphere", "geo/croaker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CroakerEntity entity) {
		return new ResourceLocation("atmosphere", "textures/entities/croaker.png");
		/**
		}
		@Override
		public void setCustomAnimations(CroakerEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
