package io.github.eman7blue.numismacraft;

import io.github.eman7blue.numismacraft.block.BlocksRegistry;
import io.github.eman7blue.numismacraft.blockentity.inventory.CoinBagGui;
import io.github.eman7blue.numismacraft.items.DefModItemGroup;
import io.github.eman7blue.numismacraft.items.ItemsRegistry;
import io.github.eman7blue.numismacraft.loot.CoinTables;
import io.github.eman7blue.numismacraft.loot.LootTableRegistry;
import io.github.eman7blue.numismacraft.loot.RandomCoinLoot;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.eman7blue.numismacraft.block.BlocksRegistry.COIN_BAG;

public class Numismacraft implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final Logger LOGGER = LoggerFactory.getLogger("Numismacraft");
	public static final ScreenHandlerType<CoinBagGui> COIN_BAG_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(COIN_BAG, (syncId, inventory) -> new CoinBagGui(syncId, inventory, ScreenHandlerContext.EMPTY));
	@Override
	public void onInitialize() {

		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		DefModItemGroup.init();
		ItemsRegistry.init();
		BlocksRegistry.init();
		CoinTables coinTables = new CoinTables();
		LootTableRegistry.init();
		RandomCoinLoot.init();
		LOGGER.info("Thank you for playing with Numismacraft (originally called Coin Mod)");
	}
}
