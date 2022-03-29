package dev.sweetierick.craftyitems.registry;

import dev.sweetierick.craftyitems.item.FabricPieceItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class ItemRegistry {

    public static final Item FabricPiece = new FabricPieceItem(new FabricItemSettings().maxCount(1));
    public static final Item ThickString = new Item(new FabricItemSettings().maxCount(64));
    public static final Item PineDust = new Item(new FabricItemSettings().maxCount(64));
    public static final Item ScentedAshes = new Item(new FabricItemSettings().maxCount(64));
    public static final Item BakedApple = new Item(new FabricItemSettings().maxCount(64)
            .food(new FoodComponent.Builder().hunger(12).saturationModifier(0.6F).build()));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "fabric_piece"), FabricPiece);
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "thick_string"), ThickString);
        Registry.register(Registry.ITEM, new Identifier("craftyitems","pine_dust"), PineDust);
        Registry.register(Registry.ITEM, new Identifier("craftyitems","scented_ashes"), ScentedAshes);
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "baked_apple"), BakedApple);
    }
}