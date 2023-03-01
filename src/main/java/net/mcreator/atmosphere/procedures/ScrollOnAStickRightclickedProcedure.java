package net.mcreator.atmosphere.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ScrollOnAStickRightclickedProcedure {
	public static void execute(ItemStack itemstack) {
		((ScrollOnAStickItem) itemstack.getItem()).animationprocedure = "spellcast";
	}
}
