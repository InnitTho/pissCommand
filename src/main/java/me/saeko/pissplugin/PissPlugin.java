package me.saeko.pissplugin;

import me.saeko.pissplugin.Commands.pissCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class PissPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("piss").setExecutor(new pissCommand());
    }
}
