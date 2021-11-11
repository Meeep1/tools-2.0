
package net.mcreator.thepinkdimenstion.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.thepinkdimenstion.init.Tools20ModTabs;

public abstract class EmeraldarmorItem extends ArmorItem {
	public EmeraldarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 35;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "emeraldarmor";
			}

			@Override
			public float getToughness() {
				return 2.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends EmeraldarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(Tools20ModTabs.TAB_TOOLS_2));
			setRegistryName("emeraldarmor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tools_2_0:textures/models/armor/emerald_armor_layer_1.png";
		}
	}

	public static class Chestplate extends EmeraldarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(Tools20ModTabs.TAB_TOOLS_2));
			setRegistryName("emeraldarmor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tools_2_0:textures/models/armor/emerald_armor_layer_1.png";
		}
	}

	public static class Leggings extends EmeraldarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(Tools20ModTabs.TAB_TOOLS_2));
			setRegistryName("emeraldarmor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tools_2_0:textures/models/armor/emerald_armor_layer_2.png";
		}
	}

	public static class Boots extends EmeraldarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(Tools20ModTabs.TAB_TOOLS_2));
			setRegistryName("emeraldarmor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tools_2_0:textures/models/armor/emerald_armor_layer_1.png";
		}
	}
}
