package dev.sweetierick.craftyitems.block.entity;

import dev.sweetierick.craftyitems.registry.BlockEntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import dev.sweetierick.craftyitems.block.WoodCutterBlock;

public class WoodCutterBlockEntity extends BlockEntity {
    public WoodCutterBlockEntity() {
        super(BlockEntityRegistry.WOODCUTTER_BLOCK_ENTITY);
    }

    public static void clientTick(World world, BlockPos pos, BlockState state, WoodCutterBlockEntity blockEntity) {
        blockEntity.update();
    }

    public static void serverTick(World world, BlockPos pos, BlockState state, WoodCutterBlockEntity blockEntity) {
        blockEntity.update();
    }

    public WoodCutterBlockEntity get() {
        return this;
    }

    public void update() {
        WoodCutterBlock block = (WoodCutterBlock) this.getCachedState().getBlock();
    }
}
