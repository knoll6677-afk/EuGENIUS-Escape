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
        Button start_button = new Button("new_game");
        addObject(start_button, 498, 291);
        Button exit_button = new Button("exit");
        addObject(exit_button, 498, 437);
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
