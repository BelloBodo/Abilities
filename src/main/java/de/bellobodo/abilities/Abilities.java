package de.bellobodo.abilities;

import de.bellobodo.abilities.gui.GUIManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Abilities extends JavaPlugin {

    private Abilities instance;

    private GUIManager guiManager;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        guiManager = new GUIManager(instance);
    }

    @Override
    public void onDisable() {

    }

    public GUIManager getGuiManager() {
        return guiManager;
    }
}
