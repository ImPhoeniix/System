package de.imphoeniix.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Felix 'ImPhoeniix' on 22.01.2017.
 */
public class CMD_koordinaten implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player)sender;

        if(p instanceof Player) {

            if(cmd.getName().equalsIgnoreCase("koordinaten")) {

                if(p.hasPermission("system.koordinaten")) {

                    if(args.length == 0) {
                        p.sendMessage("§7[§6System§7]§8: §cGib einen Spieler an.");
                    } else if(args.length == 1){
                        Player p1 = Bukkit.getPlayer(args[0]);
                        if(p1 != null) {
                            for(int i = 0; i != 1; i++) {
                                if(!args[0].equalsIgnoreCase(p.getName())) {
                                    p1.sendMessage("§7[§6System§7]§8: Der Spieler §6" + p.getDisplayName() + "§8hat die folgende Koordinaten gesendet:");
                                    p1.sendMessage("§7[§6System§7]§8: §aX§8: §9" + p.getLocation().getBlockX());
                                    p1.sendMessage("§7[§6System§7]§8: §aY§8: §9" + p.getLocation().getBlockY());
                                    p1.sendMessage("§7[§6System§7]§8: §aZ§8: §9" + p.getLocation().getBlockZ());

                                    p.sendMessage("§7[§6System§7]§8: Du hast dem Spieler §6" + p1.getDisplayName() + " §8deine Koordinaten gesendet!");

                                } else {
                                    p.sendMessage("§7[§6System§7]§8: §cDu kannst dir deine eigenen Koordinaten nicht senden!");
                                }
                            }
                        } else {
                            p.sendMessage("§7[§6System§7]§8: §cDieser Spieler wurde nicht gefunden!");
                        }
                    }

                } else {
                    p.sendMessage("§7[§6System§7]§8: §cDu hast nicht die Rechte!");
                }

            }



        } else {
            p.sendMessage("§7[§6System§7]§8: Du musst ein Spieler sein!");
        }

        return false;
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