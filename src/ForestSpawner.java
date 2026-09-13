public class ForestSpawner extends EnemySpawner{
    @Override
    protected Enemy createEnemy(String type) {
        Enemy enemy = null;
        if (type.equals("goblin")) {
            return new Goblin();
        } else if (type.equals("wolf")) {
            return  new Wolf();
        }else{
            return null;
        }
    }
}
