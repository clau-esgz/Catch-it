import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Kirby extends Actor
{
    private static final int COUNT_STOP_KIRBY_START_VALUE = 20;
    private static final int OFFSET = 3;
    private static final int DIRECTION_RIGHT = 0;
    private static final int DIRECTION_LEFT = 1;
    private static final int REFERENCE_Y = 280;
    private static final int VELOCITY_DOWN_Y = 8;
    private static final int VELOCITY_UP_Y = 14;
    
    private int walkingDelay = COUNT_STOP_KIRBY_START_VALUE;
    private String [][]images; 
    private int imageIndex;
    private int direction = DIRECTION_RIGHT;
    private int referenceY = REFERENCE_Y;
    private int velocityDownY = VELOCITY_DOWN_Y;
    private int velocityUpY = VELOCITY_UP_Y;

    private GreenfootImage imgDown; 
    private GreenfootImage imgUp;
    
    public Kirby(){
        imagesRightLeft();
        setImage(images[DIRECTION_RIGHT][0]);
        imgDown = new GreenfootImage("images/abajo.png");
        imgUp = new GreenfootImage("images/arriba.png");
    }
    
    public void act()
    {
        walkRightLeft();
        fall();
        moveKeys();
        selectImageWalk();
        
    }
    
    private void imagesRightLeft(){
        images = new String[2][2];
        
        images[DIRECTION_RIGHT] = new String[]{
            "images/normal_derecha.png",
            "images/caminar_derecha1.png"
        };
        
        images[DIRECTION_LEFT] = new String[]{
            "images/normal_izquierda.png",
            "images/caminar_izquierda1.png"
        };
        
    }
    
    private void walkRightLeft(){
        switch(direction){
            case DIRECTION_RIGHT:
                setLocation(getX() + OFFSET, getY());
                break;
            
            case DIRECTION_LEFT:
                setLocation(getX() - OFFSET, getY());
                break;
            
        }
    }
    
    private void moveKeys(){
        if(Greenfoot.isKeyDown("right")){
            direction = DIRECTION_RIGHT;
        } else if(Greenfoot.isKeyDown("left")){
            direction = DIRECTION_LEFT;
        }
        if(Greenfoot.isKeyDown("down")){
            setImage(imgDown);
        }
         if(Greenfoot.isKeyDown("space")){
            setImage(imgUp);
            setLocation(getX(), getY() - velocityUpY);
        }
    }
    
    private void selectImageWalk(){
        walkingDelay --;
        if(walkingDelay == 0){
            imageIndex = (imageIndex + 1) % images[direction].length;
            setImage(images[direction][imageIndex]);
            walkingDelay = COUNT_STOP_KIRBY_START_VALUE;
        }
    }
    
    
    public void fall(){
        if(getY()<referenceY){
            setLocation(getX(), getY() + velocityDownY);
        }
    }
    
    
}
