import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bluetang here.
 * 
 * @author Ndaru Pratiwi 
 * @version (a version number or a date)
 */
public class Bluetang extends Actor
{
    /**
     * Act - do whatever the Bluetang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mouseMoved();
        checkCollision();
    }   
    private void mouseMoved(){
        if(Greenfoot.mouseMoved(null)){
         MouseInfo mouse = Greenfoot.getMouseInfo();
         setLocation(mouse.getX(), mouse.getY());
    }

    }
    private void checkCollision(){
        if(isTouching(Udang.class)){
            removeTouching(Udang.class);
            MyWorld.score.add(2);
            SecondLevel.score.add(2);
        }
        if(isTouching(Cacing.class)){
            removeTouching(Cacing.class);
            MyWorld.score.add(2);
            SecondLevel.score.add(2);
        }
    }
}
