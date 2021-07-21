import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Movers
{    
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // Metodo constructor
    public Car()
    {
        // Le dara al objeto la mitad del tama~o original
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    
    public void act()
    {
        // Add your action code here.
        moverse();
    }
}
