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
    GreenfootSound kingSound = new GreenfootSound("eatsound.mp3");
    
    public void act() 
    {
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
        else if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 1);
            //facing = "up";
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 1);
            //facing = "down";
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
            world.increaseScore();
            kingSound.play();
        }
    }
    
}
