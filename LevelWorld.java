/**
 * Write a description of class LevelWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface LevelWorld  
{
    // instance variables - replace the example below with your own
    PointCounter getPointCounter();
    void generateObstacles();
    void generateFruits();
    void checkNextLevel();
}
