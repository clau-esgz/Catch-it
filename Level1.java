import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World implements LevelWorld
{
    PointCounter counter = new PointCounter();
    private int random_number;
    private int minimum;
    private int maximum;
    private Item obstacle;
    private Item fruit;
    public Level1()
    {    
        super(600, 400, 1);
        add();
        prepare();
        random_number = 0;
        
    }

    public void prepare()
    {    
        addObject(counter,502,75);
    }

    public void act() 
    {
        generateObstacles();
        generateFruits();
        random_number ++;
        checkNextLevel();
        
        
        Timer timer = new Timer();
        addObject(timer,70,70);
    }

    public void generateObstacles()
    {
        
        if(random_number %100 ==0)
        {
            obstacle = new Item(Greenfoot.getRandomNumber(5));
            addObject(obstacle,Greenfoot.getRandomNumber(600),0);
        }

    }
    
    public void generateFruits()
    {
        
        if(random_number %50 == 0)
        {
            fruit = new Item(Greenfoot.getRandomNumber(5)+6);
            addObject(fruit,Greenfoot.getRandomNumber(600),0);
        }

    } 
    
    public void add()
    {
        addObject(new Kirby(), 100, 280);
        addObject(new Pop(),Greenfoot.getRandomNumber(360), Greenfoot.getRandomNumber(360)); 
    }

    public PointCounter getPointCounter() 
    {
        return counter;
    }
    
    public void checkNextLevel(){
        PointCounter counterLevel = new PointCounter();
        if(counterLevel.getCounter() >= 100){
            Greenfoot.setWorld(new Level2()); 
        }
    }
}
