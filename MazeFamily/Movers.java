import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// Esta es una superclase, de donde las demas clases heredaran atributos y metodos
public class Movers extends Actor
{
    /*
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int speed = 3; // es la cantidad pixeles que se mueve
    
    
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
    
    public void llegarMeta()
    {
        // metodo en caso de llegar a la meta 
        if(isTouching(Meta.class)) // si el objeto de la clase Car toca al objeto de la clase meta entonces quiere decir que llego a la meta.
        {
            // se coloca imagen de "llegar a la meta"
            getWorld().addObject(new WinnerScreen(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop(); // Pausara a todo greenfoot
        }
    }
    
    
    public void reto()
    {
        Actor reto;
        reto = getOneObjectAtOffset(0,0, LlamadaRetos.class);
        // metodo en caso de tocar casilla de retos       
        if(reto != null)
        {
            World world;
            world = getWorld();
            world.removeObject(reto);
        }
    }
}
