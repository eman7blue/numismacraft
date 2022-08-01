package io.github.eman7blue.numismacraft.loot;

import com.google.gson.*;
import net.minecraft.util.JsonHelper;
import java.lang.reflect.Type;

public class Coin {
    public int year;
    public String mint;
    public String design;
    public String coin;
    public String country;

    Coin(int year, String mint, String design, String coin, String country){
        this.year = year;
        this.mint = mint;
        this.design = design;
        this.coin = coin;
        this.country = country;
    }

    public static class Builder{
        private int year;
        private String mint;
        private String design;
        private String coin;
        private String country;

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

        public Coin.Builder coin(String coin) {
            this.coin = coin;
            return this;
        }

        public Coin.Builder country(String country) {
            this.country = country;
            return this;
        }
        public Coin.Builder getThis() {
            return this;
        }

        public Coin build() {
            return new Coin(this.year, this.mint, this.design, this.coin, this.country);
        }
    }

    public static class Serializer implements JsonDeserializer<Coin>, JsonSerializer<Coin> {
        public Serializer() {
        }

        public Coin deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
            JsonObject object = JsonHelper.asObject(element, "coin");
            int year = JsonHelper.getInt(object, "year", 0);
            String mint = JsonHelper.getString(object, "mint", "");
            String design = JsonHelper.getString(object, "design", "Coin");
            String coin = JsonHelper.getString(object, "string", "numismacraft:dime");
            String country = JsonHelper.getString(object, "country", "United States of America");
            return new Coin(year, mint, design, coin, country);
        }

        public JsonElement serialize(Coin coin, Type type, JsonSerializationContext context) {
            JsonObject object = new JsonObject();
            object.add("year", context.serialize(coin.year));
            object.add("mint", context.serialize(coin.mint));
            object.add("design", context.serialize(coin.design));
            object.add("coin", context.serialize(coin.coin));
            object.add("country", context.serialize(coin.country));
            return object;
        }
    }

    public String toString(){
        return year + "," + mint + "," + design + "," + coin + "," + country;
    }
}
