package me.nettychannell.api.listener;

import me.nettychannell.api.item.ItemBuilder;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ItemListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent e){
        ItemBuilder itemBuilder = ItemBuilder.getItemBuilder(e.getItem());
        if(itemBuilder != null && itemBuilder.getInteract() != null){
            itemBuilder.getInteract().onInteract(e);
        }
    }

}
