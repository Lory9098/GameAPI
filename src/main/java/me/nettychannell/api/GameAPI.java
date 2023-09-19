package me.nettychannell.api;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class GameAPI extends JavaPlugin {

    @Getter
    private static GameAPI instance;

    private JavaPlugin finalJavaPlugin;

    public void setPlugin(JavaPlugin plugin) {
        this.finalJavaPlugin = plugin;
    }

    @Override
    public void onEnable() {
        instance = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
