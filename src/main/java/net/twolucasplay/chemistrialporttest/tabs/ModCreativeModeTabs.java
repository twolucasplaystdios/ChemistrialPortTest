package net.twolucasplay.chemistrialporttest.tabs;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.twolucasplay.chemistrialporttest.Chemistrial;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.twolucasplay.chemistrialporttest.item.ModItems;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Chemistrial.MODID);


    public static final Supplier<CreativeModeTab> RADIOACTIVE_TAB = CREATIVE_MODE_TABS.register("radioactive_items_tab", () ->
            CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.URANIUM_INGOT.get()))
                    .title(Component.translatable("tabs.chemistrialporttest.radioactive_items_tab")).displayItems(((itemDisplayParameters, output) ->
                    {output.accept(ModItems.URANIUM_INGOT);}
                    )).build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
