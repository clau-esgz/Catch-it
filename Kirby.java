import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kirby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kirby extends Actor
{
    private static int COUNT_STOP_KIRBY_START_VALUE = 20;
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
    
    
    GreenfootImage img_down;
    GreenfootImage img_up;
    
    public Kirby(){
        imagesRightLeft();
        setImage(images[DIRECTION_RIGHT][0]);
        img_down = new GreenfootImage("images/abajo.png");
        img_up = new GreenfootImage("images/arriba.png");
    }
    
    public void act()
    {
        walkRightLeft();
        gravedad();
        moveKeys();
        selectImageWalk();
        
    }
    
    private void imagesRightLeft(){
        images = new String[4][2];
        
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
            setImage(img_down);
        }
         if(Greenfoot.isKeyDown("space")){
            setImage(img_up);
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
    
    
    public void gravedad(){
        if(getY()<referenceY){
            setLocation(getX(), getY() + velocityDownY);
        }
    }
    
    
}
