package com.nom0ri.glassmod.item;

import com.nom0ri.glassmod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab GLASS_TAB = new CreativeModeTab("glasstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.GLASS_SLAB.get());
        }
    };
}
