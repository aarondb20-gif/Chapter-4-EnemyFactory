public class SimpleEnemyFactory {



    public static Enemy createEnemy(String type) {

        Enemy enemy = null;

        if (type.equals("goblin")) {
            return new Goblin();
        } else if (type.equals("skeleton")) {
            return  new Skeleton();
        }else{
            return null;
        }
    }

}
