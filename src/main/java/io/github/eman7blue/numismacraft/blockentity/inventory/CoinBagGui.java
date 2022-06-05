package io.github.eman7blue.numismacraft.blockentity.inventory;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.eman7blue.numismacraft.Numismacraft;
import io.github.eman7blue.numismacraft.items.ItemsRegistry;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandlerContext;

import java.util.function.Predicate;

public class CoinBagGui extends SyncedGuiDescription {
    private static final int INVENTORY_SIZE = 135;
    Inventory inventory;

    public CoinBagGui(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(Numismacraft.COIN_BAG_SCREEN_HANDLER, syncId, playerInventory, getBlockInventory(context, INVENTORY_SIZE), getBlockPropertyDelegate(context));
        inventory = blockInventory;
        WGridPanel root = new WGridPanel();
        setRootPanel(root);

        WItemSlot itemSlot;
        int count = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 15; j++) {
                itemSlot = WItemSlot.of(inventory, count);
                Predicate<ItemStack> filter = stack -> (ItemsRegistry.COINS.contains(stack.getItem()));
                itemSlot.setFilter(filter);
                root.add(itemSlot, j, i);
                count++;
            }
        }
        root.add(this.createPlayerInventoryPanel(), 3, 9);
        root.setInsets(Insets.ROOT_PANEL);
        root.validate(this);
    }
}
