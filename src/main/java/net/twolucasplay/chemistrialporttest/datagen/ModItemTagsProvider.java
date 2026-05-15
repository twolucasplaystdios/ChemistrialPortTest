package net.twolucasplay.chemistrialporttest.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.twolucasplay.chemistrialporttest.Chemistrial;
import net.twolucasplay.chemistrialporttest.item.ModItems;

import java.util.concurrent.CompletableFuture;

import static net.neoforged.neoforge.common.Tags.Items.INGOTS;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Chemistrial.MODID);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.create(Identifier.fromNamespaceAndPath("chemistrialporttest", "radioactive")))
                .add(ModItems.URANIUM_INGOT.get());

        this.tag(ItemTags.create(Identifier.fromNamespaceAndPath("chemistrialporttest", "transition_metals")))
                .add(ModItems.ZINC_INGOT.get());
    }
}
