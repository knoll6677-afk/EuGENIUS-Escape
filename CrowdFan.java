import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrowdFan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrowdFan extends Fan
{
    private int driftDirection;
    private int changeDirTimer;
    
    /**
     * Act - do whatever the CrowdFan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        swarmTowardsPlayer();
    }
    
    public void swarmTowardsPlayer() {
        
    }
    
    public boolean checkCollisions() {
        if (isTouching(Eugene.class)) {
            return true;
        } else if (isTouching(Barricade.class) || isTouching(MazeWall.class)) {
            return true;
        }
        return false;
    }
}
