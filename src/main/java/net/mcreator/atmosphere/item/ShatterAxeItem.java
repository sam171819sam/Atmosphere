
package net.mcreator.atmosphere.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class ShatterAxeItem extends AxeItem {
	public ShatterAxeItem() {
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
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
