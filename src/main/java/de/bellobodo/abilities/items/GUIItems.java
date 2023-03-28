package de.bellobodo.abilities.items;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class GUIItems {

    private ItemStack voidItem;

    public ItemStack getVoidItem() {
        if (this.voidItem == null) {
            this.voidItem = new ItemStack(Material.PLAYER_HEAD);
            ItemMeta itemMeta = voidItem.getItemMeta();
            itemMeta.setDisplayName("");
            this.voidItem.setItemMeta(itemMeta);
        }
        return this.voidItem;
    }

    private ItemStack addValueItem;

    public ItemStack getAddValueItem() {
        if (this.addValueItem == null) {
            this.addValueItem = new ItemStack(Material.PLAYER_HEAD);
            SkullMeta skullMeta = (SkullMeta) this.addValueItem.getItemMeta();
            skullMeta.setOwningPlayer(Bukkit.getOfflinePlayer("MHF_arrowup"));
            skullMeta.setDisplayName(ChatColor.GREEN + "+1");
            this.addValueItem.setItemMeta(skullMeta);
        }
        return this.addValueItem;
    }

    private ItemStack removeValueItem;

    public ItemStack getRemoveValueItem() {
        if (this.removeValueItem == null) {
            this.removeValueItem = new ItemStack(Material.PLAYER_HEAD);
            SkullMeta skullMeta = (SkullMeta) this.removeValueItem.getItemMeta();
            skullMeta.setOwningPlayer(Bukkit.getOfflinePlayer("MHF_arrowdown"));
            skullMeta.setDisplayName(ChatColor.RED + "-1");
            this.removeValueItem.setItemMeta(skullMeta);
        }
        return this.removeValueItem;
    }

    private ItemStack getValueItem;

    public ItemStack getGetValueItem() {
        if (this.getValueItem == null) {
            this.getValueItem = new ItemStack(Material.PLAYER_HEAD);
            SkullMeta skullMeta = (SkullMeta) this.getValueItem.getItemMeta();
            skullMeta.setOwningPlayer(Bukkit.getOfflinePlayer("MHF_Question"));
            skullMeta.setDisplayName(ChatColor.BLUE + "Level" + ChatColor.DARK_GRAY + ": " + ChatColor.GRAY + "0");
            this.getValueItem.setItemMeta(skullMeta);
        }
        return this.getValueItem;
    }

    private ItemStack confirmValueItem;

    public ItemStack getConfirmValueItem() {
        if (this.confirmValueItem == null) {
            this.confirmValueItem = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
            ItemMeta itemMeta = this.confirmValueItem.getItemMeta();
            itemMeta.setDisplayName(ChatColor.GOLD + ChatColor.BOLD.toString() + "Bestätigen");
            this.confirmValueItem.setItemMeta(itemMeta);
        }
        return this.confirmValueItem;
    }
}
