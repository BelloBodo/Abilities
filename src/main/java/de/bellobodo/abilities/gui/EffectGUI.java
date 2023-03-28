package de.bellobodo.abilities.gui;

import de.bellobodo.abilities.gui.effects.Effects;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;

public class EffectGUI {

    Inventory inventory = Bukkit.createInventory(null, 27, "Choose Effects");

    ArrayList<Effects> registeredEffects = new ArrayList<>();

    private void setRegisteredEffects() {
        registeredEffects.add(, Material.FEATHER);
    }

    private void buildInventory() {

    }

}
