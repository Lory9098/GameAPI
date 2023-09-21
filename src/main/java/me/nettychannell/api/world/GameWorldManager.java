package me.nettychannell.api.world;

import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;

import java.util.List;
import java.util.Optional;

@UtilityClass
public class GameWorldManager {

    public World createEmptyWorld(String name) {
        WorldCreator wc = new WorldCreator(name);
        wc.type(WorldType.FLAT);
        wc.generatorSettings("2;0;1;");
        World world = wc.createWorld();

        return world;
    }

    public World createEmptyWorld(String name, WorldType type) {
        WorldCreator wc = new WorldCreator(name);
        wc.type(type);
        wc.generatorSettings("2;0;1;");
        World world = wc.createWorld();

        return world;
    }

    public World createWorld(String name, WorldType type, String generatorSettings) {
        WorldCreator wc = new WorldCreator(name);
        wc.type(type);
        wc.generatorSettings(generatorSettings);
        World world = wc.createWorld();

        return world;
    }

    public World createWorld(String name, String generatorSettings) {
        WorldCreator wc = new WorldCreator(name);
        wc.type(WorldType.NORMAL);
        wc.generatorSettings(generatorSettings);
        World world = wc.createWorld();

        return world;
    }

    public void unloadWorld(String name, boolean save) {
        Bukkit.unloadWorld(name, save);
    }

    public Optional<World> getWorld(String name) {
        return Optional.ofNullable(Bukkit.getWorld(name));
    }

    public List<World> getWorlds() {
        return Bukkit.getWorlds();
    }

}
