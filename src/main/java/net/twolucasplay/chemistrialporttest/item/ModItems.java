package net.twolucasplay.chemistrialporttest.item;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.twolucasplay.chemistrialporttest.Chemistrial;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Chemistrial.MODID);

    // Metals (Create)

     public static final DeferredItem<Item> ZINC_INGOT = ITEMS.registerSimpleItem("zinc_ingot");


    // Metals (Custom)

    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.registerSimpleItem("uranium_ingot");


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
