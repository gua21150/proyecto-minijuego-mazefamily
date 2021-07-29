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
        getImage().scale(getImage().getWidth()/2, getImage().getHeight());
    }

    public void act()
    {
        // Add your action code here.
        moverse(); // llamada del metodo moverse 
        llegarMeta(); // llamada de metodo en caso que llegue a la meta
    }

    public void llegarMeta()
    {
        // metodo en caso de llegar a la meta 
        if(isTouching(meta.class)) // si el objeto de la clase Car toca al objeto de la clase meta entonces quiere decir que llego a la meta.
        {
            // se coloca imagen de "llegar a la meta"
            GreenfootImage myImage = new GreenfootImage("metaImage.png");
            setImage(myImage);
        }
    }
    
    
}
