import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private String action; 
    private String state;
    
    public Button(String input)
    {
        action = input;
        state = input;
    }
    
    public void image()
    {
        if (action.equals("new_game"))
        {
            setImage("new_game.png");
        }
        
        if (action.equals("exit"))
        {
            setImage("exit_button.png");
        }
    }
    
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            if (state.equals("new_game"))
            {
                Greenfoot.setWorld(new Stage1());
            }
            
            if (state.equals("exit"))
            {
                Greenfoot.stop();
            }
        }
    }
}
