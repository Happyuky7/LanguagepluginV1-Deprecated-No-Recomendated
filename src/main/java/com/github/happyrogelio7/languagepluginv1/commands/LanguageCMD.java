package com.github.happyrogelio7.languagepluginv1.commands;

import java.util.ArrayList;
import java.util.List;

import com.github.happyrogelio7.languagepluginv1.*;
import com.github.happyrogelio7.languagepluginv1.managers.LanguagesManager;
import com.github.happyrogelio7.languagepluginv1.utils.MessagesUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LanguageCMD implements CommandExecutor {
    private LanguagepluginV1 plugin;

    public LanguageCMD(LanguagepluginV1 plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player)sender;
        if (args.length > 0) {
            if (args[0].equalsIgnoreCase("test")) {
                player.sendMessage(LanguagesManager.sendMsgLangString(player, "lang.test", "LanguagePlugin1122V1"));
                return true;
            }
            if (args[0].equalsIgnoreCase("testlist")) {
                List<String> lore1 = new ArrayList<>();
                ArrayList<String> lore2 = (ArrayList<String>)LanguagesManager.sendMsgLangStringList(player, "lang.testlist", "LanguagePlugin1122V1");
                for (String lorelist1 : lore2)
                    lore1.add(lorelist1);
                player.sendMessage(String.join("\n", lore1));
                return true;
            }
            if (args[0].equalsIgnoreCase("help")) {
                player.sendMessage(MessagesUtils.getMsgColor("&r "));
                player.sendMessage(MessagesUtils.getMsgColor("&a Languages &7| &3Help"));
                player.sendMessage(MessagesUtils.getMsgColor("&r"));
                player.sendMessage(MessagesUtils.getMsgColor("&7 <> Required &7&l|&r &7[] Optional"));
                player.sendMessage(MessagesUtils.getMsgColor("&r "));
                player.sendMessage(MessagesUtils.getMsgColor("&f * &a/language help"));
                player.sendMessage(MessagesUtils.getMsgColor("&f * &a/language info"));
                player.sendMessage(MessagesUtils.getMsgColor("&f * &a/language menu"));
                player.sendMessage(MessagesUtils.getMsgColor("&f * &a/language list"));
                player.sendMessage(MessagesUtils.getMsgColor("&f * &a/setlang <language>"));
                player.sendMessage(MessagesUtils.getMsgColor("&r "));
                return true;
            }
            if (args[0].equalsIgnoreCase("info") || args[0].equalsIgnoreCase("version")) {
                player.sendMessage(MessagesUtils.getMsgColor("&r "));
                player.sendMessage(MessagesUtils.getMsgColor("&a Language &7| &3Info:"));
                player.sendMessage(MessagesUtils.getMsgColor("&r "));
                player.sendMessage(MessagesUtils.getMsgColor("&f * &9version: &f1.0.1-SNAPSHOT"));
                player.sendMessage(MessagesUtils.getMsgColor("&f * &aCreated: &fHappyRogelio7"));
                player.sendMessage(MessagesUtils.getMsgColor("&f * &dGitHub: &fhttps://github.com/HappyRogelio7"));
                player.sendMessage(MessagesUtils.getMsgColor("&f * &6Website: &fhttps://happyrogelio7.github.io/index.html"));
                player.sendMessage(MessagesUtils.getMsgColor("&r "));
                return true;
            }
            if (args[0].equalsIgnoreCase("list")) {
                player.sendMessage(MessagesUtils.getMsgColor("&8[&aLangs&8]&r &fES_es&7, &fES_latam&7, &fEN_us&7, &fJP_ja&7."));
                return true;
            }
        } else {
            player.sendMessage(MessagesUtils.getMsgColor("&8[&aLangs&8]&r &3Usage: &f/language help"));
        }
        return true;
    }
}

