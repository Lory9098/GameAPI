package me.nettychannell.api.inventory;

import lombok.Getter;
import me.nettychannell.api.utils.ChatUtil;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

@Getter
public class InventoryBuilder {

    private Inventory inventory;

    public InventoryBuilder(int size, String name){
        this.inventory = Bukkit.createInventory(null, size, ChatUtil.color(name));
    }

    public InventoryBuilder(int size){
        this.inventory = Bukkit.createInventory(null, size);
    }

    public InventoryBuilder(Inventory inventory){
        this.inventory = inventory;
    }

    public InventoryBuilder addItem(int slot, ItemStack itemStack){
        this.inventory.setItem(slot, itemStack);
        return this;
    }

    public InventoryBuilder addItem(ItemStack itemStack){
        this.inventory.addItem(itemStack);
        return this;
    }

    public InventoryBuilder removeItem(int slot){
        this.inventory.setItem(slot, null);
        return this;
    }

    public InventoryBuilder removeItem(ItemStack itemStack){
        this.inventory.removeItem(itemStack);
        return this;
    }

}
