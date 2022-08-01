package io.github.eman7blue.numismacraft.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

import static io.github.eman7blue.numismacraft.items.ItemGroup.NUMISMACRAFT_ITEMS;

public final class ItemsRegistry {
    public static final Item COIN_PURSE = new CoinPurseItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS).maxCount(1));

    public static final CoinItem COIN_STACK = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem FLYING_EAGLE_CENT_PENNY = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem LIBERTY_HEADDRESS_PENNY = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem LINCOLN_PENNY = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem LINCOLN_STEEL_PENNY = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem SHIELD_NICKEL = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem LIBERTY_NICKEL = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem JEFFERSON_OLD_NICKEL = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem JEFFERSON_WESTWARD_NICKEL = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem JEFFERSON_NICKEL = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem BARBER_DIME = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem MERCURY_DIME = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem ROOSEVELT_DIME = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem BARBER_QUARTER = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem STANDING_LIBERTY_QUARTER = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem WASHINGTON_OLD_QUARTER = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem WASHINGTON_STATE_QUARTER = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem WASHINGTON_QUARTER = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem BARBER_HALF_DOLLAR = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem WALKING_LIBERTY_HALF_DOLLAR = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem FRANKLIN_HALF_DOLLAR = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem KENNEDY_HALF_DOLLAR = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem MORGAN_DOLLAR = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem PEACE_DOLLAR = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem EISENHOWER_DOLLAR = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem SUSAN_DOLLAR = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem SACAGAWEA_DOLLAR = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem PRESIDENTIAL_DOLLAR = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem INDIAN_HEAD_QUARTER_EAGLE = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem INDIAN_HEAD_HALF_EAGLE = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem INDIAN_HEAD_EAGLE = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));
    public static final CoinItem SAINT_GAUDENS_DOUBLE_EAGLE = new CoinItem(new FabricItemSettings().group(NUMISMACRAFT_ITEMS));

    public static final ArrayList<Item> COINS = new ArrayList<>();

    private static void registerCoinItem(Identifier id, Item coin){
        COINS.add(coin);
        Registry.register(Registry.ITEM, id, coin);

    }
    public static void init(){
        registerCoinItem(new Identifier("numismacraft", "coin_purse"), COIN_PURSE);
        registerCoinItem(new Identifier("numismacraft", "coin_stack"), COIN_STACK);
        registerCoinItem(new Identifier("numismacraft", "flying_eagle_cent_penny"), FLYING_EAGLE_CENT_PENNY);
        registerCoinItem(new Identifier("numismacraft", "liberty_headdress_penny"), LIBERTY_HEADDRESS_PENNY);
        registerCoinItem(new Identifier("numismacraft", "lincoln_penny"), LINCOLN_PENNY);
        registerCoinItem(new Identifier("numismacraft", "lincoln_steel_penny"), LINCOLN_STEEL_PENNY);
        registerCoinItem(new Identifier("numismacraft", "shield_nickel"), SHIELD_NICKEL);
        registerCoinItem(new Identifier("numismacraft", "liberty_nickel"), LIBERTY_NICKEL);
        registerCoinItem(new Identifier("numismacraft", "jefferson_old_nickel"), JEFFERSON_OLD_NICKEL);
        registerCoinItem(new Identifier("numismacraft", "jefferson_westward_nickel"), JEFFERSON_WESTWARD_NICKEL);
        registerCoinItem(new Identifier("numismacraft", "jefferson_nickel"), JEFFERSON_NICKEL);
        registerCoinItem(new Identifier("numismacraft", "barber_dime"), BARBER_DIME);
        registerCoinItem(new Identifier("numismacraft", "mercury_dime"), MERCURY_DIME);
        registerCoinItem(new Identifier("numismacraft", "roosevelt_dime"), ROOSEVELT_DIME);
        registerCoinItem(new Identifier("numismacraft", "barber_quarter"), BARBER_QUARTER);
        registerCoinItem(new Identifier("numismacraft", "standing_liberty_quarter"), STANDING_LIBERTY_QUARTER);
        registerCoinItem(new Identifier("numismacraft", "washington_old_quarter"), WASHINGTON_OLD_QUARTER);
        registerCoinItem(new Identifier("numismacraft", "washington_state_quarter"), WASHINGTON_STATE_QUARTER);
        registerCoinItem(new Identifier("numismacraft", "washington_quarter"), WASHINGTON_QUARTER);
        registerCoinItem(new Identifier("numismacraft", "barber_half_dollar"), BARBER_HALF_DOLLAR);
        registerCoinItem(new Identifier("numismacraft", "walking_liberty_half_dollar"), WALKING_LIBERTY_HALF_DOLLAR);
        registerCoinItem(new Identifier("numismacraft", "franklin_half_dollar"), FRANKLIN_HALF_DOLLAR);
        registerCoinItem(new Identifier("numismacraft", "kennedy_half_dollar"), KENNEDY_HALF_DOLLAR);
        registerCoinItem(new Identifier("numismacraft", "morgan_dollar"), MORGAN_DOLLAR);
        registerCoinItem(new Identifier("numismacraft", "peace_dollar"), PEACE_DOLLAR);
        registerCoinItem(new Identifier("numismacraft", "eisenhower_dollar"), EISENHOWER_DOLLAR);
        registerCoinItem(new Identifier("numismacraft", "susan_dollar"), SUSAN_DOLLAR);
        registerCoinItem(new Identifier("numismacraft", "sacagawea_dollar"), SACAGAWEA_DOLLAR);
        registerCoinItem(new Identifier("numismacraft", "presidential_dollar"), PRESIDENTIAL_DOLLAR);
        registerCoinItem(new Identifier("numismacraft", "indian_head_quarter_eagle"), INDIAN_HEAD_QUARTER_EAGLE);
        registerCoinItem(new Identifier("numismacraft", "indian_head_half_eagle"), INDIAN_HEAD_HALF_EAGLE);
        registerCoinItem(new Identifier("numismacraft", "indian_head_eagle"), INDIAN_HEAD_EAGLE);
        registerCoinItem(new Identifier("numismacraft", "saint_gaudens_double_eagle"), SAINT_GAUDENS_DOUBLE_EAGLE);
    }



}
