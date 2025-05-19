package net.icezinwq.rubymod.datagen;

import net.icezinwq.rubymod.RubyMod;
import net.icezinwq.rubymod.block.ModBlocks;
import net.icezinwq.rubymod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RubyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RAW_RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.DARK_RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_DARK_RUBY_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RAW_RUBY_BLOCK.get());


        tag(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .add(ModBlocks.RAW_RUBY_BLOCK.get())
                .add(ModBlocks.DARK_RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_DARK_RUBY_ORE.get())
                .add(ModBlocks.DARK_RUBY_BLOCK.get())
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_RUBY_TOOL);

        tag(ModTags.Blocks.NEEDS_DARK_RUBY_TOOL)
                .add(ModBlocks.DARK_RUBY_BLOCK.get())
                .addTag(ModTags.Blocks.NEEDS_RUBY_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_DARK_RUBY_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.INCORRECT_FOR_DARK_RUBY_TOOL);
    }
}