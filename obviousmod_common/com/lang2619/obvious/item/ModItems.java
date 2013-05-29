package com.lang2619.obvious.item;

import com.lang2619.obvious.lib.ItemIds;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.Item;

public class ModItems
{

    public static Item obviousIngot;
    public static Item obviousDust;
    public static Item obviousSword;
    
    public static void init()
    {
        obviousIngot = new ObviousIngot(ItemIds.OBVIOUS_INGOT).setUnlocalizedName("obviousIngot");
        obviousDust = new ObviousDust(ItemIds.OBVIOUS_DUST).setUnlocalizedName("obviousDust");
        obviousSword = new ObviousSword(ItemIds.OBVIOUS_SWORD, ObviousEnumToolMaterial.OBVIOUS).setUnlocalizedName("obviousSword");
        
        LanguageRegistry.addName(obviousIngot, "Obvious Ingot");
        LanguageRegistry.addName(obviousDust, "Obvious Dust");
        LanguageRegistry.addName(obviousSword, "Obvious Sword");
        
       
    }

}
