package com.xslrdv.xcraftgunpowder.registry;

import com.xslrdv.xcraftgunpowder.XCraftGunpowder;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(XCraftGunpowder.MODID);

    public static final DeferredItem<Item> FLINT_DUST = ITEMS.registerSimpleItem("flint_dust");
    public static final DeferredItem<Item> COAL_DUST = ITEMS.registerSimpleItem("coal_dust");

    public static final DeferredItem<BlockItem> FLINT_DUST_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(ModBlocks.FLINT_DUST_BLOCK);
    public static final DeferredItem<BlockItem> COAL_DUST_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(ModBlocks.COAL_DUST_BLOCK);
        
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
