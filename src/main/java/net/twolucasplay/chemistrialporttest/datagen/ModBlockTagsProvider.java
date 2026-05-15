package net.twolucasplay.chemistrialporttest.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.twolucasplay.chemistrialporttest.Chemistrial;
import net.twolucasplay.chemistrialporttest.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Chemistrial.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider){

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BLOCK_OF_ZINC.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLOCK_OF_ZINC.get());
    }
}
