import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bom here.
 * 
 * @author Ndaru Pratiwi 
 * @version (a version number or a date)
 */
public class Bom extends Actor
{
    public int score;
    /**
     * Act - do whatever the Bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-4, getY());
        if(isTouching(Bluetang.class)){
            removeTouching(Bluetang.class);
            Greenfoot.playSound("bom.mp3");
            Greenfoot.setWorld(new OverPage());
        }
        if(getX()<5){
            getWorld().removeObject(this);
        }
    }    
}
