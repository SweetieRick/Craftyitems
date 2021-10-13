package sweetierick.craftyitemsmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import sweetierick.craftyitemsmod.CraftyModelProvider;

@Environment(EnvType.CLIENT)
public class CraftyitemsmodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelLoadingRegistry.INSTANCE.registerResourceProvider(rm -> new CraftyModelProvider());
    }
}
