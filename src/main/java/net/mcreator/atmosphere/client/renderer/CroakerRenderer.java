
package net.mcreator.atmosphere.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.atmosphere.procedures.CroakerModelProcedure;
import net.mcreator.atmosphere.entity.CroakerEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

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
