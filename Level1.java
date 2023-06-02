import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World implements LevelWorld
{
    PointCounter counter;
    private Timer timer;
    private int randomNumber;
    private Item badItem;
    private Item fruit;
    private Item lollipop;
    private GreenfootSound music;
    private int levelTime;
    private String namePlayer;
    public Level1()
    {    
        super(600, 400, 1);
        namePlayer = Greenfoot.ask("Nombre del jugador:");
        counter = new PointCounter(0);
        music = new GreenfootSound ("LevelSound.mp3");
        
        add();
        prepare();
        randomNumber = 0;
        levelTime = 45;
        timer = new Timer(levelTime);
        addObject(timer,70,70);
        
    }

    public void prepare()
    {    
        addObject(counter,502,75);
        Obstacle obstacle = new Obstacle();
        addObject(obstacle,402,210);
        Obstacle obstacle2 = new Obstacle();
        addObject(obstacle2,8,167);
    }

    public void act() 
    {        
        generateBadItems();
        generateFruits();
        generateRewards();
        randomNumber ++;
        
        if(timer.getCurrentTime() <= 0)
          Greenfoot.setWorld(new Level2(counter.getCounter(),namePlayer));
        
    }

     public void generateBadItems()
    {

        if(randomNumber %100 ==0)
        {
            badItem= new Item(Greenfoot.getRandomNumber(5));
            addObject(badItem,Greenfoot.getRandomNumber(600),0);
        }

    }

    public void generateFruits()
    {

        if(randomNumber %30 == 0)
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
        addObject(new Kirby(), 100, 280);

    }

    public PointCounter getPointCounter() 
    {
        return counter;
    }

    public Timer getTime(){
        return timer;
    }

}
