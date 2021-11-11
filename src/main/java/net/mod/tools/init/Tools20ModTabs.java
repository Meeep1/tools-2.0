
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thepinkdimenstion.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class Tools20ModTabs {
	public static CreativeModeTab TAB_TOOLS_2;

	public static void load() {
		TAB_TOOLS_2 = new CreativeModeTab("tabtools_2") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Tools20ModItems.EMERALDARMOR_CHESTPLATE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
