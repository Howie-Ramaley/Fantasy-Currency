
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fantasycurrency.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FantasyCurrencyModTabs {
	public static CreativeModeTab TAB_FANTASY_CURRENCY;

	public static void load() {
		TAB_FANTASY_CURRENCY = new CreativeModeTab("tabfantasy_currency") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FantasyCurrencyModItems.COPPER_COIN.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
