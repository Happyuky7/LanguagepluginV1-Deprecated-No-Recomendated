# LanguagepluginV1

### _A plugin to change the language of your minecraft server._

### Information:
Versions Minecraft: 1.8.X, 1.9.X, 1.10.X, 1.11.X, 1.12.X, 1.13.X, 1.14.X, 1.15.X, 1.16.X, 1.17.X, 1.18.X.

Plugin Version: 1.0.1

Base Version MC: 1.12.2

JDK: 11

Servers JARS: Spigot, Paper.

### GitHub: https://github.com/HappyRogelio7
### Discord: https://discord.gg/3EebYUyeUX
### Twitter: https://twitter.com/HappyRogelio7

## Features
+ Setlang Command
+ Language Command
+ Basic API
+ Implement Methods API

## Upcoming features
+ Add new Languages support.
+ Maven API
+ Languages Menus

## COMPILE

```maven
git clone https://github.com/HappyRogelio7/LanguagepluginV1.git

mvn install

mvn package
```
## API

**Using API:**

```maven
Maven API: COMMING SOON...
```
**Methods**

```java
LanguagesManager.sendMsgLangString(player, "path", "plugin name")`
LanguagesManager.sendMsgLangStringList(player, "path", "plugin name")
LanguagesManager.getlanguage(player)
LanguagesManager.setlanguage(player, "lang file name")
```

---

**Implement Methods Example:**

Languages Files Example:
```yaml
# EN_us.yml
MSG: "Send Message: EN_us"
```
```yaml
# ES_latam.yml
MSG: "Enviar mensaje: ES_latam"
```

---

**Method Command:**

Method String:
```java

package com.github.happyrogelio7.languagepluginv1.commandsexamplegithub;

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
            player.sendMessage(LanguagesManager.sendMsgLangString(player, "MSG", "your plugin name"));

        }

        return true;

    }
}

```

```
Result in EN_us.yml: `Send Message: EN_us`
Result in ES_latam.yml: `Enviar mensaje: ES_latam`
```

LEAVE CREDITS.

### TERMS AND CONDITIONS.

1.- DO NOT UPLOAD THIS PLUGIN AS YOURS TO ANY PLATFORM OR WEB PAGE.

2.- DO NOT SELL THE COMPLETE BECAUSE IT IS FREE TO USE.

3.- LEAVE CREDITS IN CASE OF USING IT IN ANY CONFIGURED SERVER.

© copyright HappyRogelio7 2017-2022 ©
RIGHTS RESERVED
