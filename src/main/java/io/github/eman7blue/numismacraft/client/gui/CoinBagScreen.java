package io.github.eman7blue.numismacraft.client.gui;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import io.github.eman7blue.numismacraft.blockentity.inventory.CoinBagGui;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

public class CoinBagScreen extends CottonInventoryScreen<CoinBagGui> {
    public CoinBagScreen(CoinBagGui gui, PlayerEntity player, Text title) {
        super(gui, player, title);
    }
}
