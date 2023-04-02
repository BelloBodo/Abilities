package de.bellobodo.abilities.gui;

import de.bellobodo.abilities.Abilities;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EditGUI {

    final GUIManager guiManager;

    Inventory inventory;

    String inventoryName;

    int level;

    String title;

    /**
     * Constructor of the EditGUI
     *
     * @param guiManager The Controlling GUI Manager.
     * @param inventoryName The Display Name of the Inventory.
     * @param previousLevel If the Effect has been previously the changed Value of the Effect.
     */
    public EditGUI(GUIManager guiManager, String inventoryName, int previousLevel) {
        this.guiManager = guiManager;
        this.inventoryName = inventoryName;
        this.level = previousLevel;
    }

    public EditGUI(GUIManager guiManager, String inventoryName, int previousLevel, String title) {
        this.guiManager = guiManager;
        this.inventoryName = inventoryName;
        this.level = previousLevel;
        this.title = title;
    }

    private void buildInventory() {
        if (title != null) {
            this.inventory = Bukkit.createInventory(null, 27, title);
        } else {
            this.inventory = Bukkit.createInventory(null, 27);
        }

        for (int i = 1; i  <= 27; i++) {
            switch (i) {
                case 13:
                    inventory.setItem(i,guiManager.getGuiItems().getAddValueItem());
                    break;
                case 14:
                    updateGetValueItem();
                    break;
                case 15:
                    inventory.setItem(i,guiManager.getGuiItems().getRemoveValueItem());
                    break;
                case 27:
                    inventory.setItem(i,guiManager.getGuiItems().getConfirmValueItem());
                    break;
                default:
                    inventory.setItem(i,guiManager.getGuiItems().getVoidItem());
            }
        }
    }

    private void updateGetValueItem() {
        ItemStack getValueItem = guiManager.getGuiItems().getGetValueItem();
        ItemMeta itemMeta = getValueItem.getItemMeta();

        itemMeta.setDisplayName(ChatColor.BLUE + "Level" + ChatColor.DARK_GRAY + ": " + ChatColor.GRAY + "0");

        getValueItem.setItemMeta(itemMeta);
        inventory.setItem(14, getValueItem);
    }

    public void openInventory(Player player) {
        buildInventory();
    }
}
