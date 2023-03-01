
package net.mcreator.atmosphere.client.renderer;

public class FireburstRenderer extends GeoEntityRenderer<FireburstEntity> {
	public FireburstRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FireburstModelProcedure());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(FireburstEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

}
