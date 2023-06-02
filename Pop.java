import greenfoot.*; 

/**
 * Write a description of class Pop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pop extends Actor
{
    private static final int OFFSET = Greenfoot.getRandomNumber(10);
    private GreenfootImage candy;

    public Pop(){
        candy = new GreenfootImage("lollipop.png");
    }

    public void act()
    {
        setImage(candy);
        
        setLocation(getX() + OFFSET, getY());
        
        if(this.getX() >= 580)
        {
            getWorld().removeObject(this);
        } 
    }
}
