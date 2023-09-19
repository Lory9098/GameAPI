package me.nettychannell.api.arena;

import me.nettychannell.api.enums.ICustomState;

import java.util.Collection;
import java.util.UUID;

public interface IArena {

    /**
     * load the arena
     * */
    void loadArena();

    /**
     * unload the arena
     * */
    void unloadArena();

    /**
     * add player to the arena
     * @param uuid
     * */
    void addPlayer(UUID uuid);

    /**
     * remove player from the arena
     * @param uuid
     * */
    void removePlayer(UUID uuid);

    /**
     * add spectator to the arena
     * @param uuid
     * */
    void addSpectator(UUID uuid);

    /**
     * remove spectator from the arena
     * @param uuid
     * */
    void removeSpectator(UUID uuid);

    /**
     * get the arena name
     * @return arena name
     * */
    String getName();

    /**
     * get the arena max players
     * @return arena max players
     * */
    int getMaxPlayers();

    /**
     * get the arena min players
     * @return arena min players
     * */
    int getMinPlayers();

    /**
     * get the arena state
     * @return arena state
     * */
    ICustomState getState();

    /**
     * set the arena state
     * @param state
     * */
    void setState(ICustomState state);

    /**
     * get the arena players
     * @return arena players
     * */
    Collection<UUID> getPlayers();

    /**
     * get the arena spectators
     * @return arena spectators
     * */
    Collection<UUID> getSpectators();

    /**
     * send message to all players
     * @param message
     * @param spectator (if true send message to all players and spectators)
     * */
    void sendMessage(String message, boolean spectator);

    /**
     * send title to all players
     * @param title
     * @param subtitle
     * @param spectator (if true send title to all players and spectators)
     * */
    void sendTitle(String title, String subtitle, boolean spectator);


    /**
     * start the arena
     * */
    void start();

    /**
     * end the arena
     * */
    void end();

    /**
     * restart the arena
     * */
    void restart();



}
