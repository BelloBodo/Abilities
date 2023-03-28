package de.bellobodo.abilities.gui.effects;

import org.bukkit.Material;
import org.bukkit.potion.PotionEffectType;

public class Effects {

    public Effects(PotionEffectType effectType, Material displayItem) {
        this.displayItem = displayItem;
        this.effectType = effectType;
    }

    private PotionEffectType effectType;

    private short potionStrenght = 0;

    private Material displayItem;



}
