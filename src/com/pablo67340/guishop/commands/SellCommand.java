package com.pablo67340.guishop.commands;

import com.pablo67340.guishop.Main;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class SellCommand extends BukkitCommand {

    public SellCommand(ArrayList<String> aliases) {
        super(aliases.remove(0));
        this.description = "Opens the sell menu.";
        this.setPermission("guishop.sell");
        this.setAliases(aliases);
    }

    @Override
    public boolean execute(CommandSender commandSender, String label, String[] args) {

        Player player = (Player) commandSender;

        Main.getINSTANCE().getUserCommands().sellCommand(player);

        return true;
    }
}
