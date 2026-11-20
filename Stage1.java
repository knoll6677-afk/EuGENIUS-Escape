import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage1 extends GameWorld
{

    /**
     * Constructor for objects of class Stage1.
     * 
     */
    public Stage1()
    {
        GreenfootImage bg = new GreenfootImage("concert_hall.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        spawnPlayer();
        addObject(new CrowdFan(), 100, 100);
        addObject(new PatrolFan(), 400, 100);
    }
}
