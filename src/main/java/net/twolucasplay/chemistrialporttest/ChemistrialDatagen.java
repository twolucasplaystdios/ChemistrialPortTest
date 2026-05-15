package net.twolucasplay.chemistrialporttest;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.twolucasplay.chemistrialporttest.datagen.ModItemTagsProvider;
import net.twolucasplay.chemistrialporttest.datagen.ModModelProvider;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Chemistrial.MODID)
public class ChemistrialDatagen {

    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

        CompletableFuture<HolderLookup.Provider> lookup = event.getLookupProvider();


        generator.addProvider(true, new ModModelProvider(packOutput));

        generator.addProvider(true, new ModItemTagsProvider(packOutput, lookup));
    }
}
