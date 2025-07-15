/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sephimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.sephimod.item.EvolisItem;
import net.mcreator.sephimod.item.BerryItem;
import net.mcreator.sephimod.SephimodMod;

public class SephimodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SephimodMod.MODID);
	public static final RegistryObject<Item> EVOLIS = REGISTRY.register("evolis", () -> new EvolisItem());
	public static final RegistryObject<Item> BERRY = REGISTRY.register("berry", () -> new BerryItem());
	// Start of user code block custom items
	// End of user code block custom items
}