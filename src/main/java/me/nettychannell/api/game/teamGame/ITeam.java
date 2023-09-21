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
     * add a team
     * @param team
     * */
    void addTeam(ITeam team);

    /**
     * set the team Data
     * @param teamData
     * */
    <T> void setTeamData(T teamData);


}
