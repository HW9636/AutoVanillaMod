package org._9636dev.autosmithingtablerewrite.common.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org._9636dev.autosmithingtablerewrite.AutoSmithingTableMod;

@SuppressWarnings("unused")
public class AutoRecipes {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, AutoSmithingTableMod.MODID);

    public static final RegistryObject<AutoSmithingRecipeType> AUTO_SMITHING = RECIPE_TYPES.register("auto_smithing",
            AutoSmithingRecipeType::new);

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, AutoSmithingTableMod.MODID);

    public static final RegistryObject<AutoSmithingRecipeSerializer> AUTO_SMITHING_SERIALIZER = RECIPE_SERIALIZERS.register("auto_smithing",
            () -> AutoSmithingRecipeSerializer.INSTANCE);
}