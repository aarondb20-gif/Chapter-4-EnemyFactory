# Journal

Phase1
The enemy factory in the program can generate any enemy type through the createEnemy method. So, there is no 
need to create new enemy objects in by calling the enemy classes themselves. It simplifies adding a new enemy type 
where all enemy types only need to be called from the factory object, and creating long if-else statements in the main
program aren't necessary.

Phase 2
It is easy to add new level type classes, because they will just extend the abstract class com.mygame.spawners.DungeonSpawner, and override
it's methods which eliminates the need for modifying existing code in the other spawner classes.

Phase 3
The abstract factory encapsulates the individual weapons and armor into the Equipment Factory classes. The user doesn't 
need to know which weapon or armor they need. They can just call one equipment factory to get all the related subclasses.

Phase 4

