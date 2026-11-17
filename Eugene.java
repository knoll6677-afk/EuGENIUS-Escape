import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fan here.
 * 
 * @author Eugene Kim
 * @version 11.04.2026
 */
public class Eugene extends Actor
{
    private static int moveSpeed;
    private static boolean isInvincible;
    private static final int invincibilityTimer = 180;
    private static int currentTimer = 180;
    private static String currentDisguise;
    private static int lastX;
    private static int lastY;
    private static GreenfootSound hurtSound;
    private static GreenfootSound pickupSound;
    
    /**
     * Act - do whatever the fan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Eugene() {
        moveSpeed = 3;
        isInvincible = false;
        currentDisguise = "None";
        lastX = 200;
        lastY = 300;
        //hurtSound = new GreenfootSound("background.mp3");
        //pickupSound = new GreenfootSound("background.mp3");
    }
    
    public void act()
    {  
        handleMovement();
    }
    
    public boolean getHasMoved() {
        return lastX == getX() && lastY == getY();
    }
    
    public static boolean getInvincibility() {
        return isInvincible;
    }
    
    public static int getPlayerX() {
        return lastX;
    }
    
    public static int getPlayerY() {
        return lastY;
    }
    
    private void handleMovement() {
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            lastX = getX();
            setLocation(getX() - moveSpeed, getY());
            if (checkCollisions() == 2) {
                setLocation(getX()+5, getY());
            }
        }
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            lastX = getX();
            setLocation(getX() + moveSpeed, getY()); 
            if (checkCollisions() == 2) {
                setLocation(getX()-5, getY());
            }
        }
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")) {
            lastY = getY();
            setLocation(getX(), getY() - moveSpeed); 
            if (checkCollisions() == 2) {
                setLocation(getX(), getY()+5);
            }
        }
        if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")) {
            lastY = getY();
            setLocation(getX(), getY() + moveSpeed);
            if (checkCollisions() == 2) {
                setLocation(getX(), getY()-5);
            }
        }
    }
    
    public int checkCollisions() {
        if (isTouching(CrowdFan.class) || isTouching(Hilly.class)) {
            isInvincible = true;
            if (currentTimer > 0) {
                currentTimer--;
            } else {
                currentTimer = invincibilityTimer;
                isInvincible = false;
            }
            return 1;
        } else if (isTouching(Barricade.class) || isTouching(MazeWall.class)) {
            return 2;
        }
        return 0;
    }
    
    public boolean isTouchingKey() {
        if (isTouching(Key.class)) {
            return true;
        }
        return false;
    }
    
    public void equipDisguise(String disguise) {
        currentDisguise = disguise;
    }
    
    public void removeDisguise() {
        currentDisguise = "None";
    }
}
