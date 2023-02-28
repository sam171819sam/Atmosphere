package net.mcreator.atmosphere.item.renderer;

public class ScrollOnAStickItemRenderer extends GeoItemRenderer<ScrollOnAStickItem> {
	public ScrollOnAStickItemRenderer() {
		super(new ScrollOnAStickItemModel());
	}

	@Override
	public RenderType getRenderType(ScrollOnAStickItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource,
			VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}