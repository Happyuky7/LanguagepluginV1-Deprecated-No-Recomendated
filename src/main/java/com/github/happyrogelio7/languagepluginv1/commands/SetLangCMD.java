package com.github.happyrogelio7.languagepluginv1.commands;

import java.util.ArrayList;
import java.util.List;

import com.github.happyrogelio7.languagepluginv1.LanguagepluginV1;
import com.github.happyrogelio7.languagepluginv1.managers.LanguagesManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

public class SetLangCMD implements CommandExecutor, TabCompleter {
    private LanguagepluginV1 plugin;

    public SetLangCMD(LanguagepluginV1 plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player)sender;
        if (args.length > 0) {
            if (args[0].equalsIgnoreCase("ES_es")) {
                LanguagesManager.setlanguage(player, "ES_es");
                player.sendMessage(LanguagesManager.sendMsgLangString(player, "lang.select", this.plugin.nameplugin1)
                        .replaceAll("%prefix%", LanguagesManager.sendMsgLangString(player, "lang.general.prefix", this.plugin.nameplugin1)));
                return true;
            }
            if (args[0].equalsIgnoreCase("ES_latam")) {
                LanguagesManager.setlanguage(player, "ES_latam");
                player.sendMessage(LanguagesManager.sendMsgLangString(player, "lang.select", this.plugin.nameplugin1)
                        .replaceAll("%prefix%", LanguagesManager.sendMsgLangString(player, "lang.general.prefix", this.plugin.nameplugin1)));
                return true;
            }
            if (args[0].equalsIgnoreCase("EN_us")) {
                LanguagesManager.setlanguage(player, "EN_us");
                player.sendMessage(LanguagesManager.sendMsgLangString(player, "lang.select", this.plugin.nameplugin1)
                        .replaceAll("%prefix%", LanguagesManager.sendMsgLangString(player, "lang.general.prefix", this.plugin.nameplugin1)));
                return true;
            }
            if (args[0].equalsIgnoreCase("JP_ja")) {
                LanguagesManager.setlanguage(player, "JP_ja");
                player.sendMessage(LanguagesManager.sendMsgLangString(player, "lang.select", this.plugin.nameplugin1)
                        .replaceAll("%prefix%", LanguagesManager.sendMsgLangString(player, "lang.general.prefix", this.plugin.nameplugin1)));
                return true;
            }
            return true;
        }
        player.sendMessage(LanguagesManager.sendMsgLangString(player, "lang.general.setlangerror", this.plugin.nameplugin1)
                .replaceAll("%prefix%", LanguagesManager.sendMsgLangString(player, "lang.general.prefix", this.plugin.nameplugin1)));
        return true;
    }

    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            List<String> arguments = new ArrayList<>();
            arguments.add("EN_us");
            arguments.add("ES_es");
            arguments.add("ES_latam");
            arguments.add("JP_ja");
            return arguments;
        }
        return null;
    }
}

