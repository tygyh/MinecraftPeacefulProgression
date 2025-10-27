package xen42.peacefulitems.eiv;

import de.crafty.eiv.common.api.IExtendedItemViewIntegration;
import de.crafty.eiv.common.api.recipe.ItemView;
import de.crafty.eiv.common.recipe.ServerRecipeManager;
import xen42.peacefulitems.PeacefulMod;

public class PeacefulProgressionServerEIVPlugin implements IExtendedItemViewIntegration {
    @Override
    public void onIntegrationInitialize() {
        // register the server recipes
        ItemView.addRecipeProvider(recipeList -> {
            ServerRecipeManager.INSTANCE.getRecipesForType(PeacefulMod.EFFIGY_ALTAR_RECIPE_TYPE).forEach(recipe -> {
                recipeList.add(new EffigyAltarServerRecipe(recipe.getIngredients(), recipe.result(), recipe.getCostOrDefault()));
            });
        });
    }
}
