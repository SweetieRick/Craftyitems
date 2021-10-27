package sweetierick.craftyitemsmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import sweetierick.craftyitemsmod.blocks.*;
import sweetierick.craftyitemsmod.items.FabricPieceItem;

/* import java.rmi.registry.Registry; */

public class CraftyItemsMod implements ModInitializer {

    public static final Item FabricPiece = new FabricPieceItem(new FabricItemSettings().group(CraftyItemsMod.CRAFTYITEMS_GROUP).maxCount(1));
    public static final Item ThickString = new Item(new FabricItemSettings().group(CraftyItemsMod.CRAFTYITEMS_GROUP).maxCount(64));
    public static final Item PineDust = new Item(new FabricItemSettings().group(CraftyItemsMod.CRAFTYITEMS_GROUP).maxCount(64));
    public static final Item ScentedAshes = new Item(new FabricItemSettings().group(CraftyItemsMod.CRAFTYITEMS_GROUP).maxCount(64));
    public static final Block RosePineBlock = new RosePineBlock();
    public static final Block WoodCutterBlock = new WoodCutterBlock();
    public static final Block SmallCookingPotBlock = new SmallCookingPotBlock();
    public static final Block MoguShrineBlock = new MoguShrineBlock();
    public static final Block GlassCutterBlock = new GlassCutterBlock();

    public static final ItemGroup CRAFTYITEMS_GROUP = FabricItemGroupBuilder.create(
            new Identifier("craftyitems","creative_tab"))
            .icon(() -> new ItemStack(Items.GLOBE_BANNER_PATTERN))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(CraftyItemsMod.RosePineBlock));
                stacks.add(new ItemStack(CraftyItemsMod.FabricPiece));
                stacks.add(new ItemStack(CraftyItemsMod.ThickString));
                stacks.add(new ItemStack(CraftyItemsMod.PineDust));
                stacks.add(new ItemStack(CraftyItemsMod.ScentedAshes));
                stacks.add(new ItemStack(CraftyItemsMod.WoodCutterBlock));
                stacks.add(new ItemStack(CraftyItemsMod.GlassCutterBlock));
                stacks.add(new ItemStack(CraftyItemsMod.SmallCookingPotBlock));
                stacks.add(new ItemStack(CraftyItemsMod.MoguShrineBlock));
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
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "rose_pine"), new BlockItem(RosePineBlock, new FabricItemSettings().group(CraftyItemsMod.CRAFTYITEMS_GROUP).maxCount(64)));
        Registry.register(Registry.BLOCK, new Identifier("craftyitems", "woodcutter"), WoodCutterBlock);
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "woodcutter"), new BlockItem(WoodCutterBlock, new FabricItemSettings().group(CraftyItemsMod.CRAFTYITEMS_GROUP).maxCount(64)));
        Registry.register(Registry.BLOCK, new Identifier("craftyitems", "small_cooking_pot"), SmallCookingPotBlock);
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "small_cooking_pot"), new BlockItem(SmallCookingPotBlock, new FabricItemSettings().group(CraftyItemsMod.CRAFTYITEMS_GROUP).maxCount(64)));
        Registry.register(Registry.BLOCK, new Identifier("craftyitems","mogu_shrine"), MoguShrineBlock);
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "mogu_shrine"), new BlockItem(MoguShrineBlock, new FabricItemSettings().group(CraftyItemsMod.CRAFTYITEMS_GROUP).maxCount(64)));
        Registry.register(Registry.BLOCK, new Identifier("craftyitems","glasscutter"), GlassCutterBlock);
        Registry.register(Registry.ITEM, new Identifier("craftyitems","glasscutter"), new BlockItem(GlassCutterBlock, new FabricItemSettings().group(CraftyItemsMod.CRAFTYITEMS_GROUP).maxCount(64)));
    }
}