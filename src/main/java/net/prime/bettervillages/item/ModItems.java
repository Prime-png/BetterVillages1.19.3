package net.prime.bettervillages.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.prime.bettervillages.BetterVillages;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, BetterVillages.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTER_VILLAGES)));
    private static net.minecraft.world.item.ArmorMaterial ArmorMaterial;
    public static final RegistryObject<Item> ZIRCON_HELMET = ITEMS.register("zircon_helmet", () -> new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.BETTER_VILLAGES)));
    public static final RegistryObject<Item> ZIRCON_CHESTPLATE = ITEMS.register("zircon_chestplate", () -> new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.BETTER_VILLAGES)));
    public static final RegistryObject<Item> ZIRCON_LEGGINGS = ITEMS.register("zircon_leggings", () -> new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.BETTER_VILLAGES)));
    public static final RegistryObject<Item> ZIRCON_BOOTS = ITEMS.register("zircon_boots", () -> new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.BETTER_VILLAGES)));




    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
