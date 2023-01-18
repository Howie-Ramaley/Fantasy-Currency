
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fantasycurrency.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.fantasycurrency.item.IronIntaglioItem;
import net.mcreator.fantasycurrency.item.IronCoinItem;
import net.mcreator.fantasycurrency.item.GoldIntaglioItem;
import net.mcreator.fantasycurrency.item.GoldCoinItem;
import net.mcreator.fantasycurrency.item.CopperIntaglioItem;
import net.mcreator.fantasycurrency.item.CopperCoinItem;
import net.mcreator.fantasycurrency.FantasyCurrencyMod;

public class FantasyCurrencyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FantasyCurrencyMod.MODID);
	public static final RegistryObject<Item> COPPER_COIN = REGISTRY.register("copper_coin", () -> new CopperCoinItem());
	public static final RegistryObject<Item> IRON_COIN = REGISTRY.register("iron_coin", () -> new IronCoinItem());
	public static final RegistryObject<Item> GOLD_COIN = REGISTRY.register("gold_coin", () -> new GoldCoinItem());
	public static final RegistryObject<Item> COPPER_INTAGLIO = REGISTRY.register("copper_intaglio", () -> new CopperIntaglioItem());
	public static final RegistryObject<Item> GOLD_INTAGLIO = REGISTRY.register("gold_intaglio", () -> new GoldIntaglioItem());
	public static final RegistryObject<Item> IRON_INTAGLIO = REGISTRY.register("iron_intaglio", () -> new IronIntaglioItem());
}
