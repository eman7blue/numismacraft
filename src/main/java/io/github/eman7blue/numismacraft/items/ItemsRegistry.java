package io.github.eman7blue.numismacraft.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.eman7blue.numismacraft.Numismacraft.NUMISMACRAFT_ITEMS;

public final class ItemsRegistry {
    public static final Item PENNY = new Item(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final Item NICKEL = new Item(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final Item DIME = new Item(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final Item QUARTER = new Item(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));

    public static void init(){
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "penny"), PENNY);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "nickel"), NICKEL);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "dime"), DIME);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "quarter"), QUARTER);
    }



}
