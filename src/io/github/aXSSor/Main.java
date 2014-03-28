package io.github.aXSSor;

import java.util.logging.Logger;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
    private static final Logger log = Logger.getLogger("Minecraft");
    public static Economy econ = null;

	
	public void onEnable(){
		System.out.println(ChatColor.GREEN + "> Player Status - Created by aXSSor - Running on " + Bukkit.getBukkitVersion());
        if (!setupEconomy() ) {
            log.severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
	}
	
	public void onDisable(){
		System.out.println(ChatColor.RED + "> Player Status - DISABLED");
	}
	
	private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

	 public boolean onCommand(CommandSender sender, Command cmd, String label, String[] a) {
		    Player player = (Player)sender;


		    if (cmd.getName().equalsIgnoreCase("stats")) {
		      if (player.hasPermission("stats.user"))
		    	  stats(player);
		      else {
		        player.sendMessage(ChatColor.RED + " You cannot access this feature! If you believe this is an error, Type /report");
		      }
		    }
		    return false;
		  }
	 /*untuk bagian rank tolong kasih permission nya group.(namagroup) pake funsi if*/
	 
	 public void stats(Player player) {
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(" ");
		 player.sendMessage(ChatColor.BLUE + "User§3> §a§l" + player.getDisplayName());
		 player.sendMessage(ChatColor.BLUE + "Balance§3> §a§l" + econ.getBalance(player.getName()));
		 player.sendMessage(ChatColor.BLUE + "Gamemode§3> §a§l"+ player.getGameMode());
		 player.sendMessage(ChatColor.BLUE + "M-Cash§3> " + "§c§lComing Soon");
		 player.sendMessage(ChatColor.BLUE + "Ip Address§3> §a§l" + player.getAddress());
		 if (player.isOp())
			 player.sendMessage(ChatColor.BLUE + "Operator§3> " + "§a§lYes");
		 else {
			 player.sendMessage(ChatColor.BLUE + "Operator§3> " + "§c§lNo");
		 }
		 player.sendMessage(ChatColor.BLUE + "Level§3> §a§l" + player.getLevel());
		 player.sendMessage(ChatColor.BLUE + "Version§3> " + "§f§l0.5 OPEN BETA");
		 player.sendMessage(ChatColor.BLUE + "Server Health§3> " + "§a§l+A");
		 player.sendMessage(ChatColor.BLUE + "Rank§3> " + "§c§lComing Soon");
		 
		 
		 
		 
		 
		 
		 

		 
	 }
	 
	 
	 
	 
}
