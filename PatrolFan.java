import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PatrolFan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PatrolFan extends Fan
{
    private int startX;
    private int endX;
    private boolean movingRight;
    private boolean set;
    
    public PatrolFan() {
        GreenfootImage img = new GreenfootImage("patrolFan.png");
        img.scale(50, 50); // Optional: resize before applying
        setImage(img);
        baseSpeed = 2;
        set = true;
    }
    
    /**
     * Act - do whatever the PatrolFan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (set) {
            set = false;
            startX = getX();
            if (startX + 200 >= getWorld().getWidth()) {
                endX = startX - 200;
                movingRight = false;
            } else {
                endX = startX + 200;
                movingRight = true;
            }
        }
        calculatePatrolPath();
        checkCollisions();
    }
    
    public void calculatePatrolPath() {
        if (movingRight) {
            setLocation(getX()+baseSpeed, getY());
            if (getX() == endX || getX() == startX) {
                movingRight = false;
            }
        } else {
            setLocation(getX()-baseSpeed, getY());
            if (getX() == endX || getX() == startX) {
                movingRight = true;
            }
        }
    }
}
