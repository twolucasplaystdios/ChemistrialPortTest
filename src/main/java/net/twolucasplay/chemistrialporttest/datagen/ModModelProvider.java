package net.twolucasplay.chemistrialporttest.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.twolucasplay.chemistrialporttest.Chemistrial;

import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import net.twolucasplay.chemistrialporttest.item.ModItems;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Chemistrial.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.URANIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);

    }
}
