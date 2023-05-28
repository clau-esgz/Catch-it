import greenfoot.*;

import java.util.*;

/**
 * Write a description of class WorldsManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldsFactory
{
    public static final String MAIN_SCREEN = "MainScreen";
    public static final String OPTIONS_SCREEN = "Options";
    public static final String RECORDS_SCREEN = "Records";
    public static final String HOW_TO_PLAY_SCREEN = "HowToPlay";
    public static final String LEVEL_1_SCREEN = "Level1";
    
    
    public static World getWorld(String worldName){
        switch(worldName){
            case MAIN_SCREEN:
                return new MainScreen();
            case OPTIONS_SCREEN:
                return new Options();
            case HOW_TO_PLAY_SCREEN:
                return new HowToPlay();
            case RECORDS_SCREEN:
                return new RecordsScreen();
            case LEVEL_1_SCREEN:
                return new Level1();
                
        }
        
        throw new UnsupportedOperationException("World " + worldName + " not supported");
    }
    
}
