
package net.mcreator.atmosphere.client.renderer;

public class SaintRenderer extends MobRenderer<SaintEntity, ChickenModel<SaintEntity>> {

	public SaintRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.2f);

	}

	@Override
	public ResourceLocation getTextureLocation(SaintEntity entity) {
		return new ResourceLocation("atmosphere:textures/entities/saint.png");
	}

}
