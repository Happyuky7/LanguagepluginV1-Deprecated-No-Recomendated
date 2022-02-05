package com.github.happyrogelio7.languagepluginv1.managers;

import com.github.happyrogelio7.languagepluginv1.LanguagepluginV1;
import com.github.happyrogelio7.languagepluginv1.utils.MessagesUtils;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LanguagesManager {

    private LanguagepluginV1 plugin;

    public LanguagesManager(LanguagepluginV1 plugin) {
        this.plugin = plugin;
    }

    private static File file0 = new File("plugins//"+"LanguagepluginV1"+"//data//"+"playerdata"+".yml");
    private static YamlConfiguration fileload0 = YamlConfiguration.loadConfiguration(file0);

    public static void setlanguage(Player player, String language) {
        UUID uuid = player.getUniqueId();

        fileload0.set(uuid + ".name", player.getName());
        fileload0.set(uuid + ".language", language);
        try {
            fileload0.save(file0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*LanguagepluginV1.getInstance().getPlayerData().set(uuid + ".name", player.getName());
        LanguagepluginV1.getInstance().getPlayerData().set(uuid + ".language", language);
        LanguagepluginV1.getInstance().getPlayerData().save();
        LanguagepluginV1.getInstance().getPlayerData().reload();*/
    }

    public static  String getlanguage(Player player){
        UUID uuid = player.getUniqueId();
        return fileload0.getString(uuid + ".language");
        //return LanguagepluginV1.getInstance().getPlayerData().getString(uuid + ".language");
    }

    public static String sendMsgLangString(Player player, String path, String pluginname){
        UUID uuid = player.getUniqueId();
        File file1 = new File("plugins/"+pluginname+"/lang/"+"EN_us"+".yml");
        YamlConfiguration fileload1 = YamlConfiguration.loadConfiguration(file1);
        ////////////////
        File file2 = new File("plugins/"+pluginname+"/lang/"+"ES_es"+".yml");
        YamlConfiguration fileload2 = YamlConfiguration.loadConfiguration(file2);
        ////////////////
        File file3 = new File("plugins/"+pluginname+"/lang/"+"ES_latam"+".yml");
        YamlConfiguration fileload3 = YamlConfiguration.loadConfiguration(file3);
        ////////////////
        File file4 = new File("plugins/"+pluginname+"//lang/"+"JP_ja"+".yml");
        YamlConfiguration fileload4 = YamlConfiguration.loadConfiguration(file4);
        if (LanguagesManager.getlanguage(player) == "EN_us"){
            return MessagesUtils.getMsgColor(fileload1.getString(path));
        }
        if (LanguagesManager.getlanguage(player) == "ES_es"){
            return MessagesUtils.getMsgColor(fileload2.getString(path));
        }
        if (LanguagesManager.getlanguage(player) == "ES_latam"){
            return MessagesUtils.getMsgColor(fileload3.getString(path));
        }
        if (LanguagesManager.getlanguage(player) == "JP_ja"){
            return MessagesUtils.getMsgColor(fileload4.getString(path));
        }
        if (LanguagesManager.getlanguage(player) == null){
            return MessagesUtils.getMsgColor(fileload1.getString(path));
        }

        return null;
    }



    public static List<String> sendMsgLangStringList(Player player, String path, String pluginname){
        UUID uuid = player.getUniqueId();
        File file1 = new File("plugins//"+pluginname+"//lang//"+"EN_us"+".yml");
        YamlConfiguration fileload1 = YamlConfiguration.loadConfiguration(file1);
        ////////////////
        File file2 = new File("plugins//"+pluginname+"//lang//"+"ES_es"+".yml");
        YamlConfiguration fileload2 = YamlConfiguration.loadConfiguration(file2);
        ////////////////
        File file3 = new File("plugins//"+pluginname+"//lang//"+"ES_latam"+".yml");
        YamlConfiguration fileload3 = YamlConfiguration.loadConfiguration(file3);
        ////////////////
        File file4 = new File("plugins//"+pluginname+"//lang//"+"JP_ja"+".yml");
        YamlConfiguration fileload4 = YamlConfiguration.loadConfiguration(file4);
        if (LanguagesManager.getlanguage(player) == "EN_us"){
            List<String> list = new ArrayList<>();
            for (String l : fileload1.getStringList(path))
                list.add(MessagesUtils.getMsgColor(l));
            return list;
        }
        if (LanguagesManager.getlanguage(player) == "ES_es"){
            List<String> list = new ArrayList<>();
            for (String l : fileload2.getStringList(path))
                list.add(MessagesUtils.getMsgColor(l));
            return list;
        }
        if (LanguagesManager.getlanguage(player) == "ES_latam"){
            List<String> list = new ArrayList<>();
            for (String l : fileload3.getStringList(path))
                list.add(MessagesUtils.getMsgColor(l));
            return list;
        }
        if (LanguagesManager.getlanguage(player) == "JP_ja"){
            List<String> list = new ArrayList<>();
            for (String l : fileload4.getStringList(path))
                list.add(MessagesUtils.getMsgColor(l));
            return list;
        }
        if (LanguagesManager.getlanguage(player) == null){
            List<String> list = new ArrayList<>();
            for (String l : fileload1.getStringList(path))
                list.add(MessagesUtils.getMsgColor(l));
            return list;
        }

        return null;
    }
}
