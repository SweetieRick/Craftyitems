package dev.sweetierick.craftyitems.client;

import dev.sweetierick.craftyitems.CraftyItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class CraftyItemsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // ModelLoadingRegistry.INSTANCE.registerResourceProvider(rm -> new CraftyModelProvider());
        BlockRenderLayerMap.INSTANCE.putBlock(CraftyItems.WoodCutterBlock, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CraftyItems.RosePineBlock, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CraftyItems.SmallCookingPotBlock, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CraftyItems.MoguShrineBlock, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CraftyItems.GlassCutterBlock, RenderLayer.getCutout());
    }
}
