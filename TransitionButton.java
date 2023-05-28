import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TransitionButton extends Actor {
    private final String backWorldId;
    
    public TransitionButton(String image, String worldId) {
        setImage(image);
        this.backWorldId = worldId; 
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(WorldsFactory.getWorld(backWorldId));
        }
    }
}