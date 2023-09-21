package me.nettychannell.api.game.teamGame;

public interface ITeamColor {

    /**
     * get the color of the team
     * @return color
     * */
    String getChatColor();

    /**
     * get the color of the team
     * @return color
     * */
    String getTeamColor();

    /**
     * set the color of the chat
     * @return color
     * */
    void setChatColor(String color);

    /**
     * set the color of the team
     * @param color
     * */
    void setTeamColor(String color);

}
