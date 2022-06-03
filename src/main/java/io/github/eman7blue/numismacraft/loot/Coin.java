package io.github.eman7blue.numismacraft.loot;

import com.google.common.collect.Lists;
import com.google.gson.*;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionConsumingBuilder;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.function.LootFunctionConsumingBuilder;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.LootNumberProvider;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.JsonHelper;
import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Type;
import java.util.List;

public class Coin {
    public int year;
    public String mint;
    public String design;
    public Item coin;

    Coin(int year, String mint, String design, Item coin){
        this.year = year;
        this.mint = mint;
        this.design = design;
        this.coin = coin;
    }

    public static class Builder{
        private int year;
        private String mint;
        private String design;
        private Item coin;

        public Builder() {
        }

        public Coin.Builder year(int year) {
            this.year = year;
            return this;
        }

        public Coin.Builder mint(String mint) {
            this.mint = mint;
            return this;
        }

        public Coin.Builder design(String design) {
            this.design = design;
            return this;
        }

        public Coin.Builder coin(Item coin) {
            this.coin = coin;
            return this;
        }


        public Coin.Builder getThis() {
            return this;
        }

        public Coin build() {
            return new Coin(this.year, this.mint, this.design, this.coin);
        }
    }

    public static class Serializer implements JsonDeserializer<Coin>, JsonSerializer<Coin> {
        public Serializer() {
        }

        public Coin deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
            JsonObject jsonObject = JsonHelper.asObject(element, "coin");
            int year = JsonHelper.getInt(jsonObject, "year", 0);
            String mint = JsonHelper.getString(jsonObject, "mint", "");
            String design = JsonHelper.getString(jsonObject, "design", "Coin");
            Item coin = Registry.ITEM.get(new Identifier(JsonHelper.getString(jsonObject, "coin", "numismacraft:dime")));
            return new Coin(year, mint, design, coin);
        }

        public JsonElement serialize(Coin coin, Type type, JsonSerializationContext context) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("year", context.serialize(coin.year));
            jsonObject.add("mint", context.serialize(coin.mint));
            jsonObject.add("design", context.serialize(coin.design));
            jsonObject.add("coin", context.serialize(coin.coin.toString()));
            return jsonObject;
        }
    }

    public String toString(){
        return year + "," + mint + "," + design + "," + coin.toString();
    }
}
