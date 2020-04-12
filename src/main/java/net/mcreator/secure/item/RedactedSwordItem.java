
package net.mcreator.secure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.secure.RedactedBySteveOSModdingElements;

@RedactedBySteveOSModdingElements.ModElement.Tag
public class RedactedSwordItem extends RedactedBySteveOSModdingElements.ModElement {
	@ObjectHolder("secure:redactedsword")
	public static final Item block = null;
	public RedactedSwordItem(RedactedBySteveOSModdingElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 50;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 1.35f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -1f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("redactedsword"));
	}
}
