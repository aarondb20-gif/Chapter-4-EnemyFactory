public class DungeonSpawner extends EnemySpawner{

    @Override
    protected Enemy createEnemy(String type) {
        Enemy enemy = null;

        if (type.equals("slime")) {
            return new Slime();

        } else if (type.equals("skeleton")) {
            return  new Skeleton();
        }else{
            return null;
        }
    }
}
