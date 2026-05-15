package net.twolucasplay.chemistrialporttest.tabs;

import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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


    public static final TagKey<Item> RADIOACTIVE = TagKey.create(
            // The registry key. The type of the registry must match the generic type of the tag.
            Registries.ITEM,
            // The location of the tag.
            Identifier.fromNamespaceAndPath("chemistrialporttest", "radioactive")
    );

    public static final TagKey<Item> TRANS = TagKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath("chemistrialporttest", "transition_metals")
    );

    // The radioactive tab
    public static final Supplier<CreativeModeTab> RADIOACTIVE_TAB = CREATIVE_MODE_TABS.register("radioactive_items_tab", () ->
            CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.URANIUM_INGOT.get()))
                    .title(Component.translatable("tabs.chemistrialporttest.radioactive_items_tab")).displayItems(((itemDisplayParameters, output) ->
                    {

                        for (Holder<Item> itemHolder : ModItems.ITEMS.getEntries()) {
                            Item item = itemHolder.value();
                            ItemStack stack = new ItemStack(item);

                            if (stack.is(RADIOACTIVE)){
                                output.accept(item);
                            }

                        }
                    }
                    )).build()
    );

    // Transition Metals tab
    public static final Supplier<CreativeModeTab> TRANSITION_METALS_TAB = CREATIVE_MODE_TABS.register("transition_metals_tab", () ->
            CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ZINC_INGOT.get()))
                    .title(Component.translatable("tabs.chemistrialporttest.transition_metals_tab")).displayItems(((itemDisplayParameters, output) ->
                    {

                        for (Holder<Item> itemHolder : ModItems.ITEMS.getEntries()) {
                            Item item = itemHolder.value();
                            ItemStack stack = new ItemStack(item);

                            if (stack.is(TRANS)){
                                output.accept(item);
                            }

                        }
                    }
                    )).build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
