public class Main {
    public static void main(String[] args) {
        Enemy goblin = new SimpleEnemyFactory.createEnemy("goblin");
        Enemy skeleton = SimpleEnemyFactory.createEnemy("skeleton");


        goblin.attack();
        skeleton.attack();

    }
}
