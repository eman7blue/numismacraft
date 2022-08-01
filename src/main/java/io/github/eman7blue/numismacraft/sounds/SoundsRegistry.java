package io.github.eman7blue.numismacraft.sounds;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundsRegistry {

    public static final Identifier COIN_PURSE_INSERT = new Identifier("numismacraft:coin_purse_insert");
    public static SoundEvent COIN_PURSE_INSERT_EVENT = new SoundEvent(COIN_PURSE_INSERT);

    static {
        Registry.register(Registry.SOUND_EVENT, COIN_PURSE_INSERT, COIN_PURSE_INSERT_EVENT);
    }

    public static void init(){

    }
}
