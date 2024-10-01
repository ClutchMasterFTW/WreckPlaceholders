package me.clutchmasterftw.wreckplaceholders;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class WreckPlaceholders extends JavaPlugin implements Listener {
    private static WreckPlaceholders plugin;

    public static WreckPlaceholders getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        Logger logger = getLogger();

        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new RankupPlaceholder().register();
        } else {
            logger.severe("Could not find PlaceholderAPI! This plugin is required.");
            Bukkit.getPluginManager().disablePlugin(this);
        }

        logger.info("WreckPlaceholders has successfully loaded!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}