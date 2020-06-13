import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverPage here.
 * 
 * @author Ndaru Pratiwi 
 * @version (a version number or a date)
 */
public class OverPage extends World
{

    /**
     * Constructor for objects of class OverPage.
     * 
     */
    public OverPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 562, 1); 
        prepare();
    }

    public void prepare(){
        GameOver GameOver = new GameOver();
        addObject (GameOver, 450, 210);
        showText("The Bom you ate or Shark ate You, you lose!", 490,350);
        showText("YOUR SCORE : "+MyWorld.score.getValue()+" points ", 490, 400);
        Quit quit = new Quit();
        addObject(quit,456,456);
        Ulangi ulangi = new Ulangi();
        addObject(ulangi,551,456);
        quit.setLocation(675,505);
        ulangi.setLocation(475,455);
        quit.setLocation(824,498);
        ulangi.setLocation(464,447);
    }
}
