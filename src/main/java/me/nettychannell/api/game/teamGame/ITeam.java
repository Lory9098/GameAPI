package me.nettychannell.api.game.teamGame;

public interface ITeam {

    /**
     * load the team
     * */
    void loadTeam();

    /**
     * unload the team
     * */
    void unloadTeam();

    /**
     * set the team Data
     * @param key
     * @param value
     * */
    <T> void setTeamData(String key, T value);


}
