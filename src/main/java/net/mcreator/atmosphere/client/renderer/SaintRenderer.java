
package net.mcreator.atmosphere.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.atmosphere.procedures.SaintModelProcedure;
import net.mcreator.atmosphere.entity.SaintEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SaintRenderer extends GeoEntityRenderer<SaintEntity> {
	public SaintRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SaintModelProcedure());
		this.shadowRadius = 0.2f;
	}

	@Override
	public RenderType getRenderType(SaintEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	protected float getDeathMaxRotation(SaintEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
