package com.xslrdv.xcraftgunpowder.registry;

import com.xslrdv.xcraftgunpowder.XCraftGunpowder;
import com.xslrdv.xcraftgunpowder.recipe.PickaxeCraftingRecipe;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, XCraftGunpowder.MODID);

        public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<PickaxeCraftingRecipe>> PICKAXE_SHAPELESS_SERIALIZER =
            SERIALIZERS.register(
                "pickaxe_shapeless",
                () -> new RecipeSerializer<>(PickaxeCraftingRecipe.CODEC, PickaxeCraftingRecipe.STREAM_CODEC));

    public static void register(IEventBus bus) {
        SERIALIZERS.register(bus);
    }
}
