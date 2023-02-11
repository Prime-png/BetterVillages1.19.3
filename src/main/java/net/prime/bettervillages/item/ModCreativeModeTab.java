package net.prime.bettervillages.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BETTER_VILLAGES = new CreativeModeTab("bettervillages") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON_HELMET.get());
        }
    };
}
