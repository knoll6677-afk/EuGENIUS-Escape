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
        image();
    }
    
    public void image()
    {
        if (action.equals("new_game"))
        {
            GreenfootImage buttonImg = new GreenfootImage("button_rectangle_depth_gloss_yellow.png");           
            GreenfootImage textImg = new GreenfootImage("START", 48, Color.WHITE, new Color(0, 0, 0, 0));

            int x = (buttonImg.getWidth() - textImg.getWidth()) / 2;
            int y = (buttonImg.getHeight() - textImg.getHeight()) / 2;

            buttonImg.drawImage(textImg, x, y);
            setImage(buttonImg);
        }
        
        if (action.equals("exit"))
        {
            GreenfootImage buttonImg = new GreenfootImage("button_rectangle_depth_gloss_blue.png");
            GreenfootImage textImg = new GreenfootImage("EXIT", 48, Color.WHITE, new Color(0, 0, 0, 0));
            
            int x = (buttonImg.getWidth() - textImg.getWidth()) / 2;
            int y = (buttonImg.getHeight() - textImg.getHeight()) / 2;
            
            buttonImg.drawImage(textImg, x, y);
            setImage(buttonImg);
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
