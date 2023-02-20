
package net.mcreator.atmosphere.client.renderer;

public class CroakerRenderer extends GeoEntityRenderer<CroakerEntity> {
	public CroakerRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new CroakerModelProcedure());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(CroakerEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

}
