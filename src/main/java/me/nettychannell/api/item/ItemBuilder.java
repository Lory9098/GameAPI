package me.nettychannell.api.item;

import com.google.common.collect.Maps;
import me.nettychannell.api.item.interfaces.Interact;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.*;

public class ItemBuilder {
    private ItemStack item;
    private ItemMeta meta;
    private Interact interact;

    private static HashMap<ItemStack, ItemBuilder> items;

    static {
        items = new HashMap<>();
    }

    public static ItemBuilder getItemBuilder(ItemStack item) {
        return items.get(item);
    }

    public static List<ItemStack> adjustAmountOfItems(Collection<ItemStack> items) {
        List<ItemStack> b = new ArrayList<>();
        for (ItemStack item : items) {
            int newAmount = item.getAmount();
            ItemStack tempItem;
            while (newAmount > 64) {
                tempItem = item.clone();
                tempItem.setAmount(64);
                b.add(tempItem);
                newAmount -= 64;
            }
            if (newAmount > 0) {
                tempItem = item.clone();
                tempItem.setAmount(newAmount);
                b.add(tempItem);
            }
        }

        return b;
    }

    public ItemBuilder(Material material, int amount) {
        item = new ItemStack(material, amount);
        meta = item.getItemMeta();
    }

    public ItemBuilder(Material material) {
        this(material, 1);
    }

    public ItemBuilder(Material material, short damage) {
        item = new ItemStack(material, 1, damage);
        meta = item.getItemMeta();
    }

    public ItemBuilder(ItemStack items) {
        item = items;
        meta = item.getItemMeta();
    }

    public ItemBuilder(ItemStack items, int amount) {
        item = items;
        if (amount > 64 || amount < 0) amount = 64;
        item.setAmount(amount);
        meta = item.getItemMeta();
    }

    public ItemBuilder name(String name) {
        meta.setDisplayName(name);
        return this;
    }

    public String getName() {
        return meta.getDisplayName();
    }

    public ItemBuilder setDurability(int damage) {
        item.setDurability((short) damage);
        return this;
    }

    public List<String> getLore() {
        return meta.getLore();
    }

    public ItemBuilder setLore(String... lore) {
        return setLore(Arrays.asList(lore));
    }

    public ItemBuilder setLore(List<String> lore) {
        meta.setLore(lore);
        return this;
    }

    public Map<Enchantment, Integer> getEnchantments() {
        Map<Enchantment, Integer> values = Maps.newHashMap();
        values.putAll(meta.getEnchants());
        return values;
    }

    public ItemBuilder addLore(List<String> lores) {
        List<String> newLore = meta.getLore();
        newLore.addAll(lores);

        meta.setLore(newLore);

        return this;
    }

    public ItemBuilder setFlags(ItemFlag... flags) {
        for (ItemFlag flag : flags)
            meta.addItemFlags(flag);
        return this;
    }

    public ItemBuilder addEnchant(Enchantment ench, int level) {
        meta.addEnchant(ench, level, true);
        return this;
    }

    public ItemBuilder setSkull(String value) {
        SkullMeta meta = (SkullMeta) this.meta;
        meta.setOwner(value);
        this.meta = meta;
        return this;
    }

    public ItemBuilder setPlayerSkull(String playerName) {
        SkullMeta meta = (SkullMeta) this.meta;
        meta.setOwner(playerName);
        this.meta = meta;
        return this;
    }

    public ItemBuilder addLoreLines(List<String> lines) {
        if (meta.hasLore()) {
            List<String> lore = new ArrayList<>(meta.getLore());
            lore.addAll(lines);
            meta.setLore(lore);
        } else {
            meta.setLore(lines);
        }
        return this;
    }

    public ItemBuilder addLoreLines(String... lines) {
        if (meta.hasLore()) {
            List<String> lore = new ArrayList<>(meta.getLore());
            lore.addAll(Arrays.asList(lines));
            meta.setLore(lore);
        } else {
            meta.setLore(Arrays.asList(lines));
        }
        return this;
    }

    public ItemBuilder setMeta(ItemMeta meta) {
        this.meta = meta;
        return this;
    }

    public ItemBuilder spawner(EntityType entityType) {
        BlockStateMeta blockMeta = (BlockStateMeta) meta;
        BlockState blockState = blockMeta.getBlockState();
        CreatureSpawner spawner = (CreatureSpawner) blockState;

        spawner.setSpawnedType(entityType);
        blockMeta.setBlockState(spawner);

        item.setItemMeta(blockMeta);
        meta = item.getItemMeta();
        return this;
    }

    public ItemBuilder setLeatherColor(int red, int green, int blue) {
        LeatherArmorMeta im = (LeatherArmorMeta) meta;
        im.setColor(Color.fromRGB(red, green, blue));
        return this;
    }

    public ItemBuilder setActionWhenInteract(Interact interact) {
        this.interact = interact;
        return this;
    }

    public ItemStack build() {
        item.setItemMeta(meta);
        items.put(item, this);
        return item;
    }

    public Interact getInteract() {
        return interact;
    }

    @Override
    public ItemBuilder clone() {
        try {
            return (ItemBuilder) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
