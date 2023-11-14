package dev.riley.treesoftheworld.Init;


import dev.riley.treesoftheworld.TreesOfTheWorld;
import net.minecraft.client.gui.components.tabs.Tab;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = TreesOfTheWorld.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TreesOfTheWorld.MODID);


    public static final List<Supplier<? extends ItemLike>> TREES_OF_THE_WORLD_ITEMS = new ArrayList<>();
    public static final RegistryObject<CreativeModeTab> TREES_OF_THE_WORLD_TAB = TABS.register("trees_of_the_world_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.trees_of_the_world_tab"))
                    .icon(ItemInit.MAPLE_SAPLING.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {



                        output.accept(ItemInit.MAPLE_LOG.get());
                        output.accept(ItemInit.STRIPPED_MAPLE_LOG.get());
                        output.accept(ItemInit.MAPLE_WOOD.get());
                        output.accept(ItemInit.MAPLE_LEAVES.get());
                        output.accept(ItemInit.MAPLE_SAPLING.get());



                    })

                    .build()
    );


    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event){


    }



}




