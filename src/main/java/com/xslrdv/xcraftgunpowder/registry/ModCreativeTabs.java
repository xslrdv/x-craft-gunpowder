package com.xslrdv.xcraftgunpowder.registry;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class ModCreativeTabs {
    private static void addToTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.RAW_GUNPOWDER);
        }
    }

    public static void register(IEventBus modEventBus) {
        modEventBus.addListener(ModCreativeTabs::addToTabs);
    }
}
