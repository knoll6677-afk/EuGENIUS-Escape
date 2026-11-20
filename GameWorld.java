import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{

    private int hearts = 3;
    private boolean hasKey = false;
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
    }
    
    public int getHearts()
    {
        return hearts;
    }
    
    public boolean getHasKey()
    {
        return hasKey;
    }
    
    public void setHasKey()
    {
        if (!hasKey)
        {
            hasKey = true;
        }
        else
        {
            hasKey = false;
        }
    }
    
    public void loseHearts()
    {
        hearts -= 1;
    }
    
    public void triggerGameOver()
    {
        Greenfoot.setWorld(new GameOver());
    }
    
    public void triggerWin()
    {
        Greenfoot.setWorld(new Win());
    }
    
    public void spawnPlayer()
    {
        Eugene eugene = new Eugene();
        addObject(eugene, 300, 350);
    }
}
