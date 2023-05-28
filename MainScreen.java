import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainScreen extends World {
    private static Options options;
    
    public MainScreen() {
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare() {
        if (options == null) {
            options = new Options(this);
        }
        
        TransitionButton optionsButton = new TransitionButton("optionsButton.png", options);
        addObject(optionsButton, 488, 319);
        
        TransitionButton playButton = new TransitionButton("playButton.png", new Level1());
        addObject(playButton, 312, 323);
    }
    
    public Options getOptions() {
        return options;
    }
}
