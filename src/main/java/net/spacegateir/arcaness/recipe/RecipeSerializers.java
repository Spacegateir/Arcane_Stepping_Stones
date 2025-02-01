package net.spacegateir.arcaness.recipe;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public interface RecipeSerializers {
    // Registering custom recipe serializer
    RecipeSerializer<CraftingDecoratedPotRecipe> CRAFTING_DECORATED_POT = register(
            "crafting_decorated_pot", new SpecialRecipeSerializer<>(CraftingDecoratedPotRecipe::new)
    );

    // Method to write the recipe to a PacketByteBuf
    void write(PacketByteBuf buf, Recipe<?> recipe);

    // Register a new recipe serializer
    static <S extends RecipeSerializer<T>, T extends Recipe<?>> S register(String id, S serializer) {
        return Registry.register(Registries.RECIPE_SERIALIZER, id, serializer);
    }
}
