package net.prime.bettervillages.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.prime.bettervillages.BetterVillages;

import java.awt.*;

public class ModCreativeModeTab {

    public static CreativeModeTab BETTER_VILLAGES;

    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
BETTER_VILLAGES = event.registerCreativeModeTab(new ResourceLocation(BetterVillages.MOD_ID, "better_villages"),
        builder -> builder.icon(() -> new ItemStack(ModItems.ZIRCON.get())).title(Component.literal("Better Villages")).build());

    }
}