import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TransitionButton extends Actor {
    private final World backWorld;
    
    public TransitionButton(String image, World world) {
        setImage(image);
        this.backWorld = world; 
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(backWorld);
        }
    }
}