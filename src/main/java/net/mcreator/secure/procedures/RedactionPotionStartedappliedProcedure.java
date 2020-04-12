package net.mcreator.secure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.secure.RedactedBySteveOSModdingElements;

@RedactedBySteveOSModdingElements.ModElement.Tag
public class RedactionPotionStartedappliedProcedure extends RedactedBySteveOSModdingElements.ModElement {
	public RedactionPotionStartedappliedProcedure(RedactedBySteveOSModdingElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RedactionPotionStartedapplied!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RedactionPotionStartedapplied!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RedactionPotionStartedapplied!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RedactionPotionStartedapplied!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((PlayerEntity) null, x, y, z,
				(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("secure:itemactivation")),
				SoundCategory.NEUTRAL, (float) 2, (float) 1);
	}
}
