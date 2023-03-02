package net.mcreator.atmosphere.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.atmosphere.item.ScrollOnAStickItem;

public class ScrollOnAStickRightclickedProcedure {
	public static void execute(ItemStack itemstack) {
		((ScrollOnAStickItem) itemstack.getItem()).animationprocedure = "spellcast";
	}
}
