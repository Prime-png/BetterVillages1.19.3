package net.prime.bettervillages.Entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.prime.bettervillages.BetterVillages;

public class Entity {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BetterVillages.MOD_ID);

    public static final RegistryObject<EntityType<BetterVillager>> BAISIC = ENTITIES.register("baisic",
            () -> EntityType.Builder.of(BetterVillager::new, MobCategory.MISC).sized(1, 2).build(BetterVillages.MOD_ID + ":baisic"));
}
