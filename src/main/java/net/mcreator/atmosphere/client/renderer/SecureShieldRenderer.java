
package net.mcreator.atmosphere.client.renderer;

public class SecureShieldRenderer extends GeoEntityRenderer<SecureShieldEntity> {
	public SecureShieldRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SecureShieldModelProcedure());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(SecureShieldEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	protected float getDeathMaxRotation(SecureShieldEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
