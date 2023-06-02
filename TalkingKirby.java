import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TalkingKirby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TalkingKirby extends Actor
{
    private int velocidad = 5; // Velocidad de avance del diálogo
    private boolean spriteChange = true;
    /**
     * Act - do whatever the TalkingKirby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (spriteChange) {
        setImage("arriba.png");
    } else {
        setImage("NormalRight.png");
    }
    
    Greenfoot.delay(velocidad);
    spriteChange = !spriteChange; 
    }
}
