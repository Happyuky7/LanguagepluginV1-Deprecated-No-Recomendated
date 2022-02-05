package com.github.happyrogelio7.languagepluginv1;

import com.github.happyrogelio7.languagepluginv1.commands.LanguageCMD;
import com.github.happyrogelio7.languagepluginv1.commands.SetLangCMD;
import com.github.happyrogelio7.languagepluginv1.filemanager.FileManager;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class LanguagepluginV1 extends JavaPlugin {

    public String nameplugin1 = "LanguagepluginV1";

    private static LanguagepluginV1 instance;

    private FileManager config;

    private FileManager playerdata;

    private FileManager langeses;

    private FileManager langeslatam;

    private FileManager langenus;

    private FileManager langjpja;

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getConsoleSender().sendMessage("On plugin LangSystem1");
        Bukkit.getConsoleSender().sendMessage("On plugin LangSystem1");
        Bukkit.getConsoleSender().sendMessage("On plugin LangSystem1");
        Bukkit.getConsoleSender().sendMessage("On plugin LangSystem1");
        registerfileManager1();
        registercommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        Bukkit.getConsoleSender().sendMessage("Dff plugin LangSystem1");
        Bukkit.getConsoleSender().sendMessage("Off plugin LangSystem1");
        Bukkit.getConsoleSender().sendMessage("Off plugin LangSystem1");
        Bukkit.getConsoleSender().sendMessage("Off plugin LangSystem1");

    }

    public static LanguagepluginV1 getInstance() {
        return instance;
    }

    public void registercommands() {
        getCommand("language").setExecutor((CommandExecutor)new LanguageCMD(this));
        getCommand("setlanguage").setExecutor((CommandExecutor)new SetLangCMD(this));
    }

    public void registerfileManager1() {
        this.config = new FileManager(this, "config");
        this.playerdata = new FileManager(this, "data/playerdata");
        this.langenus = new FileManager(this, "lang/EN_us");
        this.langeses = new FileManager(this, "lang/ES_es");
        this.langeslatam = new FileManager(this, "lang/ES_latam");
        this.langjpja = new FileManager(this, "lang/JP_ja");
    }

    public FileManager getPlayerData() {
        return this.playerdata;
    }
}
