import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane; // permite mostrar cuadros de texto
/**
 * Es el auto que se mueve por el laberinto para que el personaje principal llegue a su casa. 
 * 
 * @author Mariel Alejandra Guamuche Recinos
 * @version 1.3
 */
public class Car extends Movers
{    
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private ContadorPuntos contador;
    private Timer time;
<<<<<<< Updated upstream
    
    // Constructor
    /*
     * Da tamaño al objeto instanciado. 
     * Recibe por parámetros el contador de puntos y el timer que serán utilizados cuando se instancie el nuevo mundo.
     */
    public Car(ContadorPuntos cont, Timer time)
=======
    // Constructor
    
    /*
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */public Car(ContadorPuntos cont, Timer time)
>>>>>>> Stashed changes
    {
        // Le dara al objeto la mitad del tama~o original
        getImage().scale(getImage().getWidth()/2, getImage().getHeight());
        
        // El valor del contador se almacenara incluso despues de haberse llevado a cabo el constructor
        this.contador = cont;
        this.time = time;
<<<<<<< Updated upstream

    }

    /*
     * Llamada a métodos de la superclase Movers y de métodos locales
=======
    }

    /*
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
>>>>>>> Stashed changes
     */
    public void act()
    {
        moverse(); // llamada del metodo moverse 
        llegarMeta(time, contador); // llamada de metodo en caso que llegue a la meta
        reto();           
    }
    
    
<<<<<<< Updated upstream
    
    /*
     * Genera retos con aritmética básica, puede ser suma, resta o multiplicación.
     * Los número por operar son gerados con un objeto random entre valores de 0 y 20
     * El tercer número random genera cuál reto será asignado, si suma, resta o multiplicación.
     */
    public void reto()
    {
        if(getOneObjectAtOffset(0, 0, LlamadaRetos.class)!= null)
        {
            Greenfoot.playSound("rinrin.mp3"); // si toca al objeto LlamadaRetos entonces sonará una campana
            int n1 = Greenfoot.getRandomNumber(21); // valor para reto entre 0 y 20
            int n2 = Greenfoot.getRandomNumber(21); // valor para reto entre 0 y 20
            int n3 = Greenfoot.getRandomNumber(4); // valor para saber cual reto 
            int resultadoCorrecto=0; // se inicializa con 0 ya que se hacen condiciones con él y no permite realizarse si no tiene un valor inicial
            int resultadoUsuario; // se guardará el resultado propuesto por el usuario
            String inputValue = ""; // se almacena el resultado del usuario
            switch(n3)
            {
                case 0:
                    resultadoCorrecto = n1 + n2; // se genera la respuesta correcta para ser comparada 
                    inputValue = JOptionPane.showInputDialog("¿Saben cuánto es?\n"+(int) n1 + "+" + (int) n2);
                    break;
                case 1:
                    resultadoCorrecto = n1 - n2;
                    inputValue = JOptionPane.showInputDialog("¿Saben cuánto es?\n" +(int) n1 + "-" + (int) n2);
                    break;
                case 2:
                    resultadoCorrecto = n1 * n2;
                    inputValue = JOptionPane.showInputDialog("¿Saben cuánto es?\n" + (int) n1 + "*" + (int) n2);
                    break;
                case 3:
                    // opcion comodin que regala puntos
                    JOptionPane.showMessageDialog(null, "Se te regalarán 100 puntos ;)","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                    inputValue = Integer.toString(resultadoCorrecto);
                    break;
            }
            
            boolean can_do=valido(inputValue); // valida el dato ingresado por el usuario
            
            if(can_do==true) // si el dato es válido entonces prosigue a cambiar de string a int
            {
                resultadoUsuario = Integer.parseInt(inputValue);
            }
            else
            {
                // de lo contrario entrará en un ciclo while hasta que el usuario coloque un resultado int 
                while(!valido(inputValue))
                {
                    inputValue = JOptionPane.showInputDialog("¿Saben cuánto es?\n" + (int) n1 + "*" + (int) n2 + "\nVerifique ingresar un numero");
                }
                // cuando finalmente lo coloque entonces se hace el cambio de string a int 
                resultadoUsuario = Integer.parseInt(inputValue);
            }
            // si las respuestas son las mismas entonces se llama al método retoCumplido
=======
    /*
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */public void reto()
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
                inputValue = JOptionPane.showInputDialog("¿Saben cuánto es?\n"+(int) n1 + "+" + (int) n2);
            }
            else if(n3 == 1) // resta
            {
                resultadoCorrecto = n1 - n2;
                inputValue = JOptionPane.showInputDialog("¿Saben cuánto es?\n" +(int) n1 + "-" + (int) n2);
            }
            else if(n3 == 2) // multiplicacion
            {
                resultadoCorrecto = n1 * n2;
                inputValue = JOptionPane.showInputDialog("¿Saben cuánto es?\n" + (int) n1 + "*" + (int) n2);
            }
            
            resultadoUsuario = Integer.parseInt(inputValue);
>>>>>>> Stashed changes
            if(resultadoCorrecto == resultadoUsuario)
            {
                retoCumplido();
            }
            else
            {
<<<<<<< Updated upstream
                // si el reto no fue cumplido se envía el resultado correcto y la respuesta del usuario
=======
>>>>>>> Stashed changes
                retoIncumplido(resultadoCorrecto, resultadoUsuario);
            }
        }
    }
<<<<<<< Updated upstream

    
    /*
     * Bonifica 100 puntos al usuario. Solamente se activa si el usuario respondió correctamente
     */
    public void retoCumplido()
    {
        Actor reto; // instancia de objeto tipo Actor 
        reto = getOneObjectAtOffset(0,0, LlamadaRetos.class); // recibe una referencia del objeto
        // metodo en caso que haya resuelto el reto     
        if(reto != null) // si se tiene un objeto "ingresado" se elimina del laberinto
        {
            World world; // se elimina el objeto del mundo y se aumenta el valor del contador de puntos en 100
            world = getWorld();
            world.removeObject(reto);
            contador.setValue(contador.getValue()+100); // se obtiene el valor para que se sume lo que ya se había acumulado 
=======
    
    /*
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
>>>>>>> Stashed changes
        }
    }
    
    /*
<<<<<<< Updated upstream
     * Resta 15 quetzales al usuario porque ha respondido incorrectamente. 
     * Recibe dos enteros, uno de la respuesta correcta y otro de la respuesta del usuario.
     * Remueve el objeto reto del mundo.
     */

=======
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
            
            if(contador.getValue()>0){
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta! La respuesta es " + (int)respuesta + " \nY ustedes colocaron: " + (int) usuario + "\nSe te descontaran Q15.","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                contador.setValue(contador.getValue()-15);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta! La respuesta es " + (int)respuesta + " \nY ustedes colocaron: " + (int) usuario + "\nNo podemos descontarte, no tienes suficiente dinero","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    /*
    * Recibe el string de la respuesta del usuario y valida si el texto puede ser convertido a tipo entero.
    * Si no se puede convertir entonces se retorna false.
    * Si se puede convertir entonces se retorna true.
    */
    
    public boolean valido(String valor)
    {
        try
        {
           Integer.parseInt(valor);
           return true;
        }
        catch(NumberFormatException error)
        {
            return false;            
=======
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta! La respuesta es " + (int)respuesta + " \nY ustedes colocaron: " + (int) usuario + "\n se te descontaran Q15.","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            contador.setValue(contador.getValue()-15);
>>>>>>> Stashed changes
        }
    }
}
