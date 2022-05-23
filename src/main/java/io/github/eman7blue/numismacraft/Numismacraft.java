package io.github.eman7blue.numismacraft;

import io.github.eman7blue.numismacraft.blocks.BlocksRegistry;
import io.github.eman7blue.numismacraft.items.DefModItemGroup;
import io.github.eman7blue.numismacraft.items.ItemsRegistry;
import io.github.eman7blue.numismacraft.loot.LootTableRegistry;
import io.github.eman7blue.numismacraft.loot.RandomCoinLoot;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Numismacraft implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Numismacraft");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		DefModItemGroup.init();
		ItemsRegistry.init();
		BlocksRegistry.init();
		LootTableRegistry.init();
		RandomCoinLoot.init();
		LOGGER.info("Thank you for playing with Numismacraft (originally called Coin Mod)");
	}
}
