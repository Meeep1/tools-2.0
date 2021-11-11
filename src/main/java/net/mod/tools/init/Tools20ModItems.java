
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thepinkdimenstion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.thepinkdimenstion.item.EmeraldswordItem;
import net.mcreator.thepinkdimenstion.item.EmeraldarmorItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Tools20ModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item EMERALDARMOR_HELMET = register(new EmeraldarmorItem.Helmet());
	public static final Item EMERALDARMOR_CHESTPLATE = register(new EmeraldarmorItem.Chestplate());
	public static final Item EMERALDARMOR_LEGGINGS = register(new EmeraldarmorItem.Leggings());
	public static final Item EMERALDARMOR_BOOTS = register(new EmeraldarmorItem.Boots());
	public static final Item EMERALDSWORD = register(new EmeraldswordItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
