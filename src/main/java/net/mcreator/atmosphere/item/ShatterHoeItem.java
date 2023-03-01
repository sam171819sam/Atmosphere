
package net.mcreator.atmosphere.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class ShatterHoeItem extends HoeItem {
	public ShatterHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 122;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 8;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AtmosphereModBlocks.COBBLED_SHATTER_STONE.get()));
			}
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
