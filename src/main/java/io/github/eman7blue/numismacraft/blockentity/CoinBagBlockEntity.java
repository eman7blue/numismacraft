package io.github.eman7blue.numismacraft.blockentity;

import io.github.eman7blue.numismacraft.block.BlocksRegistry;
import io.github.eman7blue.numismacraft.blockentity.inventory.CoinBagGui;
import io.github.eman7blue.numismacraft.blockentity.inventory.CoinBagInventory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;

public class CoinBagBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, CoinBagInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(135, ItemStack.EMPTY);

    public CoinBagBlockEntity(BlockPos pos, BlockState state) {
        super(BlocksRegistry.COIN_BAG_BLOCK_ENTITY, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new CoinBagGui(syncId, playerInventory, ScreenHandlerContext.create(world, pos));
    }

    @Override
    public Text getDisplayName() {
        return Text.of(getCachedState().getBlock().getTranslationKey());
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, this.inventory);
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, this.inventory);
    }


}
