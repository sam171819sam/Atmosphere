
package net.mcreator.atmosphere.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.atmosphere.procedures.BalloonFlyModelProcedure;
import net.mcreator.atmosphere.entity.BalloonFlyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BalloonFlyRenderer extends GeoEntityRenderer<BalloonFlyEntity> {
	public BalloonFlyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BalloonFlyModelProcedure());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(BalloonFlyEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	protected float getDeathMaxRotation(BalloonFlyEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
