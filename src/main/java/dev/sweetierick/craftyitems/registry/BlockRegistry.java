package dev.sweetierick.craftyitems.registry;

import dev.sweetierick.craftyitems.CraftyItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import dev.sweetierick.craftyitems.block.*;

public final class BlockRegistry {

    public static final Block RosePineBlock = new RosePineBlock();
    public static final Block SmallCookingPotBlock = new SmallCookingPotBlock();
    public static final Block MoguShrineBlock = new MoguShrineBlock();
    public static final Block GlassCutterBlock = new GlassCutterBlock();
    public static final Block WoodCutterBlock = new WoodCutterBlock();

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "rose_pine"), new BlockItem(RosePineBlock, new FabricItemSettings().group(CraftyItems.CRAFTYITEMS_GROUP).maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "woodcutter"), new BlockItem(WoodCutterBlock, new FabricItemSettings().group(CraftyItems.CRAFTYITEMS_GROUP).maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "small_cooking_pot"), new BlockItem(SmallCookingPotBlock, new FabricItemSettings().group(CraftyItems.CRAFTYITEMS_GROUP).maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "mogu_shrine"), new BlockItem(MoguShrineBlock, new FabricItemSettings().group(CraftyItems.CRAFTYITEMS_GROUP).maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier("craftyitems","glasscutter"), new BlockItem(GlassCutterBlock, new FabricItemSettings().group(CraftyItems.CRAFTYITEMS_GROUP).maxCount(64)));
    }
}
