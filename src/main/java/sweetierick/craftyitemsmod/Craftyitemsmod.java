package sweetierick.craftyitemsmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/* import java.rmi.registry.Registry; */

public class Craftyitemsmod implements ModInitializer {
    // ? Registering all items
    public static final Item FabricPiece = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(64));
    public static final Item RosePine = new Item(new FabricItemSettings().group(ItemGroup.DECORATIONS).maxCount(16));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("craftydeco", "fabric_piece"), FabricPiece);
        Registry.register(Registry.ITEM, new Identifier("craftydeco", "rose_pine"), RosePine);
    }
}
