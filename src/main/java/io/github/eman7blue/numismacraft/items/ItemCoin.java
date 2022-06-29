package io.github.eman7blue.numismacraft.items;

import io.github.eman7blue.numismacraft.Numismacraft;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
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
            tooltip.add(Text.translatable("item.numismacraft.coin.tooltip_2", year, mint).formatted(Formatting.GRAY));
            int count = 1;
            int TOOLTIP_DESIGN_LENGTH = 32;
            if (design.length() <= TOOLTIP_DESIGN_LENGTH) {
                tooltip.add(Text.translatable("item.numismacraft.coin.tooltip_1_1", design).formatted(Formatting.GRAY));
            } else {
                while (design.length() > TOOLTIP_DESIGN_LENGTH) {
                    String sub = design.substring(0, TOOLTIP_DESIGN_LENGTH);
                    String rem = design.substring(TOOLTIP_DESIGN_LENGTH);
                    rem = sub.substring(sub.lastIndexOf(" ") + 1) + rem;
                    sub = sub.substring(0, sub.lastIndexOf(" "));
                    tooltip.add(Text.translatable("item.numismacraft.coin.tooltip_1_" + count, sub).formatted(Formatting.GRAY));
                    design = rem;
                    count++;
                }
                if(design.length() > 0){
                    tooltip.add(Text.translatable("item.numismacraft.coin.tooltip_1_" + count, design).formatted(Formatting.GRAY));
                }
            }
        }


    }

}
