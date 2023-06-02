import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class RecordsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecordsScreen extends World
{
    
    /**
     * Constructor for objects of class RecordsScreen.
     * 
     */
    public RecordsScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        Records record = new Records();
        
        record.createFile();
        record.readRecord();
        
        List<String> names = record.getNameList();
        List<Integer> score = record.getScoreList();
        
        int scoreYPosition = 213;
        

        
        for(int i = 0; i < 3 && i < score.size(); i++)
        {
            showText("Name Player: " + names.get(i) + " " + "score " + score.get(i), 300, scoreYPosition);
            scoreYPosition += 50; 
            
        }
        
        
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TransitionButton backButton = new TransitionButton("backButton.png", Options.class);
        addObject(backButton, 75, 65);
    }
}
