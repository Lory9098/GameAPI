package me.nettychannell.api.tab;

import me.nettychannell.api.utils.ChatUtil;
import me.neznamy.tab.api.TabAPI;
import me.neznamy.tab.api.TabPlayer;

import java.util.List;
import java.util.UUID;

public class GameTab {

    public GameTab(UUID uuid, List<String> header, List<String> footer) {
        TabPlayer tabPlayer = TabAPI.getInstance().getPlayer(uuid);

        StringBuilder headerFixed = new StringBuilder();
        StringBuilder footerFixed = new StringBuilder();

        for (int i = 0; i < header.size(); i++) {
            headerFixed.append(ChatUtil.color(header.get(i)) + (i == header.size() - 1 ? "" : "\n"));
        }

        for (int i = 0; i < footer.size(); i++) {
            footerFixed.append(ChatUtil.color(footer.get(i)) + (i == footer.size() - 1 ? "" : "\n"));
        }

        TabAPI.getInstance().getHeaderFooterManager().setHeader(tabPlayer, headerFixed.toString());
        TabAPI.getInstance().getHeaderFooterManager().setFooter(tabPlayer, footerFixed.toString());
    }

}
