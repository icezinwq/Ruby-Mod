package net.icezinwq.rubymod.item;

import net.icezinwq.rubymod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTier {
    public static final Tier RUBY = new ForgeTier(1800, 8.5f, 3.5f, 12, ModTags.Blocks.NEEDS_RUBY_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get()),
            ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL);
}
