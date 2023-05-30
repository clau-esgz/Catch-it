import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TransitionButton extends Actor {
    
    private final Class<? extends World> worldType;

    public TransitionButton(String image, Class<? extends World> worldType) {
        setImage(image);
        this.worldType = worldType; 
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            
            try
            {
                World world = worldType.newInstance();

                Greenfoot.setWorld(world);
            }
            catch (InstantiationException | IllegalAccessException ie)
            {
                ie.printStackTrace();
            }
            
        }
        
    }
    
}