import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends World
{
    private final Options options;
    /**
     * Constructor for objects of class HowToPlay.
     * 
     */
    public HowToPlay(Options options)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.options = options;
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TransitionButton backButton = new TransitionButton("backButton.png", options);
        addObject(backButton, 75, 65);
    }
}
