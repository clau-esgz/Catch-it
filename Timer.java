import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer tim = new SimpleTimer();
    private int delay = 60;
    private GreenfootImage timer;
    private static int time = 0;
    
    public Timer(){
        timer = new GreenfootImage("Time: " + time, 30, greenfoot.Color.WHITE, greenfoot.Color.PINK);
    }
    public void act()
    {
        setImage(timer);
        //time = tim.millisElapsed()/1000;
    }
}
