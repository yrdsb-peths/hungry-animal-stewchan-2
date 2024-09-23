import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Elephant extends Actor
{

    public void act()
    {
        // Elephant controls
        if(Greenfoot.isKeyDown("a")) {
            move(-2);
        }
        if(Greenfoot.isKeyDown("d")) {
            move(2);
        }
        
        checkFoodCollision();
        
    }
    
    public void checkFoodCollision() {
        Actor actor = getOneIntersectingObject(Food.class); // Might be null
        if(actor != null) {
            Food food = (Food) actor;
            MyWorld world = (MyWorld) getWorld();
            
            world.increaseScore(food.value);
            getWorld().removeObject(food);
            world.spawnFood();
        }
        
        // -------Old Code to remove apple--------
        // if(isTouching(Apple.class)) {
            // removeTouching(Apple.class);
            // MyWorld world = (MyWorld) getWorld();
            // world.increaseScore(20);
            // world.spawnApple();
        // }
    }
}
