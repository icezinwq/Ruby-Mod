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

    public static final RegistryObject<Item> DIAMOND_STICK = ITEMS.register("diamond_stick",
            () -> new Item(new Item.Properties()));

    //Ruby Tools
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

    //Ruby Armor

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(10))));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(10))));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(10))));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(10))));
    //Dark Ruby Tools
    public static final RegistryObject<Item> DARK_RUBY_SWORD = ITEMS.register("dark_ruby_sword",
            () -> new SwordItem(ModToolTier.DARK_RUBY, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTier.DARK_RUBY, 3, -2.4f))));
    public static final RegistryObject<Item> DARK_RUBY_PICKAXE = ITEMS.register("dark_ruby_pickaxe",
            () -> new PickaxeItem(ModToolTier.DARK_RUBY, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTier.DARK_RUBY, 1, -2.8f))));
    public static final RegistryObject<Item> DARK_RUBY_SHOVEL = ITEMS.register("dark_ruby_shovel",
            () -> new ShovelItem(ModToolTier.DARK_RUBY, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTier.DARK_RUBY, 1.5f, -3.0f))));
    public static final RegistryObject<Item> DARK_RUBY_AXE = ITEMS.register("dark_ruby_axe",
            () -> new AxeItem(ModToolTier.DARK_RUBY, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTier.DARK_RUBY, 6, -3.2f))));
    public static final RegistryObject<Item> DARK_RUBY_HOE = ITEMS.register("dark_ruby_hoe",
            () -> new HoeItem(ModToolTier.DARK_RUBY, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTier.DARK_RUBY, 0, -3.0f))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
