package io.github.eman7blue.numismacraft.items;

import io.github.eman7blue.numismacraft.blocks.BlocksRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

//TODO: delete this class
public class DefModItemGroup {
    public static final ItemGroup NUMISMACRAFT_ITEMS = FabricItemGroupBuilder.create(
                    new Identifier("numismacraft", "general"))
            .icon(() -> new ItemStack(BlocksRegistry.APPRAISAL_TABLE)).build();

    public static void init(){

    }
}
