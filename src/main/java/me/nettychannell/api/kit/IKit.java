package me.nettychannell.api.kit;

import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public interface IKit {

    /**
     * load this kit
     * */
    <T> void load(T... params);

    /**
     * unload this kit
     * */
    <T> void unload(T... params);

    /**
     * get the kit name
     * @return kit name
     * */
    String getName();

    /**
     * set the kit name
     * @param name
     * */
    void setName(String name);

    /**
     * get the kit description
     * @return kit description
     * */
    String getDescription();

    /**
     * set the kit description
     * @param description
     * */
    void setDescription(String description);

    /**
     * get the kit icon
     * @return kit icon
     * */
    ItemStack getIcon();

    /**
     * set the kit icon
     * @param icon
     * */
    void setIcon(ItemStack icon);

    /**
     * get the kit id
     * @return kit id
     * */
    int getId();

    /**
     * set the kit id
     * @param id
     * */
    void setId(int id);

    /**
     * give the kit to a player
     * @param uuid
     * */
    void giveToPlayer(UUID uuid);

    /**
     * set the kit's permission
     * @param permission
     * */
    void setPermission(String permission);

    /**
     * get the kit's permission
     * @return kit's permission
     * */
    String getPermission();

}
