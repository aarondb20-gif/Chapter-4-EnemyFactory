import com.mygame.enemies.Enemy;
import com.mygame.enemies.Goblin;
import com.mygame.enemies.Skeleton;
import com.mygame.equipment.factories.MageEquipmentFactory;
import com.mygame.equipment.factories.WarriorEquipmentFactory;
import com.mygame.equipment.products.Sword;
import com.mygame.spawners.DungeonSpawner;
import com.mygame.spawners.EnemySpawner;
import com.mygame.spawners.ForestSpawner;

public class Main {
    public static void main(String[] args) {
        //Enemy goblin = SimpleEnemyFactory.createEnemy("goblin");
        //Enemy skeleton = SimpleEnemyFactory.createEnemy("skeleton");

        //goblin.attack();
        //skeleton.attack();

        //Phase 2
         EnemySpawner spawner;

        spawner = new DungeonSpawner();
        System.out.println("Entering dungeon.");
        Enemy enemy1 = spawner.spawnEnemy("slime");
        enemy1.attack();

        spawner = new ForestSpawner();
        System.out.println("Entering forest.");
        Enemy enemy2 = spawner.spawnEnemy("goblin");
        enemy1.attack();

        Skeleton s1 = new Skeleton(new MageEquipmentFactory());
        Goblin g2 = new Goblin(new WarriorEquipmentFactory());
        s1.attack();
        g2.attack();


        }
}
