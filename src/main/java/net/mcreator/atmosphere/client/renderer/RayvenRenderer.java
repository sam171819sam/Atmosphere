
package net.mcreator.atmosphere.client.renderer;

public class RayvenRenderer extends MobRenderer<RayvenEntity, ChickenModel<RayvenEntity>> {

	public RayvenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.6f);

	}

	@Override
	public ResourceLocation getTextureLocation(RayvenEntity entity) {
		return new ResourceLocation("atmosphere:textures/entities/rayven.png");
	}

}
