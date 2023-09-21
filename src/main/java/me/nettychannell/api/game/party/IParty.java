package me.nettychannell.api.game.party;

import me.nettychannell.api.data.IPlayerData;

public interface IParty {

    /**
     * load the party
     * */
    void loadParty();

    /**
     * unload the party
     * */
    void unloadParty();

    /**
     * add player to a party
     * @param user
     * */
    void addPlayer(IPlayerData user);

    /**
     * remove player from the party
     * @param user
     * */
    void removePlayer(IPlayerData user);

    /**
     * kick player from the party
     * @param user
     * */
    void kickPlayer(IPlayerData user);

    /**
     * get the party owner
     * @return owner
     * */
    IPlayerData getOwner();

    /**
     * set the party Data
     * @param partyData
     * */
    <T> void setPartyData(T partyData);

}
