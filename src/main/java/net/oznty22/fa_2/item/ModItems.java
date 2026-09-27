package net.oznty22.fa_2.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oznty22.fa_2.FA_2;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FA_2.MOD_ID);

    public static final RegistryObject<Item> LALIVE_SIGN = ITEMS.register("lalive_sign",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LALIVE_HANGING_SIGN = ITEMS.register("lalive_hanging_sign",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
