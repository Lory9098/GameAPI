package me.nettychannell.api.utils;

import com.google.common.collect.Lists;
import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

import java.util.List;

@UtilityClass
public class ChatUtil {

    public String color(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    public List<String> color(List<String> list) {
        list.replaceAll(ChatUtil::color);
        return list;
    }

    public List<String> color(String... strings) {
        return color(Lists.newArrayList(strings));
    }

}
