import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class PointCounter extends Actor
{
    private static int count = 0;
    /**
     * Act - do whatever the contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("puntos :" + count, 50, greenfoot.Color.BLACK, greenfoot.Color.WHITE));

    }    
    public static void addCount(int points)
    {
        count += points;
        if(count<=0)
            count = 0;
    }
}