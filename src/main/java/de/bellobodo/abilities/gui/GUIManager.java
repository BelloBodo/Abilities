package de.bellobodo.abilities.gui;

import de.bellobodo.abilities.Abilities;
import de.bellobodo.abilities.items.GUIItems;
import org.bukkit.entity.Player;

public class GUIManager {

    private final Abilities instance;

    public GUIManager(Abilities instance) {
        this.instance = instance;
    }

    public void openEditGUI(Player player) {
        new EditGUI(this,"EDIT", 0).openInventory(player);
    }

    private GUIItems guiItems = new GUIItems();

    public Abilities getInstance() {
        return instance;
    }

    public GUIItems getGuiItems() {
        return guiItems;
    }
}
