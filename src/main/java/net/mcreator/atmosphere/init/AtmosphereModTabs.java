
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.atmosphere.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AtmosphereModTabs {
	public static CreativeModeTab TAB_ATMUSPEHERE;

	public static void load() {
		TAB_ATMUSPEHERE = new CreativeModeTab("tabatmuspehere") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AtmosphereModItems.LUMINUM_INGOT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
