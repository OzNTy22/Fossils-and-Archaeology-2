package net.oznty22.fa_2.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.oznty22.fa_2.FA_2;
import net.oznty22.fa_2.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FA_2.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FA_2_TAB = CREATIVE_MOD_TABS.register("fa_2_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LALIVE_SIGN.get()))
                    .title(Component.translatable("creativetab.fa_2_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LALIVE_SIGN.get());
                        pOutput.accept(ModItems.LALIVE_HANGING_SIGN.get());
                        pOutput.accept(ModBlocks.TEST_BLOCK.get());


                    })

                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
