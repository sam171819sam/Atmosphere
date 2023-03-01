
package net.mcreator.atmosphere.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class ShatterSwordItem extends SwordItem {
	public ShatterSwordItem() {
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
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
