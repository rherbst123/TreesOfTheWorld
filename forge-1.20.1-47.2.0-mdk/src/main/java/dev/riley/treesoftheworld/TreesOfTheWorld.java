package dev.riley.treesoftheworld;


import dev.riley.treesoftheworld.Init.BlockInit;
import dev.riley.treesoftheworld.Init.CreativeTabInit;
import dev.riley.treesoftheworld.Init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.antlr.runtime.tree.Tree;

@Mod(TreesOfTheWorld.MODID)
public class TreesOfTheWorld {

    public static final String MODID = "treesoftheworld";

    public TreesOfTheWorld(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);

    }

}


