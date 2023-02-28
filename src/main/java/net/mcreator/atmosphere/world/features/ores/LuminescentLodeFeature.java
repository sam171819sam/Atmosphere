
package net.mcreator.atmosphere.world.features.ores;

public class LuminescentLodeFeature extends OreFeature {

	public static LuminescentLodeFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new LuminescentLodeFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("atmosphere:luminescent_lode", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.AIR.defaultBlockState()),
						AtmosphereModBlocks.LUMINESCENT_LODE.get().defaultBlockState())), 28));
		PLACED_FEATURE = PlacementUtils.register("atmosphere:luminescent_lode", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(28), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(170)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("atmosphere:atmosphere_dimension")));

	public LuminescentLodeFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!

		LuminescentLodeAdditionalGenerationConditionProcedure.execute(world, x, y, z))
			return false;

		return super.place(context);
	}

}
