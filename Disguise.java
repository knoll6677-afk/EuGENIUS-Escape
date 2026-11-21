import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class disguise here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disguise extends Actor
{
    /**
     * Act - do whatever the disguise wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String currentDisguise;
    public Disguise()
    {
        setDisguise("disguise1.png");
    }
    public Disguise(String startingImage)
    {
        setDisguise(startingImage);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            changeDisguise();
        }
    }
    public void setDisguise(String imageName)
    {
        currentDisguise = imageName;
        setImage(imageName);
    }
    public void changeDisguise()
    {
        if(currentDisguise.equals("disguise1.png"))
        {
            setDisguise("disguise2.png");
        }
        else
        {
            setDisguise("disguise1.png");
        }
    }
    public String getDisguiseType()
    {
        return currentDisguise;
    }
}
