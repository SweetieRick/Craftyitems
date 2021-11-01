package sweetierick.craftyitemsmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import sweetierick.craftyitemsmod.CraftyItemsMod;

@Environment(EnvType.CLIENT)
public class CraftyitemsmodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // ModelLoadingRegistry.INSTANCE.registerResourceProvider(rm -> new CraftyModelProvider());
        BlockRenderLayerMap.INSTANCE.putBlock(CraftyItemsMod.WoodCutterBlock, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CraftyItemsMod.RosePineBlock, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CraftyItemsMod.SmallCookingPotBlock, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CraftyItemsMod.MoguShrineBlock, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CraftyItemsMod.GlassCutterBlock, RenderLayer.getCutout());
    }
}
