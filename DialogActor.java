import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DialogActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DialogActor extends Actor {
    private String dialog;
    private int indice = 0;
    

    public void setDialog(String dialogo) {
        this.dialog = dialogo;
    }

    public void act() {
        if (dialog != null && indice < dialog.length()) {
            String currentText = dialog.substring(0, indice + 1);
            setImage(new GreenfootImage(""+ currentText, 24, Color.BLACK, Color.WHITE));
            

            

            indice++;
        }
    }
}
