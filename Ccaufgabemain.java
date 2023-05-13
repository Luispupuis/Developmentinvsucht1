package de.invsucht.ccaufgabemain;

import org.bukkit.plugin.java.JavaPlugin;

public final class Ccaufgabemain extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
      getCommand("cc").setExecutor(new Ccaufgabemain());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
