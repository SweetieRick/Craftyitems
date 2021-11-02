package sweetierick.craftyitemsmod.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class RosePineItem extends Item {
    public RosePineItem(Settings settings) {
        super(settings);
    }

    @Deprecated
    @Override
    public void appendTooltip(ItemStack item, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.craftyitems.rose_pine.tooltip"));
    }
}