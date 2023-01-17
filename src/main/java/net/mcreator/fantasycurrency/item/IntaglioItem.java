
package net.mcreator.fantasycurrency.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.fantasycurrency.init.FantasyCurrencyModTabs;

public class IntaglioItem extends Item {
	public IntaglioItem() {
		super(new Item.Properties().tab(FantasyCurrencyModTabs.TAB_FANTASY_CURRENCY).stacksTo(1).rarity(Rarity.EPIC));
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
