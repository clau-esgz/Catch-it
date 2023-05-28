import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Options here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Options extends World {
    private final MainScreen mainScreen;
    private static RecordsScreen records;
    private static HowToPlay howToPlay;
    
    public Options(MainScreen mainScreen) {
        super(600, 400, 1); 
        this.mainScreen = mainScreen;
        prepare();
    }
    
    private void prepare() {
        if (records == null) {
            records = new RecordsScreen(this);
        }
        
        if (howToPlay == null) {
            howToPlay = new HowToPlay(this);
        }
        
        TransitionButton backButton = new TransitionButton("backButton.png", mainScreen);
        addObject(backButton, 75, 65);
        
        TransitionButton recordsButton = new TransitionButton("recordsButton.png", records);
        addObject(recordsButton, 400, 200);
        
        TransitionButton helpButton = new TransitionButton("helpButton.png", howToPlay);
        addObject(helpButton, 250, 190);
        
        
    }
}

