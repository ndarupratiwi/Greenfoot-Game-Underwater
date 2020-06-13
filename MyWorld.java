import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Ndaru Pratiwi 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter ("Hp : ");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 534, 1); 
        prepare();
    }
    public void act(){
        if(Greenfoot.getRandomNumber(100) < 3){
            addObject(new Udang(), 898, Greenfoot.getRandomNumber(360));
}
if(Greenfoot.getRandomNumber(200) < 1){
            addObject(new Bom(), 898, Greenfoot.getRandomNumber(360));
}
if(MyWorld.score.getValue()>=50){
    Greenfoot.delay(5);
    Greenfoot.setWorld(new SecondLevel());
}
}
private void prepare(){
    Bluetang bluetang = new Bluetang();
    addObject(bluetang, 171, 198);
    Udang udang = new Udang();
    addObject(udang, 574, 207);
    Bom bom = new Bom();
    addObject(bom, 787,168);
    removeObject(udang);
    bom.setLocation(752, 175);
    bom.setLocation(752, 175);
    removeObject(bom);
    bluetang.setLocation(103, 246);
    bluetang.setLocation(91, 224);
    
    addObject(score, 80, 45);
    score.setValue(0);
    
    hp.setValue(1);
}
}
