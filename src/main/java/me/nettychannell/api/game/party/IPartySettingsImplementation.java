package me.nettychannell.api.game.party;

import me.nettychannell.api.game.party.enums.IPartyPrivacy;

public interface IPartySettingsImplementation {

    /**
     * access modality for the party, like "Only on invite", "Public", "Closed" ecc
     * @return modality
     * */
    IPartyPrivacy getAccessModality();

    /**
     * set the access modality for the party, like "Only on invite", "Public", "Closed" ecc
     * @param modality
     * */
    void setAccessModality(IPartyPrivacy modality);

    /**
     * get the max players for the party
     * @return max players
     * */
    int getMaxPlayers();

    /**
     * set the max players for the party
     * @param maxPlayers
     * */
    void setMaxPlayers(int maxPlayers);

}
