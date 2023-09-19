package me.nettychannell.api.file;

import lombok.Getter;
import me.nettychannell.api.GameAPI;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class GameFile {

    @Getter
    private File file;
    @Getter
    private FileConfiguration fileConfiguration;

    private GameAPI gameAPI = GameAPI.getInstance();

    public GameFile(String name) {
        File configFile = new File(gameAPI.getFinalJavaPlugin().getDataFolder(), name);


        if (!configFile.exists()) {
            configFile.getParentFile().mkdirs();
            gameAPI.getFinalJavaPlugin().saveResource(name, false);
        }

        FileConfiguration configuration = new YamlConfiguration();

        try {
            configuration.load(configFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }

        fileConfiguration = configuration;
    }

    public void reload() {
        try {
            fileConfiguration.load(file);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try {
            fileConfiguration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
