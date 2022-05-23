package io.github.eman7blue.numismacraft.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.BlockItem;
import static io.github.eman7blue.numismacraft.items.DefModItemGroup.NUMISMACRAFT_ITEMS;

public class BlocksRegistry {

    public static final Block APPRAISAL_TABLE = new Block(FabricBlockSettings.of(Material.WOOD).strength(0.6f));

    public static void init(){
        Registry.register(Registry.BLOCK, new Identifier("numismacraft", "appraisal_table"), APPRAISAL_TABLE);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "appraisal_table"),
                new BlockItem(APPRAISAL_TABLE, new FabricItemSettings().group(NUMISMACRAFT_ITEMS)));
    }

}
