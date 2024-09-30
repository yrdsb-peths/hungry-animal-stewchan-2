import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor {
    int speed = 4;

    public void act() {
        // Elephant controls
        checkInput();
        checkFoodCollision();
    }

    public void checkInput() {
        if (Greenfoot.isKeyDown("a")) {
            move(-speed);
        }
        if (Greenfoot.isKeyDown("d")) {
            move(speed);
        }
    }

    public void checkFoodCollision() {
        Actor actor = getOneIntersectingObject(Food.class); // Might be null
        if (actor != null) {
            Food food = (Food) actor;
            MyWorld world = (MyWorld) getWorld();

            world.increaseScore(food.value);
            getWorld().removeObject(food);
            world.spawnFood();
        }
    }
}
