package dev.riley.treesoftheworld.Init;


import dev.riley.treesoftheworld.Init.ModItems.ModLogItems;
import dev.riley.treesoftheworld.Init.ModItems.ModPlankItems;
import dev.riley.treesoftheworld.Init.ModItems.ModSaplingItem;
import dev.riley.treesoftheworld.Init.ModItems.TreeGrowers.BaobabTreeGrower;
import dev.riley.treesoftheworld.Init.ModItems.TreeGrowers.MapleTreeGrower;
import dev.riley.treesoftheworld.Init.ModItems.TreeGrowers.WillowTreeGrower;
import dev.riley.treesoftheworld.TreesOfTheWorld;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

                @Override
                protected boolean decaying(@NotNull BlockState state) {
                    return  state.getValue(DISTANCE) == 10;
                }
            });

    public static final RegistryObject<Block> MAPLE_SAPLING = BLOCKS.register("maple_sapling",
            () -> new SaplingBlock(new MapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));



    //Willow Stuff!!
    //Ok, so I have to do all the shit manually from now on for axe stripping. This is because I dont know how to add more to the 
    //Mod Log items so Ill just do it here.
    public static final RegistryObject<Block> WILLOW_LOG = BLOCKS.register("willow_log",
            () -> new ModLogItems(Properties.copy(Blocks.OAK_LOG)){
                @Nullable
                @Override
                public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
                    if (context.getItemInHand().getItem() instanceof AxeItem) {
                        if (state.is(BlockInit.WILLOW_LOG.get()  )) {
                            return BlockInit.STRIPPED_WILLOW_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                        }



                    }

                    return super.getToolModifiedState(state, context, toolAction, simulate);
                }
            });

    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = BLOCKS.register("stripped_willow_log",
            () -> new ModLogItems(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> WILLOW_WOOD = BLOCKS.register("willow_wood",
            () -> new ModPlankItems(Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<SaplingBlock> WILLOW_SAPLING = BLOCKS.register("willow_sapling",
            () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<LeavesBlock> WILLOW_LEAVES = BLOCKS.register("willow_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    //BAOBAB Treeeeeee
    public static final RegistryObject<Block> BAOBAB_LOG = BLOCKS.register("baobab_log",
            () -> new ModLogItems(Properties.copy(Blocks.OAK_LOG)){
                @Nullable
                @Override
                public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
                    if (context.getItemInHand().getItem() instanceof AxeItem) {
                        if (state.is(BlockInit.BAOBAB_LOG.get()  )) {
                            return BlockInit.STRIPPED_BAOBAB_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                        }



                    }

                    return super.getToolModifiedState(state, context, toolAction, simulate);
                }
            });

    public static final RegistryObject<Block> STRIPPED_BAOBAB_LOG = BLOCKS.register("stripped_baobab_log",
            () -> new ModLogItems(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> BAOBAB_WOOD = BLOCKS.register("baobab_wood",
            () -> new ModPlankItems(Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<SaplingBlock> BAOBAB_SAPLING = BLOCKS.register("baobab_sapling",
            () -> new SaplingBlock(new BaobabTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<LeavesBlock> BAOBAB_LEAVES = BLOCKS.register("baobab_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    


    //not sure why i need this but its there and it crashes if i dont have it.
    public BlockInit(Properties p_49795_) {
        super(p_49795_);
    }
}
