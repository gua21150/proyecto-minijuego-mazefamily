import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane; // permite mostrar cuadros de texto
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
    
    private ContadorPuntos contador;
    private boolean can_go;
    // Constructor
    public Car(ContadorPuntos cont)
    {
        // Le dara al objeto la mitad del tama~o original
        getImage().scale(getImage().getWidth()/2, getImage().getHeight());
        
        // El valor del contador se almacenara incluso despues de haberse llevado a cabo el constructor
        contador = cont;
    }

    public void act()
    {
        moverse(); // llamada del metodo moverse 
        llegarMeta(); // llamada de metodo en caso que llegue a la meta
        reto();           
    }
    
    public void reto()
    {
        if(getOneObjectAtOffset(0, 0, LlamadaRetos.class)!= null)
        {
            
            Greenfoot.playSound("rinrin.mp3");
            int n1 = Greenfoot.getRandomNumber(20); // valor para reto entre 0 y 10
            int n2 = Greenfoot.getRandomNumber(20); // valor para reto entre 0 y 10
            int n3 = Greenfoot.getRandomNumber(3); // valor para saber cual reto 
            int resultadoCorrecto=0;
            int resultadoUsuario;
            String inputValue = "";
            
            if(n3==0) // Suma
            {
                resultadoCorrecto = n1 + n2;
                inputValue = JOptionPane.showInputDialog((int) n1 + "+" + (int) n2,"¿Saben cuánto es?");
            }
            else if(n3 == 1) // resta
            {
                resultadoCorrecto = n1 - n2;
                inputValue = JOptionPane.showInputDialog((int) n1 + "-" + (int) n2,"¿Saben cuánto es?");
            }
            else if(n3 == 2) // multiplicacion
            {
                resultadoCorrecto = n1 * n2;
                inputValue = JOptionPane.showInputDialog((int) n1 + "*" + (int) n2,"¿Saben cuánto es?");
            }
            
            resultadoUsuario = Integer.parseInt(inputValue);
            if(resultadoCorrecto == resultadoUsuario)
            {
                retoCumplido();
            }
            else
            {
                retoIncumplido(resultadoCorrecto, resultadoUsuario);
            }
        }
    }
    public void retoCumplido()
    {
        Actor reto;
        reto = getOneObjectAtOffset(0,0, LlamadaRetos.class);
        // metodo en caso que haya resuelto el reto     
        if(reto != null)
        {
            World world;
            world = getWorld();
            world.removeObject(reto);
            contador.setValue(contador.getValue()+100);
        }
    }
    
    public void retoIncumplido(int respuesta, int usuario)
    {
        Actor reto;
        reto = getOneObjectAtOffset(0,0, LlamadaRetos.class);
        // metodo en caso que haya resuelto el reto     
        if(reto != null)
        {
            World world;
            world = getWorld();
            world.removeObject(reto);
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta! La respuesta es " + (int)respuesta + " Y ustedes colocaron: " + (int) usuario + "\n se te descontaran Q15.","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            contador.setValue(contador.getValue()-15);
        }
    }
}
