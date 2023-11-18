package com.lilbrocodes.icebluefps;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GameModeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("Only players can use this command!");
            return true;
        }

        // Create inventory
        Inventory gui = null;
        gui = Bukkit.createInventory(new GUIHolder(gui), 9, "Game Mode Switcher");

        // Add buttons to the inventory
        gui.setItem(0, createButtonItem(Material.DIAMOND_SWORD, "Survival"));
        gui.setItem(2, createButtonItem(Material.ENDER_EYE, "Spectator"));
        gui.setItem(4, createButtonItem(Material.DIAMOND_BLOCK, "Creative"));
        gui.setItem(6, createButtonItem(Material.BOOKSHELF, "Adventure"));
        // Open the inventory for the player
        player.openInventory(gui);

        return true;
    }

    private ItemStack createButtonItem(Material material, String displayName) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();

        assert meta != null;
        meta.setDisplayName(ChatColor.RESET + displayName);
        item.setItemMeta(meta);
        return item;
    }
}
