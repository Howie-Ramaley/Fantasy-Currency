
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fantasycurrency.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.fantasycurrency.block.TestBlock;
import net.mcreator.fantasycurrency.FantasyCurrencyMod;

public class FantasyCurrencyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FantasyCurrencyMod.MODID);
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
}
