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
    
    private void handleMovement() {
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            lastX = getX();
            setLocation(getX() - moveSpeed, getY());
            if (checkCollisions()) {
                setLocation(getX()+5, getY());
            }
        }
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            lastX = getX();
            setLocation(getX() + moveSpeed, getY()); 
            if (checkCollisions()) {
                setLocation(getX()-5, getY());
            }
        }
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")) {
            lastY = getY();
            setLocation(getX(), getY() - moveSpeed); 
            if (checkCollisions()) {
                setLocation(getX(), getY()+5);
            }
        }
        if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")) {
            lastY = getY();
            setLocation(getX(), getY() + moveSpeed);
            if (checkCollisions()) {
                setLocation(getX(), getY()-5);
            }
        }
    }
    
    public boolean checkCollisions() {
        if (isTouching(Fan.class) || isTouching(Hilly.class)) {
            isInvincible = true;
            if (currentTimer > 0) {
                currentTimer--;
            } else {
                currentTimer = invincibilityTimer;
                isInvincible = false;
            }
            return true;
        } else if (isTouching(Barricade.class) || isTouching(MazeWall.class)) {
            return true;
        }
        return false;
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
