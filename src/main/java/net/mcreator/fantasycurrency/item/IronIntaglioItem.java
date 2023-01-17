
package net.mcreator.fantasycurrency.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.fantasycurrency.init.FantasyCurrencyModTabs;

public class IronIntaglioItem extends Item {
	public IronIntaglioItem() {
		super(new Item.Properties().tab(FantasyCurrencyModTabs.TAB_FANTASY_CURRENCY).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}
}
