package com.xslrdv.xcraftgunpowder.registry;

import com.xslrdv.xcraftgunpowder.XCraftGunpowder;
import com.xslrdv.xcraftgunpowder.recipe.GravelWashRecipe;
import com.xslrdv.xcraftgunpowder.recipe.PickaxeCrushRecipe;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, XCraftGunpowder.MODID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<PickaxeCrushRecipe>> PICKAXE_FLINT =
            SERIALIZERS.register("pickaxe_flint", () -> PickaxeCrushRecipe.FLINT_SERIALIZER);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<PickaxeCrushRecipe>> PICKAXE_COAL =
            SERIALIZERS.register("pickaxe_coal", () -> PickaxeCrushRecipe.COAL_SERIALIZER);

        public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<GravelWashRecipe>> GRAVEL_WASH =
                SERIALIZERS.register("gravel_wash", () -> GravelWashRecipe.SERIALIZER);
                
    public static void register(IEventBus bus) {
        SERIALIZERS.register(bus);
    }
}
