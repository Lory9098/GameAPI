package me.nettychannell.api.manager;

import me.nettychannell.api.arena.IArena;

import java.util.Collection;

public interface IArenaManager {

    /**
     * add an arena
     * @param arena
     * */
    void addArena(IArena arena);

    /**
     * remove an arena
     * @param arena
     * */
    void removeArena(IArena arena);

    /**
     * get an arena
     * @param name
     * */
    IArena getArena(String name);

    /**
     * check if the arena is in the manager
     * @param name
     * */
    boolean containsArena(String name);

    /**
     * get all arenas
     * @return arenas
     * */
    Collection<IArena> getArenas();

}
