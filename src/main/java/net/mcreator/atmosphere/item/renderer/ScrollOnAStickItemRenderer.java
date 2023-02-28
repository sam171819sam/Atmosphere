package net.mcreator.atmosphere.item.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.atmosphere.item.model.ScrollOnAStickItemModel;
import net.mcreator.atmosphere.item.ScrollOnAStickItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

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
