import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ulangi here.
 * 
 * @author Ndaru Pratiwi
 * @version (a version number or a date)
 */
public class Ulangi extends Actor
{
    /**
     * Act - do whatever the Ulangi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new HomePage());
        }
    }    
}
