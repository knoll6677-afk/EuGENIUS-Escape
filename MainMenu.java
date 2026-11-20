import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends GameWorld
{
    //private GreenfootSound bgMusic = new GreenfootSound("main_menu.mp3");  
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {
        super();
        Button newGameButton = new Button("new_game");
        Button continueButton = new Button("continue");
        Button exitButton = new Button("exit");      
        addObject(newGameButton, 300, 300);
        addObject(continueButton, 300, 200);
        addObject(exitButton, 300, 100);
    }
    
    public void started()
    {
        //bgMusic.playLoop();
    }
    
    public void stopped()
    {
        //bgMusic.stop();
    }
}
