import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class heartDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeartDisplay extends Actor
{
    /**
     * Act - do whatever the heartDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage fullHeart = new GreenfootImage("heart_full.png");
    private GreenfootImage emptyHeart = new GreenfootImage("heart_empty.png");
    private int maxHearts = 3;
    private int heartSpacing = 5;
    
    public HeartDisplay()
    {
        updateDisplay(3);
    }
    public void updateDisplay(int currentHearts)
    {
        int heartWidth = fullHeart.getWidth();
        int heartHeight = fullHeart.getHeight();
        int totalWidth = (heartWidth * maxHearts) + (heartSpacing * (maxHearts - 1));
        GreenfootImage canvas = new GreenfootImage(totalWidth, heartHeight);
        for(int i = 0; i < maxHearts; i++)
        {
            int xPosition = i * (heartWidth + heartSpacing);
            if(i < currentHearts)
            {
                canvas.drawImage(fullHeart, xPosition, 0);
            }
            else
            {
                canvas.drawImage(emptyHeart, xPosition, 0);
            }
        }
        setImage(canvas);
    }
}
