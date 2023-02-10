
package net.mcreator.atmosphere.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.atmosphere.procedures.RayvenModelProcedure;
import net.mcreator.atmosphere.entity.RayvenEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RayvenRenderer extends GeoEntityRenderer<RayvenEntity> {
	public RayvenRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new RayvenModelProcedure());
		this.shadowRadius = 0.6f;
	}

	@Override
	public RenderType getRenderType(RayvenEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	protected float getDeathMaxRotation(RayvenEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
