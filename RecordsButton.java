import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RecordsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecordsButton extends Button
{
    /**
     * Act - do whatever the RecordsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) Greenfoot.setWorld(new RecordsScreen());
    }
}
