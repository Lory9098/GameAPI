package me.nettychannell.api.data;

import me.nettychannell.api.enums.ICustomStats;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.Optional;
import java.util.UUID;

public interface IPlayerData {

    /**
     * return the uuid
     * @return uuid
     * */
    UUID getUniqueId();

    /**
     * return the player
     * @return player
     * */
    Optional<Player> toBukkitPlayer();

    /**
     * return the offline player
     * @return offline player
     * */
    OfflinePlayer toBukkitOfflinePlayer();

    /**
     * returns a certain statistic
     * @param statistic
     * */
    <T> T getStatistic(ICustomStats statistic);

    /**
     * set a certain statistic
     * @param statistic
     * @param value
     * */
    <T> void setStatistic(ICustomStats statistic, T value);

    /**
     * reset the player's statistics
     * */
    void resetStatistics();

}
