public class Main {
    public static void main(String[] args) {
        //Enemy goblin = SimpleEnemyFactory.createEnemy("goblin");
        //Enemy skeleton = SimpleEnemyFactory.createEnemy("skeleton");

        //goblin.attack();
        //skeleton.attack();
        EnemySpawner spawner;

        spawner = new DungeonSpawner();
        Enemy enemy1 = spawner.spawnEnemy("slime");
        enemy1.attack();

        spawner = new ForestSpawner();
        Enemy enemy2 = spawner.spawnEnemy("goblin");
        enemy1.attack();

        }
}
