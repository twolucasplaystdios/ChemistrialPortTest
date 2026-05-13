package net.twolucasplay.chemistrialporttest.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.twolucasplay.chemistrialporttest.Chemistrial;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Chemistrial.MODID);

    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.registerSimpleItem("uranium_ingot");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
