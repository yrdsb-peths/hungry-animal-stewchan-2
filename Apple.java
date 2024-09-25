import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Apple extends Food
{
    public Apple() {
        super(1);
        GreenfootImage image = new GreenfootImage("images/apple.png");
        setImage(image);
    }
    
    public void move() {
        setLocation(getX(), getY() + 3);
    }
    
}
