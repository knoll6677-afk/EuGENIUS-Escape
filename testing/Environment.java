import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Environment here.
 * 
 * @author Eugene Kim 
 * @version 11.04.2026
 */
public class Environment extends World
{

    /**
     * Constructor for objects of class Environment.
     * 
     */
    public Environment()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Eugene player = new Eugene();
        CrowdFan fan1 = new CrowdFan();
        PatrolFan fan2 = new PatrolFan();
        
        addObject(player, 200, 300);
        addObject(fan1, 200, 100);
        addObject(fan2, 300, 300);
    }
}
