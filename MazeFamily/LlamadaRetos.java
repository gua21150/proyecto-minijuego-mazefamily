import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase solamente utiliza a sus objetos. Los objetos no contienen una acción en concreto.
 * 
 * @author Mariel Alejandra Guamuche Recinos 
 * @version 1.3
 */
public class LlamadaRetos extends Actor
{
    /**
     * Solamente se le da tamaño a los objetos de LlamadaRetos
     */
    
    public LlamadaRetos()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight());
    }
}
