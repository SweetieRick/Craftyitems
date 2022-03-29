package dev.sweetierick.craftyitems.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import static dev.sweetierick.craftyitems.registry.BlockRegistry.*;

@Environment(EnvType.CLIENT)
public class CraftyItemsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // ModelLoadingRegistry.INSTANCE.registerResourceProvider(rm -> new CraftyModelProvider());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodCutterBlock, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RosePineBlock, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmallCookingPotBlock, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoguShrineBlock, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassCutterBlock, RenderLayer.getCutout());
    }
}
