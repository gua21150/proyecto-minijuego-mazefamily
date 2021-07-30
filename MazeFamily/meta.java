import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase indica cuando el carro ha llegado hasta la meta. Se utiliza más el objeto instanciado de esta clase
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meta extends Actor
{
    /**
     * Act - do whatever the meta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public Meta(){
        getImage().scale(getImage().getWidth()*2, getImage().getHeight()*2);
    }
}
