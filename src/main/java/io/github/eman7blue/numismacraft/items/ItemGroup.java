package io.github.eman7blue.numismacraft.items;

import io.github.eman7blue.numismacraft.block.BlocksRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

// delete this class!
public class ItemGroup {
    public static final net.minecraft.item.ItemGroup NUMISMACRAFT_ITEMS = FabricItemGroupBuilder.create(
                    new Identifier("numismacraft", "general"))
            .icon(() -> new ItemStack(BlocksRegistry.APPRAISAL_TABLE_BLOCK)).build();

    public static void init(){

    }
}
