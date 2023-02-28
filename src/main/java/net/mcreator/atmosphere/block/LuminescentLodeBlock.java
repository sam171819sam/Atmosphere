
package net.mcreator.atmosphere.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class LuminescentLodeBlock extends Block

{

	public LuminescentLodeBlock() {
		super(BlockBehaviour.Properties.of(Material.FROGLIGHT).sound(SoundType.FROGLIGHT).strength(1f, 10f).lightLevel(s -> 15)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));

	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
