package sweetierick.craftyitemsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class RosePineBlock extends Block {
    public RosePineBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }
}
