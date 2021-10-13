package sweetierick.craftyitemsmod;

import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.client.model.ModelProviderException;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;
import sweetierick.craftyitemsmod.models.SmallCookingPotModel;

public class CraftyModelProvider implements ModelResourceProvider {
    public static final Identifier SMALL_COOKING_POT_MODEL = new Identifier("craftyitems:block/small_cooking_pot");

    @Override
    public UnbakedModel loadModelResource(Identifier identifier, ModelProviderContext modelProviderContext) throws ModelProviderException {
        if(identifier.equals(SMALL_COOKING_POT_MODEL)) {
            return new SmallCookingPotModel();
        } else {
            return null;
        }
    }
}
