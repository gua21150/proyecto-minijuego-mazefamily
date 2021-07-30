import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Se utiliza su objeto para determinar cuando el jugador ha terminado el laberinto.
 * 
 * @author Mariel Alejandra Guamuche Recinos
 * @version 1.0
 */
public class Meta extends Actor
{
    /**
     * En el constructor se le da tamaño al objeto para que no sea pequeño
     */
    
    public Meta()
    {
        getImage().scale(getImage().getWidth()/8, getImage().getHeight()/8);
    }
}