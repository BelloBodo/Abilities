package de.bellobodo.abilities;

import de.bellobodo.abilities.commands.AbilitiesCommand;
import de.bellobodo.abilities.gui.GUIManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Abilities extends JavaPlugin {

    private GUIManager guiManager;

    @Override
    public void onEnable() {
        getCommand("abilities").setExecutor(new AbilitiesCommand(this));

        guiManager = new GUIManager(this);
    }

    @Override
    public void onDisable() {

    }

    public GUIManager getGuiManager() {
        return guiManager;
    }
}
