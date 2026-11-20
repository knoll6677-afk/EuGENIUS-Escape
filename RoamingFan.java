import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RoamingFan here.
 * 
 * @author Eugene Kim
 * @version 11.20.26
 */
public class RoamingFan extends Fan
{
    private boolean set;
    private int direction;
    private int worldHeight;
    private int worldWidth;
    
    public RoamingFan() {
        baseSpeed = 3;
        set = true;
    }
    
    /**
     * Act - do whatever the RoamingFan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (set) {
            set = false;
            direction = Greenfoot.getRandomNumber(4);
            worldHeight = getWorld().getHeight();
            worldWidth = getWorld().getWidth();
        }
        move();
        checkCollisions();
    }
    
    public int newDirection(int current, int delta) {
        if (delta == 0) {
            if (current-1 == -1) {
                 return 3;
            }
            return current-=1;
        } else {
            if (current+1 == 4) {
                return 0;
            }
            return current+=1;
        }
    }
    
    public void move() {
        if (direction == 0) {
            setLocation(getX(), getY()+baseSpeed);
        } else if (direction == 1) {
            setLocation(getX() + baseSpeed, getY());
        } else if (direction == 2) {
            setLocation(getX(), getY() - baseSpeed);
        } else {
            setLocation(getX() - baseSpeed, getY());
        }
        
        if (getX() == 1 || getX() == worldWidth-1 || getY() == 1 || getY() == worldHeight-1 || Greenfoot.getRandomNumber(100) < 25) {
            direction = newDirection(direction, Greenfoot.getRandomNumber(2));
        }
    }
}


