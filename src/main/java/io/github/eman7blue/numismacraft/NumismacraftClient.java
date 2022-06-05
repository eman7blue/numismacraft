package io.github.eman7blue.numismacraft;

import io.github.eman7blue.numismacraft.blockentity.inventory.CoinBagGui;
import io.github.eman7blue.numismacraft.client.gui.CoinBagScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class NumismacraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.<CoinBagGui, CoinBagScreen>register(Numismacraft.COIN_BAG_SCREEN_HANDLER, (gui, inventory, title) -> new CoinBagScreen(gui, inventory.player, title));
    }
}
