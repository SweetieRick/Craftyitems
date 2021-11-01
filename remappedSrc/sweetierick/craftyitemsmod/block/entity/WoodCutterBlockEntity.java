package sweetierick.craftyitemsmod.block.entity;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import sweetierick.craftyitemsmod.CraftyItemsMod;

public class WoodCutterBlockEntity extends BlockEntity {
    public WoodCutterBlockEntity(BlockEntityType<?> type) {
        super(CraftyItemsMod.WOODCUTTER_BLOCK_ENTITY);
    }
}
