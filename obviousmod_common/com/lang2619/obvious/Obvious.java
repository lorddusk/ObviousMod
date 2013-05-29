package com.lang2619.obvious;

import java.io.File;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.lang2619.obvious.block.ModBlocks;
import com.lang2619.obvious.event.WorldGen;
import com.lang2619.obvious.handler.ConfigurationHandler;
import com.lang2619.obvious.item.ModItems;
import com.lang2619.obvious.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Obvious
{
    WorldGen eventmanager = new WorldGen();
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsoluteFile() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
        
        ModBlocks.init();
        ModItems.init();
    }
    
    @Init
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.obviousBlock), new Object[]{   "XX", "XX", Character.valueOf('X'), ModItems.obviousIngot });
        GameRegistry.addRecipe(new ItemStack(ModItems.obviousSword), new Object[]{   "X", "X", "S", Character.valueOf('X'), ModItems.obviousIngot, Character.valueOf('S'), Item.stick });
        FurnaceRecipes.smelting().addSmelting(ModItems.obviousDust.itemID, 0, new ItemStack(ModItems.obviousIngot), 0.1F);
        GameRegistry.registerWorldGenerator(eventmanager);
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
    
    
}