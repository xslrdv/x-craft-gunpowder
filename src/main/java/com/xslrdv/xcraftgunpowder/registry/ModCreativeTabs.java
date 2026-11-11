package com.xslrdv.xcraftgunpowder.registry;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class ModCreativeTabs {
    private static void addToTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.FLINT_DUST);
            event.accept(ModItems.COAL_DUST);

            event.accept(ModItems.FLINT_DUST_BLOCK_ITEM);
            event.accept(ModItems.COAL_DUST_BLOCK_ITEM);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModItems.FLINT_DUST_BLOCK_ITEM);
            event.accept(ModItems.COAL_DUST_BLOCK_ITEM);
        }
    }

    public static void register(IEventBus modEventBus) {
        modEventBus.addListener(ModCreativeTabs::addToTabs);
    }
}
