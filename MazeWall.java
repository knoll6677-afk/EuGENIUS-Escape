import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mazeWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWall extends Actor
{
    /**
     * Act - do whatever the mazeWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage mazeWall = new GreenfootImage("maze_wall.png");
    public MazeWall()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() * 5, image.getHeight() * 5);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
