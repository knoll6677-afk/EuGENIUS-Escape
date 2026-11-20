import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrowdFan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrowdFan extends Fan
{
    private int oldX;
    private int oldY;
    
    public CrowdFan() {
        setImage("woman01.png");
        baseSpeed = 1;
    }
    
    /**
     * Act - do whatever the CrowdFan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        swarmTowardsPlayer();
        if (checkCollisions() == 2) {
            setLocation(oldX, oldY);
        }
    }
    
    public void swarmTowardsPlayer() {
        int playerX = Eugene.getPlayerX();
        int playerY = Eugene.getPlayerY();
        
        if (playerX > getX()) {
            oldX = getX();
            setLocation(getX()+baseSpeed, getY());
        } 
        if (playerX < getX()) {
            oldX = getX();
            setLocation(getX()-baseSpeed, getY());
        }
        if (playerY > getY()) {
            oldY = getY();
            setLocation(getX(), getY()+baseSpeed);
        } 
        if (playerY < getY()) {
            oldY = getY();
            setLocation(getX(), getY()-baseSpeed);
        }
        
    }
}
