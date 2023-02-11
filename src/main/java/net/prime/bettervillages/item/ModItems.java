package net.prime.bettervillages.item;

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
    public static final RegistryObject<Item> ZIRCON_HELMET = ITEMS.register("zircon_helmet", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTER_VILLAGES).fireResistant().stacksTo(1)));


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
