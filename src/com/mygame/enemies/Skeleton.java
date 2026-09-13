package com.mygame.enemies;

import com.mygame.equipment.factories.EquipmentFactory;

public class Skeleton extends Enemy {

    public Skeleton(EquipmentFactory equipmentFactory) {
        super(equipmentFactory);

    }

    @Override
    public void attack() {
        System.out.println("Skeleton attacks with " + super.weapon + " wearing " + super.armor);


    }
}
