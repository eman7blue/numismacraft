package io.github.eman7blue.numismacraft.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.eman7blue.numismacraft.items.DefModItemGroup.NUMISMACRAFT_ITEMS;

public final class ItemsRegistry {
    public static final Item penny = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final Item nickel = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final Item dime = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final Item quarter = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));

    public static void init(){
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "penny"), penny);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "nickel"), nickel);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "dime"), dime);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "quarter"), quarter);
    }



}
