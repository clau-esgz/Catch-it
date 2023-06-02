import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private int time = 0, displayedTime;
    private World nextWorld;
    
    public Timer(int timeVariable){
        time = timeVariable * 60;
    }
    public void act()
    {
        assignImage();
        time --;
        displayedTime = time / 60;

        }
    
    public void assignImage(){
        setImage(new GreenfootImage("Tiempo :" + displayedTime, 30, greenfoot.Color.WHITE, greenfoot.Color.PINK));

    }
    
    public void addTime(int extraTime)
    {
        time += (extraTime * 60);
        
    }
    
    public int getCurrentTime()
    {
        return time;
    }
}
