package com.github.happyrogelio7.languagepluginv1.utils;

import org.bukkit.ChatColor;

public class MessagesUtils {
    public static String getMsgColor(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}