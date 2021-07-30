import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
<<<<<<< Updated upstream
 * Se utiliza su objeto para determinar cuando el jugador ha terminado el laberinto.
 * 
 * @author Mariel Alejandra Guamuche Recinos
 * @version 1.0
=======
 * Esta clase indica cuando el carro ha llegado hasta la meta. Se utiliza más el objeto instanciado de esta clase.
 * 
 * @author Mariel Alejandra Guamuche Recinos 
 * @version 1.2
>>>>>>> Stashed changes
 */
public class Meta extends Actor
{    
    /**
<<<<<<< Updated upstream
     * En el constructor se le da tamaño al objeto para que no sea pequeño
     */
    
    public Meta()
    {
        getImage().scale(getImage().getWidth()/8, getImage().getHeight()/8);
=======
     * Constructor donde se modifica el tamaño del objeto meta
     */
    public Meta(){   
        getImage().scale(getImage().getWidth()*2, getImage().getHeight()*2);
>>>>>>> Stashed changes
    }
}