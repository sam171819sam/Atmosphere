
package net.mcreator.atmosphere.world.features.ores;

public class LuminumOreFeature extends OreFeature {

	public static LuminumOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new LuminumOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("atmosphere:luminum_ore", FEATURE,
				new OreConfiguration(
						List.of(OreConfiguration.target(new BlockStateMatchTest(AtmosphereModBlocks.SHATTER_STONE.get().defaultBlockState()),
								AtmosphereModBlocks.LUMINUM_ORE.get().defaultBlockState())),
						8));
		PLACED_FEATURE = PlacementUtils.register("atmosphere:luminum_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(9), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(200)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("atmosphere:deleted_mod_element")));

	public LuminumOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

}
