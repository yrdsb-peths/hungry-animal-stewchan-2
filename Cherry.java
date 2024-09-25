import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Cherry extends Food
{
    public Cherry() {
        super(10);
    }
    
    public void move() {
        setLocation(getX(), getY() + 10);
    }
    
    // public void act()
    // {
        // setLocation(getX(), getY() + 4);
    // }
}
