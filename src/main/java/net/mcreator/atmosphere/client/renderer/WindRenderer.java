
package net.mcreator.atmosphere.client.renderer;

public class WindRenderer extends GeoEntityRenderer<WindEntity> {
	public WindRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new WindModelProcedure());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(WindEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	protected float getDeathMaxRotation(WindEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
