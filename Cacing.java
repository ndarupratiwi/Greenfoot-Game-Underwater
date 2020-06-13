import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cacing here.
 * 
 * @author Ndaru Pratiwi 
 * @version (a version number or a date)
 */
public class Cacing extends Actor
{
    private int speed;
    /**
     * Act - do whatever the Cacing wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cacing() 
    {
       speed=Greenfoot.getRandomNumber(4)+1;
    }   
    public void act(){
        setLocation(getX()-speed, getY());
        turn(1);
        if(getX() == 0){
            SecondLevel.score.add(-1);
            getWorld().removeObject(this);
        }
    }
}
