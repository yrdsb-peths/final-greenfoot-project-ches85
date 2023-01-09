



import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class King here.
 * The king, the one who stands above all.
 * 
 * 
 * @author Brady
 * @version (a version number or a date)
 */
public class King extends Actor
{
    /**
     * Act - do whatever the King wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            //facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
            //facing = "right";
        }

    }
    /**
    * Eat the checker and spawn new checker if a checker is eaten.
    */
    public void eat()
    {
        if(isTouching(Checker.class))
        {
            removeTouching(Checker.class);
            MyWorld world = (MyWorld) getWorld();
            world.createChecker();
            //world.increaseScore();
        }
    }
    
}
