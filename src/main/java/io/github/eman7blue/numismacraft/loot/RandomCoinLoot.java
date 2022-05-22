package io.github.eman7blue.numismacraft.loot;

import net.minecraft.loot.function.LootFunctionType;
import net.minecraft.util.registry.Registry;

public class RandomCoinLoot {
    public static final LootFunctionType RANDOM_COIN = new LootFunctionType(new RandomCoinLootFunction.Serializer());

    public static void init() {
        Registry.register(Registry.LOOT_FUNCTION_TYPE, "random_coin", RANDOM_COIN);
    }
}
