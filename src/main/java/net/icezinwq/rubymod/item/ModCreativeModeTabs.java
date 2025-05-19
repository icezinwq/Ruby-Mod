package net.icezinwq.rubymod.item;

import net.icezinwq.rubymod.RubyMod;
import net.icezinwq.rubymod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RubyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RUBY_ITEMS_TAB = CREATIVE_MODE_TABS.register("ruby_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.rubymod.ruby_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                      output.accept(ModItems.RUBY.get());
                      output.accept(ModItems.RAW_RUBY.get());
                      output.accept(ModItems.DARK_RUBY.get());
                      output.accept(ModItems.DIAMOND_STICK.get());
                    }).build());


    public static final RegistryObject<CreativeModeTab> RUBY_BLOCKS_TAB = CREATIVE_MODE_TABS.register("ruby_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK.get()))
                    .withTabsBefore(RUBY_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.rubymod.ruby_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.RAW_RUBY_BLOCK.get());
                        output.accept(ModBlocks.DARK_RUBY_BLOCK.get());
                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        output.accept(ModBlocks.DARK_RUBY_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_DARK_RUBY_ORE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> RUBY_TOOLS_TAB = CREATIVE_MODE_TABS.register("ruby_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY_SWORD.get()))
                    .withTabsBefore(RUBY_BLOCKS_TAB.getId())
                    .title(Component.translatable("creativetab.rubymod.ruby_tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RUBY_SWORD.get());
                        output.accept(ModItems.RUBY_PICKAXE.get());
                        output.accept(ModItems.RUBY_AXE.get());
                        output.accept(ModItems.RUBY_SHOVEL.get());
                        output.accept(ModItems.RUBY_HOE.get());
                        output.accept(ModItems.DARK_RUBY_SWORD.get());
                        output.accept(ModItems.DARK_RUBY_PICKAXE.get());
                        output.accept(ModItems.DARK_RUBY_AXE.get());
                        output.accept(ModItems.DARK_RUBY_SHOVEL.get());
                        output.accept(ModItems.DARK_RUBY_HOE.get());
                        output.accept(ModItems.RUBY_HELMET.get());
                        output.accept(ModItems.RUBY_CHESTPLATE.get());
                        output.accept(ModItems.RUBY_LEGGINGS.get());
                        output.accept(ModItems.RUBY_BOOTS.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
