import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends World implements LevelWorld
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
    public Level2(int currentPoints,String namePlayer)
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
        addObject(obstacle,562,203);
        Obstacle obstacle2 = new Obstacle();
        addObject(obstacle2,158,220);
        Obstacle obstacle3 = new Obstacle();
        addObject(obstacle3,408,266);
        
       
    }

    public void act() 
    {
        generateBadItems();
        generateFruits();
        generateRewards();
        randomNumber ++;

                
        if(timer.getCurrentTime() <= 0)
          Greenfoot.setWorld(new Level3(counter.getCounter(),name));
    }
    
    private void checkTimeByLevel()
    {
            
    }
    
    public void generateBadItems()
    {

        if(randomNumber %50 ==0)
        {
            badItem = new Item(Greenfoot.getRandomNumber(5));
            addObject(badItem,Greenfoot.getRandomNumber(600),0);
        }

    }

    public void generateFruits()
    {

        if(randomNumber %40 == 0)
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

    
    
    void add()
    {
        addObject(new Kirby(), 120, 280);

    }

    public PointCounter getPointCounter() 
    {
        return counter;
    }
    
    public Timer getTime(){
        return timer;
    }

      
}
