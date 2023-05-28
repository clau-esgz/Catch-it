import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Options here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Options extends World {    
    public Options() {
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare() {        
        TransitionButton backButton = new TransitionButton("backButton.png", WorldsFactory.MAIN_SCREEN);
        addObject(backButton, 75, 65);
        
        TransitionButton recordsButton = new TransitionButton("recordsButton.png", WorldsFactory.RECORDS_SCREEN);
        addObject(recordsButton, 400, 200);
        
        TransitionButton helpButton = new TransitionButton("helpButton.png", WorldsFactory.HOW_TO_PLAY_SCREEN);
        addObject(helpButton, 250, 190);
        
        
    }
}

