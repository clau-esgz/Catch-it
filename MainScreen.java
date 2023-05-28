import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainScreen extends World {

    public MainScreen() {
        super(600, 400, 1); 
        prepare();
    }

    private void prepare() {

        TransitionButton optionsButton = new TransitionButton("optionsButton.png", WorldsFactory.OPTIONS_SCREEN);
        addObject(optionsButton, 488, 319);

        TransitionButton playButton = new TransitionButton("playButton.png", WorldsFactory.LEVEL_1_SCREEN);
        addObject(playButton, 312, 323);
    }
}
