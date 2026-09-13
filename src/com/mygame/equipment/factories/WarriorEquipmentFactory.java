package com.mygame.equipment.factories;

import com.mygame.equipment.products.Armor;
import com.mygame.equipment.products.PlateArmor;
import com.mygame.equipment.products.Sword;
import com.mygame.equipment.products.Weapon;

public class WarriorEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }
}
