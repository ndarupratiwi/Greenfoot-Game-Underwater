import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hiu here.
 * 
 * @author Ndaru Pratiwi
 * @version (a version number or a date)
 */
public class Hiu extends Actor
{
    public int score;
    /**
     * Act - do whatever the Hiu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-3, getY());
        if(isTouching(Bluetang.class)){
            removeTouching(Bluetang.class);
            Greenfoot.playSound("hiu.mp3");
            Greenfoot.setWorld(new OverPage());
        }
        if(getX()<4){
            getWorld().removeObject(this);
        }
    }    
}
