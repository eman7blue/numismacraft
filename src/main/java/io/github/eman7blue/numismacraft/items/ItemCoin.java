package io.github.eman7blue.numismacraft.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import java.util.List;

public class ItemCoin extends Item {

    public ItemCoin(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        NbtCompound nbtCompound = itemStack.getNbt();
        if (nbtCompound != null) {
            int year = nbtCompound.getInt("year");
            String mint = nbtCompound.getString("mint");
            String design = nbtCompound.getString("design");
            tooltip.add(new TranslatableText("item.numismacraft.coin.tooltip", design, year));
        }


    }

}
