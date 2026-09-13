package com.mygame.equipment.factories;

import com.mygame.enemies.Enemy;
import com.mygame.enemies.Goblin;
import com.mygame.enemies.Skeleton;

public class SimpleEnemyFactory {



    public static Enemy createEnemy(String type) {

        Enemy enemy = null;

        if (type.equals("goblin")) {
            return new Goblin(new WarriorEquipmentFactory());
        } else if (type.equals("skeleton")) {
            return  new Skeleton(new WarriorEquipmentFactory());
        }else{
            return null;
        }
    }

}
