import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoryScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoryScreen extends World
{
    
    TalkingKirby kirby = new TalkingKirby();
    private GreenfootSound music;
    
    /**
     * Constructor for objects of class StoryScreen.
     * 
     */
    public StoryScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
        
        // Crear instancia de DialogActor
        DialogActor actorDialogo = new DialogActor();
        
        // Configurar el diálogo
        actorDialogo.setDialog("¡Hola! Soy Kirby y necesito tu ayuda. \n Mi estrella fue robada por King Dedede\n y quiero recuperarla. ¿Te unes a mí? \n¡Ayúdame a obtener tantos puntos como sea \nposible y juntos recuperaremos mi estrella!");

        // Agregar el actorDialogo al mundo
        addObject(actorDialogo, 360,110);
        addObject(kirby,100,300);
        music = new GreenfootSound ("LevelSound.mp3");
        music.play();
        
        
    }
    
    private void prepare() {
        TransitionButton optionsButton = new TransitionButton("StartButton.png", Level1.class);
        addObject(optionsButton, 488, 319);
    }
}
