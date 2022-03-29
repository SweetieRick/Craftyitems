package dev.sweetierick.craftyitems.registry;

import dev.sweetierick.craftyitems.block.entity.WoodCutterBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class BlockEntityRegistry {
    public static BlockEntityType<WoodCutterBlockEntity> WOODCUTTER_BLOCK_ENTITY = BlockEntityType.Builder.create(WoodCutterBlockEntity::new, BlockRegistry.WoodCutterBlock).build(null);

    public static void register() {
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("craftyitems","woodcutter_block_entity"), WOODCUTTER_BLOCK_ENTITY);
    }
}