package io.github.eman7blue.numismacraft.loot;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import io.github.eman7blue.numismacraft.Numismacraft;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.fabricmc.fabric.impl.resource.loader.ResourceManagerHelperImpl;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static net.minecraft.util.Util.error;

public class CoinTables {
    protected static Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private static final Set<Identifier> COIN_TABLES = Sets.newHashSet();
    private static final Set<Identifier> COIN_TABLES_READ_ONLY;
    public static final Identifier EMPTY;
    public static final Identifier RARITY_1;
    public static final Identifier RARITY_2;
    public static final Identifier RARITY_3;
    public static final Identifier RARITY_4;
    public static final Identifier RARITY_5;
    public static final Identifier RARITY_6;
    public static final Identifier RARITY_7;
    public static final Identifier RARITY_8;
    public static final Identifier RARITY_9;
    public static final Identifier RARITY_10;
    public static final Identifier SECRET;
    protected static Map<Identifier, CoinTable> COIN_TABLE_LIST = new HashMap<>();



    public CoinTables(){
    }

    private static Identifier register(String id) {
        return registerLootTable(new Identifier(id));
    }

    private static Identifier registerLootTable(Identifier id) {
        if (COIN_TABLES.add(id)) {
            return id;
        } else {
            throw new IllegalArgumentException("" + id + " is already a registered built-in coin table");
        }
    }

    private static void coinTablesInit(){
        ResourceManagerHelper.get(ResourceType.SERVER_DATA).registerReloadListener(new SimpleSynchronousResourceReloadListener() {
            @Override
            public void reload(ResourceManager manager){

                for(Identifier id : manager.findResources("resources/data/numismacraft/coin_tables", path -> path.endsWith(".json"))) {
                    Numismacraft.LOGGER.info(id.toString());
                    try(InputStream stream = manager.getResource(id).getInputStream()) {
                        String text = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
                        CoinTable coinTable = GSON.fromJson(text, (Type) new CoinTable.Serializer());
                        if(COIN_TABLES.contains(id)){
                            COIN_TABLE_LIST.put(id, coinTable);
                        } else {
                           throw new IllegalArgumentException("" + id + " is not in built-in coin table");
                        }
                    } catch(Exception e) {
                        error("Error occurred while loading resource json " + id.toString(), e);
                    }
                }
            }

            @Override
            public Identifier getFabricId() {
                return new Identifier("numismacraft", "coin_tables");
            }

        });
    }

    public static CoinTable getCoinTable(Identifier id){
        if(COIN_TABLES.contains(id)){
            CoinTable ret = COIN_TABLE_LIST.get(id);
            if (ret == null){

            }
            Numismacraft.LOGGER.info(COIN_TABLE_LIST.toString());
            if (ret != null){
                return ret;
            } else {
                throw new IllegalArgumentException("uh oh");
            }
        } else {
            throw new IllegalArgumentException("" + id + " is not in built-in coin table");
        }

    }

    public static Set<Identifier> getAll() {
        return COIN_TABLES_READ_ONLY;
    }

    static {
        COIN_TABLES_READ_ONLY = Collections.unmodifiableSet(COIN_TABLES);
        EMPTY = new Identifier("empty");
        RARITY_1 = register("rarity1");
        RARITY_2 = register("rarity2");
        RARITY_3 = register("rarity3");
        RARITY_4 = register("rarity4");
        RARITY_5 = register("rarity5");
        RARITY_6 = register("rarity6");
        RARITY_7 = register("rarity7");
        RARITY_8 = register("rarity8");
        RARITY_9 = register("rarity9");
        RARITY_10 = register("rarity10");
        SECRET = register("secret");
        coinTablesInit();

    }
}
