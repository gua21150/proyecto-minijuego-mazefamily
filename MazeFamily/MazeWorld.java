import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 800X600 cells with a cell size of 1X1 pixels.
        // Largo, alto, pixel
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MazeParedes mazeParedes = new MazeParedes();
        addObject(mazeParedes,4*50,1*50);
        MazeParedes mazeParedes2 = new MazeParedes();
        addObject(mazeParedes2,4*50,3*50);
        MazeParedes mazeParedes3 = new MazeParedes();
        addObject(mazeParedes3,10*50,5*50);
        MazeParedes mazeParedes4 = new MazeParedes();
        addObject(mazeParedes4,5*50,1*50);
        MazeParedes mazeParedes5 = new MazeParedes();
        addObject(mazeParedes5,4*50,5*50);
        MazeParedes mazeParedes6 = new MazeParedes();
        addObject(mazeParedes6,6*50,1*50);
        MazeParedes mazeParedes7 = new MazeParedes();
        addObject(mazeParedes7,6*50,2*50);
        MazeParedes mazeParedes8 = new MazeParedes();
        addObject(mazeParedes8,5*50,4*50);
        MazeParedes mazeParedes9 = new MazeParedes();
        addObject(mazeParedes9,6*50,4*50);
        MazeParedes mazeParedes10 = new MazeParedes();
        addObject(mazeParedes10,7*50,4*50);
        MazeParedes mazeParedes11 = new MazeParedes();
        addObject(mazeParedes11,8*50,4*50);
        MazeParedes mazeParedes12 = new MazeParedes();
        addObject(mazeParedes12,8*50,3*50);
        MazeParedes mazeParedes13 = new MazeParedes();
        addObject(mazeParedes13,9*50,3*50);
        MazeParedes mazeParedes14 = new MazeParedes();
        addObject(mazeParedes14,7*50,1*50);
        MazeParedes mazeParedes15 = new MazeParedes();
        addObject(mazeParedes15,8*50,1*50);
        MazeParedes mazeParedes16 = new MazeParedes();
        addObject(mazeParedes16,9*50,1*50);
        MazeParedes mazeParedes17 = new MazeParedes();
        addObject(mazeParedes17,10*50,1*50);
        MazeParedes mazeParedes18 = new MazeParedes();
        addObject(mazeParedes18,11*50,1*50);
        MazeParedes mazeParedes19 = new MazeParedes();
        addObject(mazeParedes19,11*50,3*50);
        MazeParedes mazeParedes20 = new MazeParedes();
        addObject(mazeParedes20,11*50,4*50);
        MazeParedes mazeParedes21 = new MazeParedes();
        addObject(mazeParedes21,12*50,4*50);
        MazeParedes mazeParedes22 = new MazeParedes();
        addObject(mazeParedes22,13*50,4*50);
        MazeParedes mazeParedes23 = new MazeParedes();
        addObject(mazeParedes23,13*50,3*50);
        MazeParedes mazeParedes24 = new MazeParedes();
        addObject(mazeParedes24,13*50,2*50);
        MazeParedes mazeParedes25 = new MazeParedes();
        addObject(mazeParedes25,13*50,1*50);
        MazeParedes mazeParedes26 = new MazeParedes();
        addObject(mazeParedes26,12*50,1*50);
        MazeParedes mazeParedes27 = new MazeParedes();
        addObject(mazeParedes27,11*50,5*50);
        MazeParedes mazeParedes29 = new MazeParedes();
        addObject(mazeParedes29,8*50,6*50);
        MazeParedes mazeParedes30 = new MazeParedes();
        addObject(mazeParedes30,9*50,6*50);
        MazeParedes mazeParedes31 = new MazeParedes();
        addObject(mazeParedes31,7*50,6*50);
        MazeParedes mazeParedes32 = new MazeParedes();
        addObject(mazeParedes32,6*50,6*50);
        MazeParedes mazeParedes33 = new MazeParedes();
        addObject(mazeParedes33,4*50,7*50);
        MazeParedes mazeParedes34 = new MazeParedes();
        addObject(mazeParedes34,4*50,6*50);
        MazeParedes mazeParedes35 = new MazeParedes();
        addObject(mazeParedes35,4*50,8*50);
        MazeParedes mazeParedes36 = new MazeParedes();
        addObject(mazeParedes36,4*50,9*50);
        MazeParedes mazeParedes37 = new MazeParedes();
        addObject(mazeParedes37,5*50,10*50);
        MazeParedes mazeParedes38 = new MazeParedes();
        addObject(mazeParedes38,6*50,10*50);
        MazeParedes mazeParedes39 = new MazeParedes();
        addObject(mazeParedes39,8*50,8*50);
        MazeParedes mazeParedes40 = new MazeParedes();
        addObject(mazeParedes40,9*50,8*50);
        MazeParedes mazeParedes41 = new MazeParedes();
        addObject(mazeParedes41,10*50,8*50);
        MazeParedes mazeParedes42 = new MazeParedes();
        addObject(mazeParedes42,11*50,8*50);
        MazeParedes mazeParedes43 = new MazeParedes();
        addObject(mazeParedes43,11*50,7*50);
        MazeParedes mazeParedes44 = new MazeParedes();
        addObject(mazeParedes44,12*50,7*50);
        MazeParedes mazeParedes45 = new MazeParedes();
        addObject(mazeParedes45,4*50,10*50);
        MazeParedes mazeParedes46 = new MazeParedes();
        addObject(mazeParedes46,6*50,7*50);
        MazeParedes mazeParedes47 = new MazeParedes();
        addObject(mazeParedes47,7*50,10*50);
        MazeParedes mazeParedes48 = new MazeParedes();
        addObject(mazeParedes48,8*50,10*50);
        MazeParedes mazeParedes49 = new MazeParedes();
        addObject(mazeParedes49,9*50,10*50);
        MazeParedes mazeParedes50 = new MazeParedes();
        addObject(mazeParedes50,10*50,10*50);
        MazeParedes mazeParedes51 = new MazeParedes();
        addObject(mazeParedes51,11*50,10*50);
        MazeParedes mazeParedes52 = new MazeParedes();
        addObject(mazeParedes52,12*50,10*50);
        MazeParedes mazeParedes53 = new MazeParedes();
        addObject(mazeParedes53,13*50,10*50);
        MazeParedes mazeParedes54 = new MazeParedes();
        addObject(mazeParedes54,13*50,9*50);
        MazeParedes mazeParedes55 = new MazeParedes();
        addObject(mazeParedes55,13*50,8*50);
        MazeParedes mazeParedes56 = new MazeParedes();
        addObject(mazeParedes56,13*50,7*50);
        MazeParedes mazeParedes57 = new MazeParedes();
        addObject(mazeParedes57,13*50,6*50);
        MazeParedes mazeParedes58 = new MazeParedes();
        addObject(mazeParedes58,4*50,4*50);
        MazeParedes mazeParedes59 = new MazeParedes();
        addObject(mazeParedes59,6*50,8*50);

        meta meta = new meta();
        addObject(meta,700,255);
        Car car = new Car();
        addObject(car,170,95);
    }
}
