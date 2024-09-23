import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Elephant extends Actor
{

    public void act()
    {
        if(Greenfoot.isKeyDown("a")) {
            move(-2);
        }
        if(Greenfoot.isKeyDown("d")) {
            move(2);
        }
        
        // Check if collides into apple
        if(isTouching(Apple.class)) {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnApple();
        }
    }
}
