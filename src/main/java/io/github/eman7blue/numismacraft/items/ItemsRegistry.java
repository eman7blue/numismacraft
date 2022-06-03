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
    public static final Item half_dollar= new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final Item dollar = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final Item quarter_eagle = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final Item half_eagle = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final Item eagle = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final Item double_eagle = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));

    public static void init(){
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "penny"), penny);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "nickel"), nickel);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "dime"), dime);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "quarter"), quarter);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "half_dollar"), half_dollar);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "dollar"), dollar);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "quarter_eagle"), quarter_eagle);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "half_eagle"), half_eagle);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "eagle"), eagle);
        Registry.register(Registry.ITEM, new Identifier("numismacraft", "double_eagle"), double_eagle);
    }



}
