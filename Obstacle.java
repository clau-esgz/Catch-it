import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Obstacle extends Actor
{
    /**
     * 1= Blade
     * 2= Boot
     * 3= Flame
     * 4 = Heel
     * 5 = Shoe
     */
    private int typeOfObstacle,value,speed,aceleration;

    public Obstacle(int index)
    {
        speed = 0;
        aceleration = 3;
        value = 0;
        assignImages(index);
    }

    public void act() 
    {
        // Add your action code here.
        fall();
        checkLimit();
        checkPoints();
    }    

    public void fall()
    {
        this.setLocation(this.getX(),this.getY()+ aceleration);
        speed += aceleration;
    }

    private void checkLimit()
    {
        if(this.getY()>= 380)
        {
            getWorld().removeObject(this);
        }
    }

    public void checkPoints()
    {
        if(getWorld()!=null)//si el mundo existe 
        {
            if(this.isTouching(Kirby.class))// metodo de java isTouching
            {
                Level1 world = (Level1)getWorld();
                PointCounter counter = world.getPointCounter();
                counter.addCount(value);
                this.setLocation(1000,getY());
            }
        }

    }

    public void assignImages(int unTipoDeComida)
    {
        switch(unTipoDeComida)
        {
            case 0:
                //colocarle la imagen 
                //dar puntaje a valor
                setImage("Blade.png");
                value = -15;
                break;
            case 1:
                //colocarle la imagen 
                //dar puntaje a valor
                setImage("Boot.png");
                value = -10;
                break;

            case 2:
                //colocarle la imagen 
                //dar puntaje a valor
                setImage("Flame.png");
                value =  -5;
                break;
            case 3:
                //colocarle la imagen 
                //dar puntaje a valor
                setImage("Heel.png");
                value = -10;
                break;
            case 4:
                //colocarle la imagen 
                //dar puntaje a valor
                setImage("Shoe.png");
                value = -10;
                break;

        }

    }
}