package io.github.eman7blue.numismacraft.loot;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.function.ConditionalLootFunction;
import net.minecraft.loot.function.LootFunctionType;
import net.minecraft.nbt.NbtCompound;
import java.util.Calendar;
import static io.github.eman7blue.numismacraft.loot.RandomCoinLoot.RANDOM_COIN;

public class RandomCoinLootFunction extends ConditionalLootFunction {
    public RandomCoinLootFunction(LootCondition[] conditions) {
        super(conditions);
    }

    @Override
    protected ItemStack process(ItemStack stack, LootContext context) {
        if (!stack.isEmpty()) {
            NbtCompound nbt = stack.getOrCreateNbt();
            nbt.putInt("year", context.getRandom().nextInt(Calendar.getInstance().get(Calendar.YEAR) - 1909) + 1909);
        }
        return stack;
    }

    @Override
    public LootFunctionType getType() {
        return RANDOM_COIN;
    }

    public static class Serializer extends ConditionalLootFunction.Serializer<RandomCoinLootFunction> {

        public RandomCoinLootFunction fromJson(JsonObject json, JsonDeserializationContext context, LootCondition[] conditions) {
            return new RandomCoinLootFunction(conditions);
        }


    }
}
