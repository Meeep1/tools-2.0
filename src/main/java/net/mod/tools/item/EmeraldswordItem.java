
package net.mcreator.thepinkdimenstion.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.thepinkdimenstion.init.Tools20ModTabs;

public class EmeraldswordItem extends SwordItem {
	public EmeraldswordItem() {
		super(new Tier() {
			public int getUses() {
				return 1900;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().tab(Tools20ModTabs.TAB_TOOLS_2));
		setRegistryName("emeraldsword");
	}
}
