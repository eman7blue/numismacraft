package io.github.eman7blue.numismacraft.villager;

import io.github.eman7blue.numismacraft.block.BlocksRegistry;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class NumismatistVillagerProfession {
    public static final PointOfInterestType NUMISMATIST_POI = PointOfInterestHelper.register(
            new Identifier("numismatist_poi"), 1, 1, BlocksRegistry.APPRAISAL_TABLE_BLOCK);
    public static final VillagerProfession NUMISMATIST = VillagerProfessionBuilder.create()
            .id(new Identifier("numismatist"))
            .workstation(RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier("numismatist_poi")))
            .workSound(SoundEvents.ENTITY_ITEM_FRAME_REMOVE_ITEM)
            .build();
}
