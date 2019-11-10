package io.github.aidanrm129;

import org.bukkit.plugin.java.JavaPlugin;

public class testPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable for testPlugin is called!");
        // Register our command "kit" (set an instance of your command class as executor)
        this.getCommand("testCommand").setExecutor(new testCommand());
        getServer().getPluginManager().registerEvents(new testListener(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable for testPlugin is called!");
    }
}

//https://www.spigotmc.org/wiki/creating-a-blank-spigot-plugin-in-intellijidea/