package dev.riley.treesoftheworld.Init;

import dev.riley.treesoftheworld.TreesOfTheWorld;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TreesOfTheWorld.MODID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",()
    -> new Item(new Item.Properties()));

    public static final RegistryObject<BlockItem>TEST_BLOCK = ITEMS.register("test_block",
            () -> new BlockItem(BlockInit.TEST_BLOCK.get(), new Item.Properties()));







}
