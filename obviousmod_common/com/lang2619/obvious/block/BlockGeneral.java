package com.lang2619.obvious.block;

import com.lang2619.obvious.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGeneral extends Block
{
    public BlockGeneral(int id, Material par2Material)
    {
        super(id, par2Material);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }
}
