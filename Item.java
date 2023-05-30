import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Item extends Actor
{
    /**
     * 1= Blade
     * 2= Boot
     * 3= Flame
     * 4 = Heel
     * 5 = Shoe
     * 6 = Apple
     * 7 = Banana
     * 8 = Orange
     * 8 = Peach
     * 9 = Pear
     * 10 = Blueberry
     */

    private int typeOfItem,value,speed,aceleration;
    public Item(int index)
    {
        speed = 0;
        aceleration = 2;
        value = 0;
        assignImagesAndValues(index);
    }

    public void act() 
    {
        fall();
        checkLimit();
        checkPoints();
    }    

    public void fall()
    {
        this.setLocation(this.getX(),this.getY()+ aceleration);
        speed += aceleration;
    }

    public void checkLimit()
    {
        if(this.getY()>= 380)
        {
            getWorld().removeObject(this);
        }
    }

    public void checkPoints()
    {
        if(getWorld() == null)//si el mundo existe 
        {
            return;
        }
        
        if(this.isTouching(Kirby.class))// metodo de java isTouching
        {
            LevelWorld world = (LevelWorld)getWorld();
            PointCounter counter = new PointCounter();
            counter.addCount(value);
            this.setLocation(1000,getY());
        }
        
    }
    
    public void assignImagesAndValues(int typeOfItem)
    {
        switch(typeOfItem)
        {
            case 0:
                setImage("Blade.png");
                value = -15;
                break;
            case 1:
                setImage("Boot.png");
                value = -10;
                break;
            case 2:
                setImage("Flame.png");
                value =  -5;
                break;
            case 3:            
                setImage("Heel.png");
                value = -10;
                break;
            case 4:
                setImage("Shoe.png");
                value = -10;
                break;
            case 5:
                setImage("Apple.png");
                value = 25;
                break;
            case 6:
                setImage("Banana.png");
                value = 25;
                break;
            case 7:
                setImage("Orange.png");
                value = 25;
                break;
            case 8:
                setImage("Peach.png");
                value = 25;
                break;
            case 9:
                setImage("Pear.png");
                value = 25;
                break;

            case 10:
                setImage("Blueberry.png");
                value = 25;
                break;
        }
    }

}
