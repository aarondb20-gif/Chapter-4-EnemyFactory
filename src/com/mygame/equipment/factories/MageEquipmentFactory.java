package com.mygame.equipment.factories;

import com.mygame.equipment.products.Armor;
import com.mygame.equipment.products.Robe;
import com.mygame.equipment.products.Staff;
import com.mygame.equipment.products.Weapon;

public class MageEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Staff();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }
}
