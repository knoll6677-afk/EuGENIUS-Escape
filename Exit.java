import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    /**
     * Act - do whatever the exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage exit = new GreenfootImage("exit.png");
    private boolean isOpen;
    public void updateStatus(boolean open)
    {
        this.isOpen = open;
    }
    public boolean getIsOpen()
    {
        return isOpen;
    }
}
