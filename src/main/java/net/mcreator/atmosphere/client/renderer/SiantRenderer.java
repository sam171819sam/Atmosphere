
package net.mcreator.atmosphere.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.atmosphere.entity.SiantEntity;
import net.mcreator.atmosphere.client.model.ModelSaint;

public class SiantRenderer extends MobRenderer<SiantEntity, ModelSaint<SiantEntity>> {
	public SiantRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSaint(context.bakeLayer(ModelSaint.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SiantEntity, ModelSaint<SiantEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("atmosphere:textures/entities/glow_saint.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SiantEntity entity) {
		return new ResourceLocation("atmosphere:textures/entities/saint.png");
	}
}
