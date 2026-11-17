import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends GameWorld
{

    private GreenfootSound bgMusic = new GreenfootSound("win.mp3");
    /**
     * Constructor for objects of class Win.
     * 
     */
    public Win()
    {
        super();
        
        setBackground("win");
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
