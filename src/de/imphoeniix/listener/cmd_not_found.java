package de.imphoeniix.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.help.HelpTopic;

/**
 * Created by Felix 'ImPhoeniix' on 27.01.2017.
 */
public class cmd_not_found implements Listener {

    @EventHandler
    public void on(PlayerCommandPreprocessEvent e) {
        Player p = e.getPlayer();

        String praefix = "§7[§6System§7]§8: ";

        String cmd = e.getMessage().split(" ")[0];

        HelpTopic helptopic = Bukkit.getHelpMap().getHelpTopic(cmd);

        if(helptopic == null) {

            p.sendMessage(praefix + "Der Befehl " + e.getMessage() + " wurde nicht gefunden!");

            e.setCancelled(true);
        } else {
            e.setCancelled(false);
        }
    }
}
