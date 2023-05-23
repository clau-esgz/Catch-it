import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainScreen extends World
{

    /**
     * Constructor for objects of class MainScreen.
     * 
     */
    public MainScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Greenfoot.start();
        prepare();
        
    }
    
    private void prepare(){

        PlayButton playButton = new PlayButton();
        addObject(playButton,312,323);

        OptionsButton optionsButton = new OptionsButton();
        addObject(optionsButton,488,319);

    }

}
