package io.github.eman7blue.numismacraft.block;

import io.github.eman7blue.numismacraft.blockentity.CoinBagBlockEntity;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.BlockItem;
import static io.github.eman7blue.numismacraft.items.ItemGroup.NUMISMACRAFT_ITEMS;

public class BlocksRegistry {

    public static final Identifier APPRAISAL_TABLE = new Identifier("numismacraft", "appraisal_table");
    public static final Block APPRAISAL_TABLE_BLOCK = Registry.register(Registry.BLOCK, APPRAISAL_TABLE, new Block(FabricBlockSettings.of(Material.WOOD).strength(1.0f)));
    public static final Identifier COIN_BAG = new Identifier("numismacraft", "coin_bag");
    public static final Block COIN_BAG_BLOCK = Registry.register(Registry.BLOCK, COIN_BAG,
            new CoinBagBlock(FabricBlockSettings.of(Material.WOOL)));
    public static final BlockEntityType<CoinBagBlockEntity> COIN_BAG_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, COIN_BAG, FabricBlockEntityTypeBuilder.create(CoinBagBlockEntity::new, COIN_BAG_BLOCK).build(null));


    static {
        Registry.register(Registry.ITEM, APPRAISAL_TABLE,
                new BlockItem(APPRAISAL_TABLE_BLOCK, new FabricItemSettings().group(NUMISMACRAFT_ITEMS)));
        Registry.register(Registry.ITEM, COIN_BAG,
                new BlockItem(COIN_BAG_BLOCK, new FabricItemSettings().group(NUMISMACRAFT_ITEMS)));
    }

    public static void init(){

    }

}
