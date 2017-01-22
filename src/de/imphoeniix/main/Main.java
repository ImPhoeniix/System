package de.imphoeniix.main;

import de.imphoeniix.commands.CMD_koordinaten;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Felix 'ImPhoeniiix' on 22.01.2017.
 */
public class Main extends JavaPlugin{

    @Override
    public void onEnable() {
        System.out.println("[System]: Plugin erfolgreich aktiviert!");
        getCommand("koordinaten").setExecutor(new CMD_koordinaten());

    }

    @Override
    public void onDisable() {
        System.out.println("[System]: Plugin erfolgreich deaktiviert!");
    }
}
