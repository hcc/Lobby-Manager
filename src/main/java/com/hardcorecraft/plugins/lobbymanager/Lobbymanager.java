package com.hardcorecraft.plugins.lobbymanager;

import org.bukkit.plugin.java.JavaPlugin;

public final class Lobbymanager extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new LobbyListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
