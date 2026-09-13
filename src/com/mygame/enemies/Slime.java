package com.mygame.enemies;

import com.mygame.equipment.factories.EquipmentFactory;

public class Slime extends Enemy {
    public Slime(EquipmentFactory equipmentFactory) {
        super(equipmentFactory);
    }

    @Override
    public void attack() {
        System.out.println("Slime attacks with " + super.weapon + " wearing " + super.armor);

    }
}
