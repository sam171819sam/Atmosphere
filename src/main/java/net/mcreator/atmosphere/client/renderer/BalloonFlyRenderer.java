
package net.mcreator.atmosphere.client.renderer;

public class BalloonFlyRenderer extends MobRenderer<BalloonFlyEntity, ChickenModel<BalloonFlyEntity>> {

	public BalloonFlyRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0f);

	}

	@Override
	public ResourceLocation getTextureLocation(BalloonFlyEntity entity) {
		return new ResourceLocation("atmosphere:textures/entities/balloonfly.png");
	}

}
