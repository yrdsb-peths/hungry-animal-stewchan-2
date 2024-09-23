import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public static int score = 0;
    
    Label scoreLabel = new Label(0, 80);
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        // Add elephant
        Elephant e = new Elephant();
        addObject(e, 300, 300);
        
        // Add score label       
        addObject(scoreLabel, 80, 80);
        
        // Spawn apple
        spawnApple();
    }
    
    /**
     * Spawn a new apple at top of screen
     */
    public void spawnApple() {
        int x = Greenfoot.getRandomNumber(600);
        Apple apple = new Apple();
        addObject(apple, x, 0);
    }
    
    /**
     * Increase score
     * @param value - the amout to increase the score by
     */
    public void increaseScore(int value) {
        score += value;
        scoreLabel.setValue(score);
    }
}
