package com.lilbrocodes.icebluefps;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class IceBlueFPS extends JavaPlugin {
    @Override
    public void onEnable() {
        Logger logger = getLogger();
        logger.log(Level.INFO, "   _____       __      ____                              _____  ");
        logger.log(Level.INFO, "  / ____|     /_/     |  _ \\                         _  |  __ \\ ");
        logger.log(Level.INFO, " | |     ___  __ _    | |_) | ___ _ __   ___ ___    (_) | |  | |");
        logger.log(Level.INFO, " | |    / __|/ _` |   |  _ < / _ \\ '_ \\ / __/ _ \\       | |  | |");
        logger.log(Level.INFO, " | |____\\__ \\ (_| |   | |_) |  __/ | | | (_|  __/    _  | |__| |");
        logger.log(Level.INFO, "  \\_____|___/\\__,_|   |____/ \\___|_| |_|\\___\\___|   (_) |_____/");

    }

    @Override
    public void onDisable() {

    }
}
