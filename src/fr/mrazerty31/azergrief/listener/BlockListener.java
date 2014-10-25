package fr.mrazerty31.azergrief.listener;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import fr.mrazerty31.azergrief.Utils;
import fr.mrazerty31.azergrief.info.BlockInfo;

public class BlockListener implements Listener {
	
	@EventHandler
	public void blockPlace(BlockPlaceEvent e) {
		Block b = e.getBlock();
		Player p = e.getPlayer();
		@SuppressWarnings("deprecation")
		BlockInfo bi = new BlockInfo("place", b.getType(), b.getData(), b.getLocation(), p);
		Utils.writeToLog(bi.toString());
	}
	
	@EventHandler
	public void blockPlace(BlockBreakEvent e) {
		Block b = e.getBlock();
		Player p = e.getPlayer();
		@SuppressWarnings("deprecation")
		BlockInfo bi = new BlockInfo("break", b.getType(), b.getData(), b.getLocation(), p);
		Utils.writeToLog(bi.toString());
	}
	
}
