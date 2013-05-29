package com.lang2619.obvious.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.lang2619.obvious.lib.Reference;

public class ItemGeneral extends Item
{
    public ItemGeneral(int id)
    {
        super(id);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }
}
