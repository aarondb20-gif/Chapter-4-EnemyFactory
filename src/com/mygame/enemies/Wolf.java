package com.mygame.enemies;

import com.mygame.equipment.factories.EquipmentFactory;

public class Wolf extends Enemy {
    public Wolf(EquipmentFactory equipmentFactory) {
        super(equipmentFactory);
    }

    @Override
    public void attack() {
        System.out.println("Wolf attacks with " + super.weapon + " wearing " + super.armor);
    }
}
