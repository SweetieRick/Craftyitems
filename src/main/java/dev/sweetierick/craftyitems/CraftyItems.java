package dev.sweetierick.craftyitems;

import dev.sweetierick.craftyitems.block.*;
import dev.sweetierick.craftyitems.block.entity.WoodCutterBlockEntity;
import dev.sweetierick.craftyitems.item.FabricPieceItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.logging.Logger;

public class CraftyItems implements ModInitializer {
    public static final Logger LOGGER = Logger.getLogger("Logger");

    public static final Item FabricPiece = new FabricPieceItem(new FabricItemSettings().maxCount(1));
    public static final Item ThickString = new Item(new FabricItemSettings().maxCount(64));
    public static final Item PineDust = new Item(new FabricItemSettings().maxCount(64));
    public static final Item ScentedAshes = new Item(new FabricItemSettings().maxCount(64));
    public static final Item BakedApple = new Item(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(12).saturationModifier(0.6F).build()));

    public static final Block RosePineBlock = new RosePineBlock();
    public static final Block SmallCookingPotBlock = new SmallCookingPotBlock();
    public static final Block MoguShrineBlock = new MoguShrineBlock();
    public static final Block GlassCutterBlock = new GlassCutterBlock();
    public static final Block WoodCutterBlock = new WoodCutterBlock();

    public static BlockEntityType<WoodCutterBlockEntity> WOODCUTTER_BLOCK_ENTITY = BlockEntityType.Builder
            .create(WoodCutterBlockEntity::new, WoodCutterBlock).build(null);

    public static ItemGroup CRAFTYITEMS_GROUP = FabricItemGroupBuilder.create(new Identifier("craftyitems","creative_tab"))
            .icon(() -> new ItemStack(Items.GLOBE_BANNER_PATTERN))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(RosePineBlock));
                stacks.add(new ItemStack(FabricPiece));
                stacks.add(new ItemStack(ThickString));
                stacks.add(new ItemStack(PineDust));
                stacks.add(new ItemStack(ScentedAshes));
                stacks.add(new ItemStack(WoodCutterBlock));
                stacks.add(new ItemStack(GlassCutterBlock));
                stacks.add(new ItemStack(SmallCookingPotBlock));
                stacks.add(new ItemStack(MoguShrineBlock));
                stacks.add(new ItemStack(BakedApple));
            }).build();

    @Override
    public void onInitialize() {
        LOGGER.info("[CraftyItems] Initializing the modfile! Be right back");

        Registry.register(Registry.ITEM, new Identifier("craftyitems", "fabric_piece"), FabricPiece);
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "thick_string"), ThickString);
        Registry.register(Registry.ITEM, new Identifier("craftyitems","pine_dust"), PineDust);
        Registry.register(Registry.ITEM, new Identifier("craftyitems","scented_ashes"), ScentedAshes);
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "baked_apple"), BakedApple);

        Registry.register(Registry.ITEM, new Identifier("craftyitems", "rose_pine"), new BlockItem(RosePineBlock, new FabricItemSettings().group(CraftyItems.CRAFTYITEMS_GROUP).maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "woodcutter"), new BlockItem(WoodCutterBlock, new FabricItemSettings().group(CraftyItems.CRAFTYITEMS_GROUP).maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "small_cooking_pot"), new BlockItem(SmallCookingPotBlock, new FabricItemSettings().group(CraftyItems.CRAFTYITEMS_GROUP).maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "mogu_shrine"), new BlockItem(MoguShrineBlock, new FabricItemSettings().group(CraftyItems.CRAFTYITEMS_GROUP).maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier("craftyitems","glasscutter"), new BlockItem(GlassCutterBlock, new FabricItemSettings().group(CraftyItems.CRAFTYITEMS_GROUP).maxCount(64)));

        Registry.register(Registry.BLOCK, new Identifier("craftyitems", "rose_pine"), RosePineBlock);
        Registry.register(Registry.BLOCK, new Identifier("craftyitems", "woodcutter"), WoodCutterBlock);
        Registry.register(Registry.BLOCK, new Identifier("craftyitems", "small_cooking_pot"), SmallCookingPotBlock);
        Registry.register(Registry.BLOCK, new Identifier("craftyitems", "mogu_shrine"), MoguShrineBlock);
        Registry.register(Registry.BLOCK, new Identifier("craftyitems","glasscutter"), GlassCutterBlock);

        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("craftyitems","woodcutter_block_entity"), WOODCUTTER_BLOCK_ENTITY);

        LOGGER.info("[CraftyItems] Done initializing all assets");
    }
}
