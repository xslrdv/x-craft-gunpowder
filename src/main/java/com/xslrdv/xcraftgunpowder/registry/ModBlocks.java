package com.xslrdv.xcraftgunpowder.registry;

import com.xslrdv.xcraftgunpowder.XCraftGunpowder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(XCraftGunpowder.MODID);

    public static final DeferredBlock<Block> FLINT_DUST_BLOCK = BLOCKS.registerSimpleBlock("flint_dust_block",
        () -> BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_GRAY)
            .strength(0.8f)
            .sound(SoundType.STONE));

    public static final DeferredBlock<Block> COAL_DUST_BLOCK = BLOCKS.registerSimpleBlock("coal_dust_block",
        () -> BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLACK)
            .strength(0.8f)
            .sound(SoundType.STONE));

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
