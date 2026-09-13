package com.mygame.spawners;

import com.mygame.enemies.Enemy;
import com.mygame.enemies.Goblin;
import com.mygame.enemies.Wolf;
import com.mygame.equipment.factories.MageEquipmentFactory;
import com.mygame.equipment.factories.WarriorEquipmentFactory;

public class ForestSpawner extends EnemySpawner {
    @Override
    protected Enemy createEnemy(String type) {
        Enemy enemy = null;
        if (type.equals("goblin")) {
            return new Goblin(new WarriorEquipmentFactory());
        } else if (type.equals("wolf")) {
            return  new Wolf( new MageEquipmentFactory());
        }else{
            return enemy;
        }
    }
}
