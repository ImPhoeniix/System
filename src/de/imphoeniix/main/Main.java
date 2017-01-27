package de.imphoeniix.main;

import de.imphoeniix.commands.CMD_koordinaten;
import de.imphoeniix.listener.cmd_not_found;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Felix 'ImPhoeniiix' on 22.01.2017.
 */
public class Main extends JavaPlugin implements Listener{


    @Override
    public void onEnable() {
        System.out.println("[System]: Plugin erfolgreich aktiviert!");
        getCommand("koordinaten").setExecutor(new CMD_koordinaten());
        Bukkit.getPluginManager().registerEvents(new cmd_not_found(), this);
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        System.out.println("[System]: Plugin erfolgreich deaktiviert!");
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        String nachricht = e.getMessage();
        Player p = e.getPlayer();


            if(p.hasPermission("system.chat.moderator")) {
                e.setFormat(" §7[§cMOD§7] §c" + p.getName() + " §7: §8" + nachricht);
            } else if(p.hasPermission("system.chat.developer")) {
                e.setFormat(" §7[§3DEV§7] §3" + p.getName() + " §7: §8" + nachricht);
            } else if(p.hasPermission("system.chat.supporter")) {
                e.setFormat(" §7[§1SUP§7] §4" + p.getName() + " §7: §8" + nachricht);
            } else if(p.hasPermission("system.chat.premium")) {
                e.setFormat(" §a" + p.getName() + " §7: §8" + nachricht);
            } else {
                e.setFormat(" §e" + p.getName() + " §7: §8" + nachricht);
            }

    }

}
/*
*    §0 	\u00A70 	Schwarz 	black
*   §1 	\u00A71 	Dunkelblau 	dark_blue
*    §2 	\u00A72 	Dunkelgrün 	dark_green
*    §3 	\u00A73 	Dunkelaqua 	dark_aqua
*    §4 	\u00A74 	Dunkelrot 	dark_red
*    §5 	\u00A75 	Dunkelviolett 	dark_purple
*    §6 	\u00A76 	Gold 	gold
*    §7 	\u00A77 	Grau 	gray
*    §8 	\u00A78 	Dunkelgrau 	dark_gray
*    §9 	\u00A79 	Blau 	blue
*    §a 	\u00A7a 	Grün 	green
*    §c 	\u00A7c 	Rot 	red
*    §d 	\u00A7d 	Hellviolett 	light_purple
*    §e 	\u00A7e 	Gelb 	yellow
*    §f 	\u00A7f 	Weiß 	white
*/