
package net.mcreator.atmosphere.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class SecureAmuletItem extends Item {

	public SecureAmuletItem() {
		super(new Item.Properties().tab(AtmosphereModTabs.TAB_ATMOSPHERE).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

}
