package dev.riley.treesoftheworld.Init.ModItems;

import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;

public class ModSaplingItem extends BushBlock  {
    public ModSaplingItem(Properties properties){
        super(properties);
    }

    @Override
    public boolean canBeReplaced(BlockState bstate, Fluid fluid) {
        return super.canBeReplaced(treesoftheworld.blocks.MAPLE_SAPLING, p_60536_);
    }

}
