package io.github.eman7blue.numismacraft.loot;

import io.github.eman7blue.numismacraft.items.ItemsRegistry;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;


public class LootTableRegistry {
    private static void modifyLootTable(FabricLootPoolBuilder poolBuilder, FabricLootSupplierBuilder table, Identifier id, int weight){
        poolBuilder.with(ItemEntry.builder(ItemsRegistry.DIME).weight(weight).apply(new RandomCoinLootFunction.Builder(id)));
    }
    public static void init(){
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.SIMPLE_DUNGEON_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(3));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 15);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 15);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 15);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 3);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 2);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.ABANDONED_MINESHAFT_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(3));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_7, 2);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.BASTION_BRIDGE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(3));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_7, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_8, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_9, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_10, 5);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.BASTION_HOGLIN_STABLE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(3));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_8, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_9, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_10, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.BASTION_OTHER_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(3));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_7, 5);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.BASTION_TREASURE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(3));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_7, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_8, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_9, 15);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_10, 15);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.BURIED_TREASURE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(1));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.CAT_MORNING_GIFT_GAMEPLAY.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(1));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 10);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.DESERT_PYRAMID_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 30);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 15);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_7, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_8, 2);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_9, 2);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_10, 2);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.END_CITY_TREASURE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(3));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_7, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_8, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_9, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_10, 5);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.FISHING_TREASURE_GAMEPLAY.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(1));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_7, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_8, 5);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.IGLOO_CHEST_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(3));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 15);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.JUNGLE_TEMPLE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(3));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.JUNGLE_TEMPLE_DISPENSER_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(3));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 15);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.NETHER_BRIDGE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(3));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_7, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_9, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_10, 5);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.PIGLIN_BARTERING_GAMEPLAY.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_9, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_10, 5);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.PILLAGER_OUTPOST_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(3));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 15);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.RUINED_PORTAL_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_9, 2);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.SHIPWRECK_MAP_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.SHIPWRECK_SUPPLY_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.SHIPWRECK_TREASURE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_7, 2);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_8, 2);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.SPAWN_BONUS_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(1));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.STRONGHOLD_CORRIDOR_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_7, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.STRONGHOLD_CROSSING_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_7, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.STRONGHOLD_LIBRARY_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_8, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 15);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 15);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.UNDERWATER_RUIN_SMALL_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 5);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_ARMORER_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 5);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_BUTCHER_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_CARTOGRAPHER_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 5);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_DESERT_HOUSE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_FISHER_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_FLETCHER_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_MASON_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_PLAINS_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_SAVANNA_HOUSE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_SHEPARD_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_SNOWY_HOUSE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_TAIGA_HOUSE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_TANNERY_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_TEMPLE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_TOOLSMITH_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 20);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.VILLAGE_WEAPONSMITH_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(2));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 20);
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.WOODLAND_MANSION_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(5));
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_1, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_2, 20);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_3, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_4, 10);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_5, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_6, 5);
                modifyLootTable(poolBuilder, table, CoinTables.RARITY_7, 2);
                table.pool(poolBuilder);
            }
        });
    }

}
