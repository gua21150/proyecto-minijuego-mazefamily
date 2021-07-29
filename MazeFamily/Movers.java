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
    public void act()
    {
        // Add your action code here.
    }
    int speed = 3; // es la cantidad pixeles que se mueve
    
    /*public void giros()
     * esta clase aun no se sabe si se implementara en la version final
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(3);
        }

        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(3);
        }

        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(3);
        }

        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(3);
        }
    } */ 

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
}
