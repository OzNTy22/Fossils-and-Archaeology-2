package net.oznty22.fa_2.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;
import net.oznty22.fa_2.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        signBuilder(ModItems.LALIVE_SIGN.get(),
                Ingredient.of(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "oak_planks"))));

        hangingSign(pWriter, ModItems.LALIVE_HANGING_SIGN.get(),
                ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "stripped_oak_log")));
    }
}
