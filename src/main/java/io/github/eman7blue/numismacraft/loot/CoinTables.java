package io.github.eman7blue.numismacraft.loot;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.eman7blue.numismacraft.Numismacraft;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static net.minecraft.util.Util.error;

public class CoinTables {
    private static final Set<Identifier> COIN_TABLES = Sets.newHashSet();
    private static final Set<Identifier> COIN_TABLES_READ_ONLY = Collections.unmodifiableSet(COIN_TABLES);
    public static final Identifier EMPTY = new Identifier("empty");
    public static final Identifier RARITY_1 = register("coin_tables/rarity1.json");
    public static final Identifier RARITY_2 = register("coin_tables/rarity2.json");
    public static final Identifier RARITY_3 = register("coin_tables/rarity3.json");
    public static final Identifier RARITY_4 = register("coin_tables/rarity4.json");
    public static final Identifier RARITY_5 = register("coin_tables/rarity5.json");
    public static final Identifier RARITY_6 = register("coin_tables/rarity6.json");
    public static final Identifier RARITY_7 = register("coin_tables/rarity7.json");
    public static final Identifier RARITY_8 = register("coin_tables/rarity8.json");
    public static final Identifier RARITY_9 = register("coin_tables/rarity9.json");
    public static final Identifier RARITY_10 = register("coin_tables/rarity10.json");
    public static final Identifier SECRET = register("coin_tables/secret.json");
    protected static Map<Identifier, CoinTable> COIN_TABLE_LIST = new HashMap<>();



    public CoinTables(){
    }

    private static Identifier register(String id) {
        return registerLootTable(new Identifier("numismacraft", id));
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
            public void reload(ResourceManager manager){
                COIN_TABLE_LIST.clear();
                Collection<Identifier> resources = manager.findResources("coin_tables", path -> path.endsWith(".json"));
                Numismacraft.LOGGER.info(manager.getAllNamespaces().toString());
                for(Identifier id : resources) {
                    Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
                    Numismacraft.LOGGER.info(id.toString());
                    try(InputStream stream = manager.getResource(id).getInputStream()) {
                        String text = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
                        CoinTable coinTable = GSON.fromJson(text, CoinTable.class);
                        if(COIN_TABLES.contains(id)){
                            COIN_TABLE_LIST.put(id, coinTable);
                        } else {
                           throw new IllegalArgumentException("" + id + " is not in built-in coin table");
                        }
                    } catch(Exception e) {
                        error("Error occurred while loading resource json " + id, e);
                    }
                }
                if(COIN_TABLE_LIST.isEmpty()){
                    Numismacraft.LOGGER.error("we've been bamboozled! (coin tables not loaded, mod wont work!)");
                } else {
                    Numismacraft.LOGGER.info(COIN_TABLE_LIST.toString());
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
            if (ret != null){
                return ret;
            } else {
                throw new IllegalArgumentException("somehow the coin tables are missing?");
            }
        } else {
            throw new IllegalArgumentException("" + id + " is not in built-in coin table");
        }

    }

    public static Set<Identifier> getAll() {
        return COIN_TABLES_READ_ONLY;
    }

    static {
        coinTablesInit();
    }
}
