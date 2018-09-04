package ru.shurshitel.mightyquest;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.shurshitel.mightyquest.proxy.CommonProxy;

@Mod(modid = "mightyquest")

public class Main{

	@SidedProxy(clientSide = "ru.shurshitel.mightyquest.proxy.ClientProxy", serverSide = "ru.shurshitel.mightyquest.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
	    System.out.println("\u001B[32m" + "[Starting MIGHTYQUEST PRE-INITIALIZATION]" + "\u001B[0m");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
	    System.out.println("\u001B[32m" + "[Starting MIGHTYQUEST INITIALIZATION]" + "\u001B[0m");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
	    System.out.println("\u001B[32m" + "[Starting Test Mod POST-INITIALIZATION]" + "\u001B[0m");
	}
	
	
	
	
}
