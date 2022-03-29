package dev.sweetierick.craftyitems;

import dev.sweetierick.craftyitems.registry.BlockEntityRegistry;
import dev.sweetierick.craftyitems.registry.BlockRegistry;
import dev.sweetierick.craftyitems.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.logging.Logger;

public class CraftyItems implements ModInitializer {
    public static final Logger LOGGER = Logger.getLogger("Logger");
    public static ItemGroup CRAFTYITEMS_GROUP;

    @Override
    public void onInitialize() {
        LOGGER.info("[CraftyItems] Initializing the modfile! Be right back");

        ItemRegistry.register();
        BlockRegistry.register();
        BlockEntityRegistry.register();

        CRAFTYITEMS_GROUP = FabricItemGroupBuilder.create(new Identifier("craftyitems","creative_tab"))
                .icon(() -> new ItemStack(Items.GLOBE_BANNER_PATTERN))
                .appendItems(stacks -> {
                    stacks.add(new ItemStack(BlockRegistry.RosePineBlock));
                    stacks.add(new ItemStack(ItemRegistry.FabricPiece));
                    stacks.add(new ItemStack(ItemRegistry.ThickString));
                    stacks.add(new ItemStack(ItemRegistry.PineDust));
                    stacks.add(new ItemStack(ItemRegistry.ScentedAshes));
                    stacks.add(new ItemStack(BlockRegistry.WoodCutterBlock));
                    stacks.add(new ItemStack(BlockRegistry.GlassCutterBlock));
                    stacks.add(new ItemStack(BlockRegistry.SmallCookingPotBlock));
                    stacks.add(new ItemStack(BlockRegistry.MoguShrineBlock));
                    stacks.add(new ItemStack(ItemRegistry.BakedApple));
                }).build();

        // TODO Ok the items work but blocks still die on me :'(

        LOGGER.info("[CraftyItems] Done initializing all assets");
    }
}
