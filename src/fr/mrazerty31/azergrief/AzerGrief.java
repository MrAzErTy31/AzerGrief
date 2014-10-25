package fr.mrazerty31.azergrief;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import fr.mrazerty31.azergrief.listener.BlockListener;
import fr.mrazerty31.azergrief.listener.PlayerListener;

public class AzerGrief extends JavaPlugin {
	
	public static AzerGrief instance;
	public static FileConfiguration config;
	
	public void onEnable() {
		instance = this;
		config = this.getConfig();
		initClasses();
		this.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		this.getServer().getPluginManager().registerEvents(new BlockListener(), this);
		if(!getDataFolder().exists()) getDataFolder().mkdir();
		Utils.writeToLog("###- " + Utils.getCurrentTime() + " Anti-Grief Log -###");
	}
	
	public void onDisable() {
		Utils.log.delete();
	}
	
	void initClasses() {
		Utils.init();
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		return true;
	}
}
