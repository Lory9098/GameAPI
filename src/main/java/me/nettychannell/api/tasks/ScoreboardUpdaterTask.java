package me.nettychannell.api.tasks;

import fr.mrmicky.fastboard.FastBoard;
import me.nettychannell.api.GameAPI;
import me.nettychannell.api.fastboard.GameScoreboard;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class ScoreboardUpdaterTask extends BukkitRunnable {

    public ScoreboardUpdaterTask() {
        this.runTaskTimerAsynchronously(GameAPI.getInstance().getFinalJavaPlugin(), 0, 20);
    }

    @Override
    public void run() {
        Bukkit.getOnlinePlayers().forEach(player -> {
            FastBoard fastBoard = GameScoreboard.getBoard(player.getUniqueId());
            GameScoreboard gameScoreboard = GameScoreboard.getGameScoreboard(player.getUniqueId());

            if (fastBoard == null || gameScoreboard == null) {
                return;
            }

            fastBoard.updateTitle(gameScoreboard.getTitle());
            fastBoard.updateLines(gameScoreboard.getLines());
        });
    }
}
