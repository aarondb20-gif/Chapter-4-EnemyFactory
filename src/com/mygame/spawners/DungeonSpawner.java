package com.mygame.spawners;

import com.mygame.enemies.Enemy;
import com.mygame.enemies.Skeleton;
import com.mygame.enemies.Slime;
import com.mygame.equipment.factories.MageEquipmentFactory;
import com.mygame.equipment.factories.WarriorEquipmentFactory;

public class DungeonSpawner extends EnemySpawner {

    @Override
    protected Enemy createEnemy(String type) {
        Enemy enemy = null;

        if (type.equals("slime")) {
            return new Slime(new MageEquipmentFactory());

        } else if (type.equals("skeleton")) {
            return  new Skeleton(new MageEquipmentFactory());
        }else{
            return enemy;
        }
    }
}
