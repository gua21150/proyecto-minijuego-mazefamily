import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
<<<<<<< Updated upstream
<<<<<<< Updated upstream
 * Este mundo despliega únicamente los datos de tiempo y de punteo de la bonificación extra que tienen los usuarios.
=======
 * Este mundo desplega unicamente los datos de tiempo y de punteo de la bonificación extra que tienen los usuarios.
>>>>>>> Stashed changes
=======
 * Este mundo desplega unicamente los datos de tiempo y de punteo de la bonificación extra que tienen los usuarios.
>>>>>>> Stashed changes
 * Es instanciado desde movers tras haber llegado el objeto car a la meta.
 * @author Mariel Alejandra Guamuche Recinos
 * @version 29/07/2021
 */
public class DisplayPuntos extends World
{

    /**
     * El constructor recibe los datos desde la clase de Movers.
     * Tiene por parámetros los valores del temporizador y del contador de puntos presente en MazeWorld
     */
    
    // atributos
    private Timer tim; // variable local de tim
    private ContadorPuntos cont; // variable local de contador de puntos
    private WinnerScreen screen = new WinnerScreen(); // instancia de screen
    
    public DisplayPuntos(Timer tim, ContadorPuntos cont)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.tim = tim; // se asignan los datos de tim a la variable tim 
        this.cont = cont; // se asigna el dato de cont en la variable cont
        
        prepare();        
    }
    
    public void prepare()
    {
        this.addObject(screen, 300, 100);
        // variables de conversion de datos tipo int a tipo string 
        String tiempoTotal= Integer.toString(tim.getValue());
        String PuntosTotal= Integer.toString(cont.getValue());
        String displayPuntos =((cont.getValue()>0)?"Han obtenido un bono de "+ PuntosTotal + " quetzales. \nHaremos un rico churrasco":
        "Han obtenido un bono de "+ PuntosTotal + " quetzales. \nMejor suerte a la proxima"); 

        // creacion del texto como imagen 
        GreenfootImage displayTiempo = new GreenfootImage("Les ha tomado "+ tiempoTotal + " segundos en completar el laberinto", 25, Color.BLACK, new Color(0, 0, 0, 0));
        GreenfootImage displayPuntos2 = new GreenfootImage(displayPuntos, 25, Color.BLACK, new Color(0, 0, 0, 0));
        // despliegue de imagen en pantalla 
        getBackground().drawImage(displayPuntos2, (getWidth()-displayPuntos2.getWidth())/2, (getHeight()-displayPuntos2.getHeight())/2+50);
        getBackground().drawImage(displayTiempo, (getWidth()-displayTiempo.getWidth())/2, (getHeight()-displayTiempo.getHeight())/2);
        
        // Greenfoot termina porque se ha terminado la partida
        Greenfoot.stop();
    }
}
