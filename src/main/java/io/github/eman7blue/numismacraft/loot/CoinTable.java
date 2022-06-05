package io.github.eman7blue.numismacraft.loot;

import com.google.common.collect.Lists;
import com.google.gson.*;
import net.minecraft.loot.context.LootContext;
import net.minecraft.util.JsonHelper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinTable {
    public ArrayList<Coin> coins;
    public CoinTable(ArrayList<Coin> coins){
        this.coins = coins;
    }
    @Deprecated
    public CoinTable(Coin[] coins){
        this.coins = new ArrayList<>(Arrays.asList(coins));
    }

    public Coin getCoin(LootContext context){
        int rand = context.getRandom().nextInt(coins.size());
        return coins.get(rand);
    }

    public static class Builder{
        private final ArrayList<Coin> coins = Lists.newArrayList();

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
            return new CoinTable(this.coins);
        }
    }

    public static class Serializer implements JsonDeserializer<CoinTable>, JsonSerializer<CoinTable> {
        public Serializer() {
        }

        public CoinTable deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
            JsonObject object = JsonHelper.asObject(element, "coin table");
            ArrayList<Coin> coins = (ArrayList<Coin>) JsonHelper.deserialize(object, "coins", new ArrayList<Coin>(), context, ArrayList.class);
            return new CoinTable(coins);
        }

        public JsonElement serialize(CoinTable coinTable, Type type, JsonSerializationContext context) {
            JsonObject object = new JsonObject();
            if (coinTable.coins.size() > 0) {
                object.add("coins", context.serialize(coinTable.coins));
            }
            return object;
        }
    }

    public String toString(){
        return (new ArrayList<>(List.of(coins))).toString();
    }
}
