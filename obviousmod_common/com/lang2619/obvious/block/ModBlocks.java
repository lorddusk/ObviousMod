package com.lang2619.obvious.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

import com.lang2619.obvious.lib.BlockIds;
import com.lang2619.obvious.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks
{

    public static Block obviousBlock;
    public static Block obviousOre;
    public static Block obviousOreGlowing;
    
    public static void init()
    {
        obviousBlock = new ObviousBlock(BlockIds.OBVIOUS_BLOCK, Material.rock).setHardness(3.0F).setUnlocalizedName("obviousBlock");
        obviousOre = new ObviousOre(BlockIds.OBVIOUS_ORE, Material.rock, false).setHardness(3.0F).setUnlocalizedName("obviousOre");
        obviousOreGlowing = (new ObviousOre(BlockIds.OBVIOUS_ORE_GLOWING, Material.rock, true)).setLightValue(0.625F).setHardness(3.0F).setUnlocalizedName("obviousOreGlowing");
        
        GameRegistry.registerBlock(obviousBlock, Reference.MOD_ID + (obviousBlock.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(obviousOre, Reference.MOD_ID + (obviousOre.getUnlocalizedName().substring(5)));
        
        LanguageRegistry.addName(new ItemStack(obviousBlock,1,0), "Obvious Block");
        LanguageRegistry.addName(new ItemStack(obviousOre,1,0), "Obvious Ore");
        
        
    }

}
