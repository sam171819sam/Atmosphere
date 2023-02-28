package net.mcreator.atmosphere.item.model;

public class ScrollOnAStickItemModel extends AnimatedGeoModel<ScrollOnAStickItem> {
	@Override
	public ResourceLocation getAnimationResource(ScrollOnAStickItem animatable) {
		return new ResourceLocation("atmosphere", "animations/scroll_on_a_stick.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScrollOnAStickItem animatable) {
		return new ResourceLocation("atmosphere", "geo/scroll_on_a_stick.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScrollOnAStickItem animatable) {
		return new ResourceLocation("atmosphere", "textures/items/scroll_on_a_stick.png");
	}
}