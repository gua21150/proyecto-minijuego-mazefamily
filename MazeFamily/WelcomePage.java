import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WelcomePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WelcomePage extends World
{

    /**
     * Constructor for objects of class WelcomePage.
     * 
     */
    public WelcomePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void started()
    {
        Dad daddy = new Dad();
        addObject(daddy, 100, 500);
        showText("Ayudame a llegar a casa", 120, 500);    
    }
    
    public void act()
    {
        
    }
}
