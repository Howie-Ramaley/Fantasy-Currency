
package net.mcreator.fantasycurrency.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.fantasycurrency.init.FantasyCurrencyModTabs;

public class GoldCoinItem extends Item {
	public GoldCoinItem() {
		super(new Item.Properties().tab(FantasyCurrencyModTabs.TAB_FANTASY_CURRENCY).stacksTo(50).rarity(Rarity.COMMON));
	}
}
