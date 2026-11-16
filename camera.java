import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class disguise here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camera extends Actor
{
    /**
     * Act - do whatever the disguise wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isActive;
    public void updateVisualState(boolean newState)
    {
        this.isActive = newState;
    }
    public boolean getIsActive()
    {
        return isActive;
    }
}
