package xen42.peacefulitems.eiv;

import de.crafty.eiv.common.api.IExtendedItemViewIntegration;
import de.crafty.eiv.common.api.recipe.ItemView;
import de.crafty.eiv.common.recipe.ServerRecipeManager;
import xen42.peacefulitems.PeacefulMod;

import java.util.Collections;

public class PeacefulProgressionClientEIVPlugin implements IExtendedItemViewIntegration {

    @Override
    public void onIntegrationInitialize() {

        // register all the client recipes
        ItemView.registerRecipeWrapper(EffigyAltarServerRecipe.TYPE, modRecipe -> {
            return Collections.singletonList(new EffigyAltarViewRecipe(modRecipe));
        });
    }
}
