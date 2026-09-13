package com.mygame.equipment.factories;

import com.mygame.equipment.products.Armor;
import com.mygame.equipment.products.Weapon;

public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
}
