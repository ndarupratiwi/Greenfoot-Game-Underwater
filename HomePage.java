import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomePage here.
 * 
 * @author Ndaru Pratiwi 
 * @version (a version number or a date)
 */
public class HomePage extends World
{

    /**
     * Constructor for objects of class HomePage.
     * 
     */
    public HomePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 564, 1); 
        prepare();
        Greenfoot.start();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Play play = new Play();
        addObject(play,416,342);
        play.setLocation(436,328);
        play.setLocation(444,323);
        play.setLocation(428,340);
        About about = new About();
        addObject(about,738,471);
        about.setLocation(806,498);
        about.setLocation(801,487);
    }
}
