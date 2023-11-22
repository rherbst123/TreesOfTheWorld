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



    //Maple Stuff
    public static final RegistryObject<BlockItem>MAPLE_LOG = ITEMS.register("maple_log",
            () -> new BlockItem(BlockInit.MAPLE_LOG.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem>STRIPPED_MAPLE_LOG = ITEMS.register("stripped_maple_log",
            () -> new BlockItem(BlockInit.STRIPPED_MAPLE_LOG.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem>MAPLE_WOOD = ITEMS.register("maple_wood",
            () -> new BlockItem(BlockInit.MAPLE_WOOD.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem>MAPLE_LEAVES = ITEMS.register("maple_leaves",
            () -> new BlockItem(BlockInit.MAPLE_LEAVES.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem>MAPLE_SAPLING = ITEMS.register("maple_sapling",
            () -> new BlockItem(BlockInit.MAPLE_SAPLING.get(), new Item.Properties()));



    //Willow Stuff
    public static final RegistryObject<BlockItem>WILLOW_LOG = ITEMS.register("willow_log",
            () -> new BlockItem(BlockInit.WILLOW_LOG.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem>STRIPPED_WILLOW_LOG = ITEMS.register("stripped_willow_log",
            () -> new BlockItem(BlockInit.STRIPPED_WILLOW_LOG.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem>WILLOW_WOOD = ITEMS.register("willow_wood",
            () -> new BlockItem(BlockInit.WILLOW_WOOD.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem>WILLOW_LEAVES = ITEMS.register("willow_leaves",
            () -> new BlockItem(BlockInit.WILLOW_LEAVES.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem>WILLOW_SAPLING = ITEMS.register("willow_sapling",
            () -> new BlockItem(BlockInit.WILLOW_SAPLING.get(), new Item.Properties()));











}
