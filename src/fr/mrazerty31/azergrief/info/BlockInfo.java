package fr.mrazerty31.azergrief.info;

import java.io.Serializable;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import fr.mrazerty31.azergrief.Utils;

public class BlockInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String action;
	private Material material;
	private byte data;
	private Location location;
	private Player placer;
	
	public BlockInfo(String action, Material material, byte data, Location location, Player placer) {
		this.action = action;
		this.material = material;
		this.data = data;
		this.location = location;
		this.placer = placer;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public Material getMaterial() {
		return material;
	}
	
	public void setMaterial(Material material) {
		this.material = material;
	}
	
	public byte getData() {
		return data;
	}
	
	public void setData(byte data) {
		this.data = data;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Player getPlacer() {
		return placer;
	}
	
	public void setPlacer(Player placer) {
		this.placer = placer;
	}
	
	@Override
	public String toString() {
		return Utils.getHourTime()+" : action:"+action+", mat: "+this.material.toString()+", data:"+this.data+", world: "+location.getWorld().getName()+", loc: x "+location.getBlockX()+",y "+
				location.getBlockY()+",z "+location.getBlockZ()+", placer: "+placer.getName();
	}
	
}
