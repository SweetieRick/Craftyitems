package sweetierick.craftyitemsmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.block.*
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import sweetierick.craftyitemsmod.blocks.RosePineBlock;
import sweetierick.craftyitemsmod.items.FabricPieceItem;

/* import java.rmi.registry.Registry; */

public class Craftyitemsmod implements ModInitializer {
    // ? Registering all items
    /**
     * The first of the list are active items,
     * items which have a proper individual classes
     * and they interact with the enviroment or
     * simply have useful tooltips to them
     */
    public static final Item FabricPiece = new FabricPieceItem(new FabricItemSettings().group(Craftyitemsmod.CRAFTYITEMS_GROUP).maxCount(1));
    //  public static final Item RosePine = new RosePineItem(new FabricItemSettings().group(Craftyitemsmod.CRAFTYITEMS_GROUP).maxCount(64));
    /**
     * This second array of items are
     * passive items, or items which have
     * a limited use and they don't require
     * separate classes for added logic
     */
    public static final Item ThickString = new Item(new FabricItemSettings().group(Craftyitemsmod.CRAFTYITEMS_GROUP).maxCount(64));
    public static final Item PineDust = new Item(new FabricItemSettings().group(Craftyitemsmod.CRAFTYITEMS_GROUP).maxCount(64));
    public static final Item ScentedAshes = new Item(new FabricItemSettings().group(Craftyitemsmod.CRAFTYITEMS_GROUP).maxCount(64));
    /**
     * This third array are blocks
     * and itemblocks that are registered
     * by the mod. Both simple and tile entities are
     * defined here
     */
    public static final Block RosePineBlock = new RosePineBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT));

    /**
     * Here we define our custom creative
     * tab menus for all items in the mod
     */
    public static final ItemGroup CRAFTYITEMS_GROUP = FabricItemGroupBuilder.create(
            new Identifier("craftyitems","creative_tab"))
            .icon(() -> new ItemStack(Items.GLOBE_BANNER_PATTERN))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Craftyitemsmod.RosePineBlock));
                stacks.add(new ItemStack(Craftyitemsmod.FabricPiece));
                stacks.add(new ItemStack(Craftyitemsmod.ThickString));
                stacks.add(new ItemStack(Craftyitemsmod.PineDust));
                stacks.add(new ItemStack(Craftyitemsmod.ScentedAshes));
            })
            .build();

    @Override
    public void onInitialize() {
        // On initializing event
        // Registering all items and ItemBlocks
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "fabric_piece"), FabricPiece);
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "thick_string"), ThickString);
        Registry.register(Registry.ITEM, new Identifier("craftyitems","pine_dust"), PineDust);
        Registry.register(Registry.ITEM, new Identifier("craftyitems","scented_ashes"), ScentedAshes);

        // Registering all block objects
        Registry.register(Registry.BLOCK, new Identifier("craftyitems","rose_pine"), RosePineBlock);
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "rose_pine"), new BlockItem(RosePineBlock, new FabricItemSettings().group(Craftyitemsmod.CRAFTYITEMS_GROUP).maxCount(64)));

        // Adding trasparency to rose pine model
        // BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), Blocks.RosePineBlock);
    }
}
