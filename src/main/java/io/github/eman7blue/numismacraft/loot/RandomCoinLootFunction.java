package io.github.eman7blue.numismacraft.loot;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.function.ConditionalLootFunction;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.function.LootFunctionType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.registry.Registry;

import static io.github.eman7blue.numismacraft.loot.RandomCoinLoot.RANDOM_COIN;

public class RandomCoinLootFunction extends ConditionalLootFunction {
    final Identifier rarity;
    public RandomCoinLootFunction(LootCondition[] conditions, Identifier rarity) {
        super(conditions);
        this.rarity = rarity;
    }

    @Override
    protected ItemStack process(ItemStack stack, LootContext context) {
        CoinTable coinTable = CoinTables.getCoinTable(rarity);
        Coin coin = coinTable.getCoin(context);
        ItemStack ret = new ItemStack(Registry.ITEM.get(new Identifier(coin.coin)), stack.getCount());
        ret.setNbt(stack.getOrCreateNbt());
        NbtCompound nbt = ret.getOrCreateNbt();
        nbt.putInt("year", coin.year);
        nbt.putString("mint", coin.mint);
        nbt.putString("design", coin.design);
        stack = ret;
        return ret;
    }

    @Override
    public LootFunctionType getType() {
        return RANDOM_COIN;
    }

    public static class Builder extends ConditionalLootFunction.Builder<RandomCoinLootFunction.Builder> {
        private Identifier rarity;

        public Builder() {
            this(CoinTables.EMPTY);
        }

        public Builder(Identifier rarity) {
            this.rarity = rarity;
        }

        protected RandomCoinLootFunction.Builder getThisBuilder() {
            return this;
        }

        public RandomCoinLootFunction.Builder rarity(Identifier rarity) {
            this.rarity = rarity;
            return this;
        }

        public LootFunction build() {
            return new RandomCoinLootFunction(this.getConditions(), this.rarity);
        }
    }

    public static class Serializer extends ConditionalLootFunction.Serializer<RandomCoinLootFunction> {

        public void toJson(JsonObject json, RandomCoinLootFunction randomCoinLootFunction, JsonSerializationContext context) {
            super.toJson(json, randomCoinLootFunction, context);
            json.add("rarity", context.serialize(randomCoinLootFunction.rarity));
        }
        public RandomCoinLootFunction fromJson(JsonObject json, JsonDeserializationContext context, LootCondition[] conditions) {
            Identifier rarity = Identifier.tryParse(JsonHelper.getString(json, "rarity", "empty"));
            return new RandomCoinLootFunction(conditions, rarity);
        }


    }
}
