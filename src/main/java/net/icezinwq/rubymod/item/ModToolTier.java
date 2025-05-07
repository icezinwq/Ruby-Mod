package net.icezinwq.rubymod.item;

import net.icezinwq.rubymod.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTier {
    public static final Tier RUBY = new ForgeTier(1800, 8.5f, 3.5f, 12, ModTags.Blocks.NEEDS_RUBY_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get()),
            ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL);

    public static final Tier DARK_RUBY = new ForgeTier(2400, 9.5f, 4.5f, 24, ModTags.Blocks.NEEDS_DARK_RUBY_TOOL,
            () -> Ingredient.of(ModItems.DARK_RUBY.get()),
            ModTags.Blocks.INCORRECT_FOR_DARK_RUBY_TOOL);

    public static final Tier NETHERITE = new ForgeTier(2031, 9.0f, 4.0f, 15, ModTags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(Items.NETHERITE_INGOT),
                BlockTags.INCORRECT_FOR_NETHERITE_TOOL);
}
