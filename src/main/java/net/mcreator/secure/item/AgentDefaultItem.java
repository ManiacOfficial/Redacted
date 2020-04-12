
package net.mcreator.secure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.secure.RedactedBySteveOSModdingElements;

@RedactedBySteveOSModdingElements.ModElement.Tag
public class AgentDefaultItem extends RedactedBySteveOSModdingElements.ModElement {
	@ObjectHolder("secure:agentdefault")
	public static final Item block = null;
	public AgentDefaultItem(RedactedBySteveOSModdingElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, RedactedBySteveOSModdingElements.sounds.get(new ResourceLocation("secure:agentdefault")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("agentdefault");
		}
	}
}
