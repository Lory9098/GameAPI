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
     * @param teamData
     * */
    <T> void setTeamData(T teamData);


}
