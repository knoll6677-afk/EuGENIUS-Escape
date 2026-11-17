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
    private int oldX;
    private int oldY;
    
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
            setLocation(getX()+1, getY());
        } 
        if (playerX < getX()) {
            oldX = getX();
            setLocation(getX()-1, getY());
        }
        if (playerY > getY()) {
            oldY = getY();
            setLocation(getX(), getY()+1);
        } 
        if (playerY < getY()) {
            oldY = getY();
            setLocation(getX(), getY()-1);
        }
        
    }
    
    public int checkCollisions() {
        if (getObjectsInRange(7, Eugene.class).size()>0) {
            getWorld().removeObject(this);
            return 1;
        } else if (isTouching(Barricade.class) || isTouching(MazeWall.class)) {
            return 2;
        }
        return 0;
    }
}
