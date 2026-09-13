package com.mygame.enemies;

import com.mygame.equipment.factories.EquipmentFactory;

public class Goblin extends Enemy {

    public Goblin(EquipmentFactory equipmentFactory) {
        super(equipmentFactory);
    }

    @Override
    public void attack() {

        System.out.println("Goblin attacks with " + super.weapon + " wearing " + super.armor);

    }
}
