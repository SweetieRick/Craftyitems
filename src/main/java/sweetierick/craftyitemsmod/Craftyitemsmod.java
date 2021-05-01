package sweetierick.craftyitemsmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import sweetierick.craftyitemsmod.items.FabricPieceItem;
import sweetierick.craftyitemsmod.items.RosePineItem;

/* import java.rmi.registry.Registry; */

public class Craftyitemsmod implements ModInitializer {
    // ? Registering all items
    /**
     * The first of the list are active items,
     * items which have a proper individual classes
     * and they interact with the enviroment or
     * simply have useful tooltips to them
     */
    public static final Item FabricPiece = new FabricPieceItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));
    public static final Item RosePine = new RosePineItem(new FabricItemSettings().group(ItemGroup.DECORATIONS).maxCount(16));
    /**
     * This second array of items are
     * passive items, or items which have
     * a limited use and they don't require
     * separate classes for added logic
     */
    public static final Item ThickString = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(64));
    public static final Item PineDust = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(64));
    public static final Item ScentedAshes = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));

    @Override
    public void onInitialize() {
        // On initializing event
        // We register everything our mod handles
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "fabric_piece"), FabricPiece);
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "rose_pine"), RosePine);
        Registry.register(Registry.ITEM, new Identifier("craftyitems", "thick_string"), ThickString);
        Registry.register(Registry.ITEM, new Identifier("craftyitems","pine_dust"), PineDust);
        Registry.register(Registry.ITEM, new Identifier("craftyitems","scented_ashes"), ScentedAshes);
    }
}
