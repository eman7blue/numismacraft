package io.github.eman7blue.numismacraft.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

import static io.github.eman7blue.numismacraft.items.DefModItemGroup.NUMISMACRAFT_ITEMS;

public final class ItemsRegistry {
    public static final Item COIN_PURSE = new CoinPurseItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final ItemCoin PENNY = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final ItemCoin NICKEL = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final ItemCoin DIME = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final ItemCoin QUARTER = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final ItemCoin HALF_DOLLAR = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final ItemCoin DOLLAR = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final ItemCoin QUARTER_EAGLE = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final ItemCoin HALF_EAGLE = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final ItemCoin EAGLE = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final ItemCoin DOUBLE_EAGLE = new ItemCoin(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));

    public static final ArrayList<Item> COINS = new ArrayList<>();

    private static void registerCoinItem(Identifier id, Item coin){
        COINS.add(coin);
        Registry.register(Registry.ITEM, id, coin);

    }
    public static void init(){
        registerCoinItem(new Identifier("numismacraft", "coin_purse"), COIN_PURSE);
        registerCoinItem(new Identifier("numismacraft", "penny"), PENNY);
        registerCoinItem(new Identifier("numismacraft", "nickel"), NICKEL);
        registerCoinItem(new Identifier("numismacraft", "dime"), DIME);
        registerCoinItem(new Identifier("numismacraft", "quarter"), QUARTER);
        registerCoinItem(new Identifier("numismacraft", "half_dollar"), HALF_DOLLAR);
        registerCoinItem(new Identifier("numismacraft", "dollar"), DOLLAR);
        registerCoinItem(new Identifier("numismacraft", "quarter_eagle"), QUARTER_EAGLE);
        registerCoinItem(new Identifier("numismacraft", "half_eagle"), HALF_EAGLE);
        registerCoinItem(new Identifier("numismacraft", "eagle"), EAGLE);
        registerCoinItem(new Identifier("numismacraft", "double_eagle"), DOUBLE_EAGLE);
    }



}
