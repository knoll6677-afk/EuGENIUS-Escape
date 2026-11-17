import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends GameWorld
{
    private GreenfootSound bgMusic = new GreenfootSound("game_over.mp3");
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {
        super();
        
        setBackground("014");
    }
    
    public void started()
    {
        bgMusic.playLoop();
    }
    
    public void stopped()
    {
        bgMusic.stop();
    }
    
    public void act()
    {
        if (!bgMusic.isPlaying())
        {
            bgMusic.playLoop();
        }
        
        inputAction();
    }
    
    public void inputAction()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            bgMusic.stop();
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
