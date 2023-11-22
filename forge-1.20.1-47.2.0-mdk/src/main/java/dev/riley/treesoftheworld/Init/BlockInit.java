package dev.riley.treesoftheworld.Init;


import dev.riley.treesoftheworld.Init.ModItems.ModLogItems;
import dev.riley.treesoftheworld.Init.ModItems.ModPlankItems;
import dev.riley.treesoftheworld.Init.ModItems.ModSaplingItem;
import dev.riley.treesoftheworld.Init.ModItems.TreeGrowers.MapleTreeGrower;
import dev.riley.treesoftheworld.Init.ModItems.TreeGrowers.WillowTreeGrower;
import dev.riley.treesoftheworld.TreesOfTheWorld;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit extends Block {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TreesOfTheWorld.MODID);

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));


    //Maple Stuuff
    public static final RegistryObject<ModLogItems> MAPLE_LOG = BLOCKS.register("maple_log",
            () -> new ModLogItems(Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = BLOCKS.register("stripped_maple_log",
            () -> new ModLogItems(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> MAPLE_WOOD = BLOCKS.register("maple_wood",
            () -> new ModPlankItems(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    //leaves, copy this for each one
    public static final RegistryObject<LeavesBlock> MAPLE_LEAVES = BLOCKS.register("maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 50;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> MAPLE_SAPLING = BLOCKS.register("maple_sapling",
            () -> new SaplingBlock(new MapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));



    //Willow Stuff!!
    public static final RegistryObject<Block> WILLOW_LOG = BLOCKS.register("willow_log",
            () -> new ModLogItems(Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = BLOCKS.register("stripped_willow_log",
            () -> new ModLogItems(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> WILLOW_WOOD = BLOCKS.register("willow_wood",
            () -> new ModPlankItems(Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<SaplingBlock> WILLOW_SAPLING = BLOCKS.register("willow_sapling",
            () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<LeavesBlock> WILLOW_LEAVES = BLOCKS.register("willow_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));









    //not sure why i need this but its there
    public BlockInit(Properties p_49795_) {
        super(p_49795_);
    }
}
