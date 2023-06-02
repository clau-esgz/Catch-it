import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World implements LevelWorld
{
    PointCounter counter;
    private int randomNumber;
    private Item badItem;
    private Item fruit;
    private Timer timer;
    private int levelTime;
    private Item lollipop;
    private GreenfootSound music;
    private String name;
    public Level3(int currentPoints, String namePlayer)
    {    
        super(600, 400, 1);
        name = namePlayer;
        counter = new PointCounter(currentPoints);
        music = new GreenfootSound("LevelSound.mp3");
        add();
        prepare();
        randomNumber = 0;
        levelTime = 50;
        timer = new Timer(levelTime);
        addObject(timer,70,70);
        
    }

    public void prepare()
    {    
        addObject(counter,502,75);
        Obstacle obstacle = new Obstacle();
        
        addObject(obstacle,567,115);

        Obstacle obstacle2 = new Obstacle();
        addObject(obstacle2,24,252);
        
        Obstacle obstacle3 = new Obstacle();
        addObject(obstacle3,185,125);
    
        Obstacle obstacle4 = new Obstacle();
        addObject(obstacle4,409,265);
       
    }

    public void act() 
    {
        generateBadItems();
        generateFruits();
        generateRewards();
        randomNumber ++;
                
        if(timer.getCurrentTime() <= 0)
          Greenfoot.setWorld(new RecordPlayer(counter.getCounter(),name));
    }

    public void generateBadItems()
    {
        
        if(randomNumber %40 ==0)
        {
            badItem = new Item(Greenfoot.getRandomNumber(5));
            addObject(badItem,Greenfoot.getRandomNumber(600),0);
        }

    }
    
    public void generateFruits()
    {
        
        if(randomNumber %90 == 0)
        {
            fruit = new Item(Greenfoot.getRandomNumber(5)+6);
            addObject(fruit,Greenfoot.getRandomNumber(600),0);
        }

    } 
    
    public void generateRewards(){
        if (randomNumber %900 == 0){
            lollipop = new Item(11);
            addObject(lollipop,Greenfoot.getRandomNumber(600),0);
        }
    }

    
    public void add()
    {
        addObject(new Kirby(), 125, 280);
 
    }

    public PointCounter getPointCounter() 
    {
        return counter;
    }
    

    public Timer getTime(){
        return timer;
    }
}
