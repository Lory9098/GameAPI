package me.nettychannell.api.game.teamGame;

import java.util.Collection;

public interface ITeamsManager {

    void loadTeams();

    void unloadTeams();

    void addTeam(ITeam team);

    void removeTeam(ITeam team);

    ITeam getTeam(String name);

    boolean containsTeam(String name);

    Collection<ITeam> getTeams();

}