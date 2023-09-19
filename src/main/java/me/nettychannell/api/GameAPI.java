package me.nettychannell.api;

import lombok.Getter;
import me.nettychannell.api.listener.ItemListener;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class GameAPI extends JavaPlugin {

    @Getter
    private static GameAPI instance;

    private JavaPlugin finalJavaPlugin;

    public void setPlugin(JavaPlugin plugin) {
        instance = this;
        this.finalJavaPlugin = plugin;
        finalJavaPlugin.getServer().getPluginManager().registerEvents(new ItemListener(), this);
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
