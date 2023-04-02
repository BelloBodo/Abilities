package de.bellobodo.abilities.commands;

import de.bellobodo.abilities.Abilities;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AbilitiesCommand implements CommandExecutor {

    public final Abilities instance;

    public AbilitiesCommand(Abilities instance) {
        this.instance = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        instance.getGuiManager().openEditGUI((Player) sender);

        return true;
    }
}
