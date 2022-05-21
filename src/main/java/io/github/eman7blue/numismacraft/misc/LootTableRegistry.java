package io.github.eman7blue.numismacraft.misc;


import io.github.eman7blue.numismacraft.items.ItemsRegistry;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.EmptyEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class LootTableRegistry {
    public static void init(){
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.SIMPLE_DUNGEON_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ItemsRegistry.PENNY).weight(1))
                        .with(EmptyEntry.Serializer().weight(10));
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.SIMPLE_DUNGEON_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ItemsRegistry.NICKEL).weight(1))
                        .with(EmptyEntry.Serializer().weight(5));
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.SIMPLE_DUNGEON_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ItemsRegistry.DIME).weight(1))
                        .with(EmptyEntry.Serializer().weight(5));
                table.pool(poolBuilder);
            }
        });
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (LootTables.SIMPLE_DUNGEON_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ItemsRegistry.QUARTER).weight(1))
                        .with(EmptyEntry.Serializer().weight(1));
                table.pool(poolBuilder);
            }
        });
    }
}
