
package net.mcreator.atmosphere.world.features;

public class BoreaTree3Feature extends Feature<NoneFeatureConfiguration> {
	public static BoreaTree3Feature FEATURE = null;
	public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new BoreaTree3Feature();
		CONFIGURED_FEATURE = FeatureUtils.register("atmosphere:borea_tree_3", FEATURE, FeatureConfiguration.NONE);
		PLACED_FEATURE = PlacementUtils.register("atmosphere:borea_tree_3", CONFIGURED_FEATURE, List.of());
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("atmosphere:atmosphere_dimension")));
	private final List<Block> base_blocks;
	private StructureTemplate template = null;

	public BoreaTree3Feature() {
		super(NoneFeatureConfiguration.CODEC);
		base_blocks = List.of(AtmosphereModBlocks.HUMUS_GRASS_BLOCK.get());
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("atmosphere", "borea_tree1"));
		if (template == null)
			return false;
		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 1000000) {
			int count = context.random().nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
				if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
					continue;
				BlockPos spawnTo = new BlockPos(i + -6, j + -2, k + -6);
				if (template.placeInWorld(
						context.level(), spawnTo, spawnTo, new StructurePlaceSettings().setMirror(Mirror.NONE).setRotation(Rotation.NONE)
								.setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false),
						context.random(), 2)) {
					anyPlaced = true;
				}
			}
		}
		return anyPlaced;
	}
}