package me.nettychannell.api.manager;

import me.nettychannell.api.data.IPlayerData;

import java.util.Collection;
import java.util.UUID;

public interface IPlayerManager {

    /**
     * add a player
     * @param playerData
     * */
    void addPlayer(IPlayerData playerData);

    /**
     * remove a player
     * @param uuid
     * */
    void removePlayer(UUID uuid);

    /**
     * get a player
     * @param uuid
     * */
    IPlayerData getPlayer(UUID uuid);

    /**
     * check if the player is in the manager
     * @param uuid
     * */
    boolean containsPlayer(UUID uuid);

    /**
     * get all players
     * */
    Collection<IPlayerData> getPlayers();


}
