import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage2 extends GameWorld
{

    /**
     * Constructor for objects of class Stage2.
     * 
     */
    public Stage2()
    {
        GreenfootImage bg = new GreenfootImage("rooms-composed.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
}
