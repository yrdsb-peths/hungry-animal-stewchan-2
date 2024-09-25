import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main world
 */
public class MyWorld extends World
{
    public static int score = 0;
    
    Label scoreLabel = new Label(0, 80);
    
    Food food;
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
        spawnFood();
    }
    
    public void spawnFood() {
        int rand = Greenfoot.getRandomNumber(2);
        food = (rand == 0) ? new Apple() : new Cherry();
        // if(rand == 0) {
            // food = new Apple();
        // } else {
            // food = new Cherry();
        // }
        int x = Greenfoot.getRandomNumber(600);
        addObject(food, x, 0);
    }
    
    /**
     * Main World loop
     */
    public void act() {
        food.move();
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
