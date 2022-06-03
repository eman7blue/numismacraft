package io.github.eman7blue.numismacraft.loot;

import com.google.common.collect.Lists;
import com.google.gson.*;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.function.LootFunctionConsumingBuilder;
import net.minecraft.util.JsonHelper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CoinTable {
    public Coin[] coins;
    public CoinTable(Coin[] coins){
        this.coins = coins;
    }

    public Coin getCoin(LootContext context){
        int rand = context.getRandom().nextInt(coins.length);
        return coins[rand];
    }

    public static class Builder{
        private final List<Coin> coins = Lists.newArrayList();

        public Builder() {
        }

        public CoinTable.Builder coin(Coin.Builder coinBuilder) {
            this.coins.add(coinBuilder.build());
            return this;
        }


        public CoinTable.Builder getThis() {
            return this;
        }

        public CoinTable build() {
            return new CoinTable(this.coins.toArray(new Coin[0]));
        }
    }

    public static class Serializer implements JsonDeserializer<CoinTable>, JsonSerializer<CoinTable> {
        public Serializer() {
        }

        public CoinTable deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
            JsonObject jsonObject = JsonHelper.asObject(element, "coin table");
            Coin[] coins = JsonHelper.deserialize(jsonObject, "coins", new Coin[0], context, Coin[].class);
            return new CoinTable(coins);
        }

        public JsonElement serialize(CoinTable coinTable, Type type, JsonSerializationContext context) {
            JsonObject jsonObject = new JsonObject();
            if (coinTable.coins.length > 0) {
                jsonObject.add("coins", context.serialize(coinTable.coins));
            }
            return jsonObject;
        }
    }

    public String toString(){
        return (new ArrayList<>(List.of(coins))).toString();
    }
}
