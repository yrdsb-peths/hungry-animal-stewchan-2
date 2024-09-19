import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Elephant e = new Elephant();
        addObject(e, 300, 300);
        
        spawnApple();
    }
    
    public void spawnApple() {
        int x = Greenfoot.getRandomNumber(600);
        Apple apple = new Apple();
        addObject(apple, x, 0);
    }
}
