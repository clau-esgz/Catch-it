import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    PointCounter counter = new PointCounter();
    private int randomLocation_variable;
    private Obstacle obstacle;
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        add();
        prepare();
        randomLocation_variable = 0;
        
    }

    public void prepare()
    {    
        addObject(counter,502,75);
    }

    public void act() 
    {
        generateObstacles();
        randomLocation_variable ++;

    }

    private void generateObstacles()
    {
        if(randomLocation_variable %100 ==0)
        {
            obstacle = new Obstacle(Greenfoot.getRandomNumber(5));
            addObject(obstacle,Greenfoot.getRandomNumber(600),0);
        }

    }

    private void add()
    {
        addObject(new Kirby(), 100, 280);
    }

    public PointCounter getPointCounter() 
    {
        return counter;
    }
}
