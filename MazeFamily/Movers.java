import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Movers es la que genera los movimiento del objeto de la clase Car y como interactua con las demás clases,  ya que es una super clase .
 *  
 * @author Mariel Alejandra Guamuche Recinos 
 * @version 1.3
 */

public class Movers extends Actor
{
    private int speed = 3; // es la cantidad pixeles que se mueve
    
    /*
     * Método moverse. Responde a los comandos de direccionamiento de las flechas del teclado. Los movimientos permitidos son en línea recta:
     * arriba o abajo
     * delante o atrás.
     * 
     * En caso de toparse con una pared, el movimiento realizado provocará que se retroceda a la posición donde no chocaba.
     */
    public void moverse()
    {
        int x = getX(); // obtiene la posicion en x del objeto
        int y = getY(); // obtiene la posicicion en y del objeto 

        if (Greenfoot.isKeyDown("right"))
        { 
            // indica movimiento hacia la derecha 
            if ((x+speed)>170) 
            {
                // verifica que no sean posiciones que provoque salirse del laberinto 
                // si esta dentro del limite permitira el movimiento
                setLocation(x + speed, y);
            }
            
            if (toparseConPared()==true) 
            {   // si se topa con la pared entonces "regresara" la distancia recorrida
                setLocation(x - speed, y);
            }
        }

        if (Greenfoot.isKeyDown("left")) // presiona tecla izquierda 
        {    
            if ((x-speed)>170) // permitira el movimiento 
            {
                setLocation(x - speed, y);
            }
            
            if (toparseConPared()==true) 
            {   // si se topa con la pared entonces "regresara" la distancia recorrida
                setLocation(x + speed, y);
            }
        }

        if (Greenfoot.isKeyDown("up"))
        {
            // se resta a la y, de lo contrario se direcciona hacia arriba
            setLocation(x, y - speed); 
            if (toparseConPared()==true) 
            {   // si se topa con la pared entonces "regresara" la distancia recorrida
                setLocation(x, y + speed);
            }
        }

        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y + speed);
            if (toparseConPared()==true) 
            {   // si se topa con la pared entonces "regresara" la distancia recorrida
                setLocation(x, y - speed);
            }
        }
    }

    /*
     * Método que retorna valor true o false dependiendo si se ha tocado a un objeto de la clase MazeParedes
     */
    public boolean toparseConPared()
    {
        if (isTouching(MazeParedes.class)) // valida si se topa con una clase
        {
            return true;
        }
        else 
        {
            return false;            
        }
    }
    
    /*
<<<<<<< Updated upstream
<<<<<<< Updated upstream
     * Indica cuando el objeto Car ha llegado a la meta.
     * Recibe por parámetros un objeto Timer y un objeto ContadorPuntos.
     * Los parámetros serán utilizados para enviarlos a otra imagen de mundo "DisplayPuntos"
=======
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
>>>>>>> Stashed changes
=======
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
>>>>>>> Stashed changes
     */
    public void llegarMeta(Timer tim, ContadorPuntos cont)
    {
        // metodo en caso de llegar a la meta 
        if(isTouching(Meta.class)) // si el objeto de la clase Car toca al objeto de la clase meta entonces quiere decir que llego a la meta.
        {
<<<<<<< Updated upstream
            // Genera un nuevo mundo, que recibe los parámetros que recibe el método llegarMeta
            Greenfoot.setWorld(new DisplayPuntos(tim, cont));
        }
    }
=======
            // se coloca imagen de "llegar a la meta"
            getWorld().addObject(new WinnerScreen(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop(); // Pausara a todo greenfoot
            Greenfoot.setWorld(new DisplayPuntos(tim, cont));
        }
    }
    

<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
}
