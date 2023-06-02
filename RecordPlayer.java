import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RecordPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecordPlayer extends World
{
    private int score;
    private String name;

    public RecordPlayer(int totalPoints,String namePlayer)
    {    
        super(600, 400, 1);

        prepare();
        
        score = totalPoints;
        name = namePlayer;
        
        
        showText("" + score, 460, 300);
        Records record = new Records();
        
        record.createFile();
        record.readRecord();
        record.writeRecord(name, score);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TransitionButton transitionButton = new TransitionButton("MainscreenButton.png", MainScreen.class);
        addObject(transitionButton,98,340);

        TransitionButton transitionButton2 = new TransitionButton("Credits.png", FinalScreen.class);
        addObject(transitionButton2,228,338);
        
    }
}
