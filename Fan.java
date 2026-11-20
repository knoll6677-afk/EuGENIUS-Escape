import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fan extends Actor
{
    protected int baseSpeed;
    private World instance;
    
    /**
     * Act - do whatever the Fan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //tbd
    }
    
    public int checkCollisions() {
        if (getObjectsInRange(10, Eugene.class).size()>0) {
            getWorld().removeObject(this);
            GameWorld.loseHearts();
            return 1;
        } else if (isTouching(Barricade.class) || isTouching(MazeWall.class)) {
            return 2;
        }
        return 0;
    }
}
