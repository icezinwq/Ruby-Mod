package net.icezinwq.rubymod.item;

import net.icezinwq.rubymod.RubyMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RubyMod.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DARK_RUBY = ITEMS.register("dark_ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTier.RUBY, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTier.RUBY, 3, -2.4f))));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTier.RUBY, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTier.RUBY, 1, -2.8f))));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTier.RUBY, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTier.RUBY, 1.5f, -3.0f))));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTier.RUBY, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTier.RUBY, 6, -3.2f))));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTier.RUBY, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTier.RUBY, 0, -3.0f))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
