package me.nettychannell.api.fastboard;

import fr.mrmicky.fastboard.FastBoard;
import lombok.Data;
import me.nettychannell.api.utils.ChatUtil;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Data
public class GameScoreboard {

    private static HashMap<UUID, FastBoard> boards = new HashMap<>();
    private static HashMap<UUID, GameScoreboard> gameScoreboards = new HashMap<>();

    public static FastBoard getBoard(UUID uuid) {
        return boards.get(uuid);
    }

    public static GameScoreboard getGameScoreboard(UUID uuid) {
        return gameScoreboards.get(uuid);
    }


    private Player player;
    private String title;
    private List<String> lines = new ArrayList<>();

    public GameScoreboard(Player player, String title, List<String> lines) {
        FastBoard board = new FastBoard(player);
        this.gameScoreboards.put(player.getUniqueId(), this);
        this.player = player;
        this.title = ChatUtil.color(title);
        this.lines = ChatUtil.color(lines);
        board.updateTitle(ChatUtil.color(title));
        board.updateLines(ChatUtil.color(lines));
        boards.put(player.getUniqueId(), board);
    }
}
