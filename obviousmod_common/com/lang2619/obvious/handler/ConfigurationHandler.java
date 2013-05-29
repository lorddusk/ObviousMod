package com.lang2619.obvious.handler;

import java.io.File;
import java.util.logging.Level;

import com.lang2619.obvious.lib.BlockIds;
import com.lang2619.obvious.lib.ItemIds;
import com.lang2619.obvious.lib.Reference;
import com.lang2619.obvious.lib.Strings;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler
{
    public static Configuration configuration;
    
    public static final String CATEGORY_BLOCK_PROPERTIES = Configuration.CATEGORY_BLOCK + Configuration.CATEGORY_SPLITTER + "properties";
    
    public static void init(File configFile)
    {
        configuration = new Configuration(configFile);
        
        try {
            configuration.load();
            
            //Blocks
            BlockIds.OBVIOUS_BLOCK = configuration.getBlock(Strings.BLOCK_NAME, BlockIds.OBVIOUS_BLOCK_DEFAULT).getInt(BlockIds.OBVIOUS_BLOCK_DEFAULT);
            BlockIds.OBVIOUS_ORE = configuration.getBlock(Strings.ORE_NAME, BlockIds.OBVIOUS_ORE_DEFAULT).getInt(BlockIds.OBVIOUS_ORE_DEFAULT);
            BlockIds.OBVIOUS_ORE_GLOWING = configuration.getBlock(Strings.ORE_GLOWING_NAME, BlockIds.OBVIOUS_ORE_GLOWING_DEFAULT).getInt(BlockIds.OBVIOUS_ORE_GLOWING_DEFAULT);
            
            //Items
            ItemIds.OBVIOUS_DUST = configuration.getItem(Strings.DUST_NAME, ItemIds.OBVIOUS_DUST_DEFAULT).getInt(ItemIds.OBVIOUS_DUST_DEFAULT);
            ItemIds.OBVIOUS_INGOT = configuration.getItem(Strings.INGOT_NAME, ItemIds.OBVIOUS_INGOT_DEFAULT).getInt(ItemIds.OBVIOUS_INGOT_DEFAULT);
            ItemIds.OBVIOUS_SWORD = configuration.getItem(Strings.SWORD_NAME, ItemIds.OBVIOUS_SWORD_DEFAULT).getInt(ItemIds.OBVIOUS_SWORD_DEFAULT);
        }
        catch(Exception e){
            FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
        }
        finally {
            configuration.save();
        }
    }
    
    public static void set(String categoryName, String propertyName, String newValue)
    {
        configuration.load();
        if(configuration.getCategoryNames().contains(categoryName)){
            if(configuration.getCategory(categoryName).containsKey(propertyName)){
                configuration.getCategory(categoryName).get(propertyName).set(newValue);
            }
        }
        configuration.save();
    }
}
