import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class PointCounter extends Actor
{
    private int count = 0;
    
    public PointCounter(int currentPoints)
    {
        count = currentPoints;
    }
    
    public void act() 
    {
        setImage(new GreenfootImage("Puntos :" + count, 30, greenfoot.Color.WHITE, greenfoot.Color.PINK));

    }     
    
    public void addCount(int points)
    {
        count += points;
        if(count <= 0)
            count = 0;
        
    }
    
    public int getCounter(){
        return count;
    }

}