/*package com.github.happyrogelio7.languagepluginv1.commandsexamplegithub;

import com.github.happyrogelio7.languagepluginv1.LanguagepluginV1;
import com.github.happyrogelio7.languagepluginv1.managers.LanguagesManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExampleStringCMD implements CommandExecutor {

    private LanguagepluginV1 plugin;

    public ExampleStringCMD(LanguagepluginV1 plugin){
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "This command can only be executed by a player.");
            return false;

        }else{

            Player player = (Player)sender;
            player.sendMessage(LanguagesManager.sendMsgLangString(player, "MSG", "LanguagepluginV1"));

        }

        return true;

    }
}
*/