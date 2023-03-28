package de.bellobodo.abilities.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemUtils {

    private ItemStack getSkull(String url) {
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD);

        if (url == null || url.isEmpty()) return skull;

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

    }
}
