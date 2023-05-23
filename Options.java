import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Options here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Options extends World
{

    /**
     * Constructor for objects of class Options.
     * 
     */
    public Options()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        BackButton1 backButton = new BackButton1(new MainScreen());
        addObject(backButton,60,58);
        RecordsButton recordsButton = new RecordsButton();
        addObject(recordsButton,383,213);
        HelpButton helpButton = new HelpButton();
        addObject(helpButton,244,204);
    }
}
