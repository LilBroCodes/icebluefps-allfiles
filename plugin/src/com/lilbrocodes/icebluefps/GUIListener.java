package com.lilbrocodes.icebluefps;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.GameMode;

public class GUIListener implements Listener {
    private final Plugin plugin;

    public GUIListener(Plugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getInventory().getHolder() instanceof GUIHolder) {
            event.setCancelled(true); // Prevent item moving

            Player player = (Player) event.getWhoClicked();
            ItemStack clickedItem = event.getCurrentItem();

            if (clickedItem != null && clickedItem.getType() != Material.AIR) {
                switch (clickedItem.getType()) {
                    case DIAMOND_SWORD:
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage("Switched to Survival mode!");
                        break;
                    case ENDER_EYE:
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage("Switched to Spectator mode!");
                        break;
                    case DIAMOND_BLOCK:
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage("Switched to Creative mode!");
                        break;
                    case BOOKSHELF:
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage("Switched to Adventure mode!");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
