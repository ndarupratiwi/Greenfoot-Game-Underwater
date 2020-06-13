import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Petunjuk here.
 * 
 * @author Ndaru Pratiwi 
 * @version (a version number or a date)
 */
public class Petunjuk extends World
{

    /**
     * Constructor for objects of class Petunjuk.
     * 
     */
    public Petunjuk()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 507, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Back back = new Back();
        addObject(back,812,462);
    }
}
