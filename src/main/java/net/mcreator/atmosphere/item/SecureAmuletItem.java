
package net.mcreator.atmosphere.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.atmosphere.init.AtmosphereModTabs;

public class SecureAmuletItem extends Item {
	public SecureAmuletItem() {
		super(new Item.Properties().tab(AtmosphereModTabs.TAB_ATMOSPHERE).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
