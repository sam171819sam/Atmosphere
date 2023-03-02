
package net.mcreator.atmosphere.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class StardustItem extends Item {

	public StardustItem() {
		super(new Item.Properties().tab(AtmosphereModTabs.TAB_ATMOSPHERE).stacksTo(64).rarity(Rarity.COMMON));
	}

}
