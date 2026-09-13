package com.mygame.enemies;

import com.mygame.equipment.factories.EquipmentFactory;
import com.mygame.equipment.products.Armor;
import com.mygame.equipment.products.Weapon;

public abstract class Enemy {

    public Enemy(EquipmentFactory equipmentFactory){
        this.armor = equipmentFactory.createArmor();
        this.weapon = equipmentFactory.createWeapon();
    }
    public abstract void attack();

    protected Weapon weapon;
    protected Armor armor;


}
