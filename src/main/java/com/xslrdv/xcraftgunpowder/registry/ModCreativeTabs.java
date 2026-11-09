package com.xslrdv.xcraftgunpowder.registry;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class ModCreativeTabs {
    public static void register(IEventBus modEventBus) {
        modEventBus.addListener(ModCreativeTabs::addToTabs);
    }

    private static void addToTabs(BuildCreativeModeTabContentsEvent event) {
    }
}
