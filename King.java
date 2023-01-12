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
    GreenfootSound kingSound = new GreenfootSound("coinsound.mp3");
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
            move(-2);
            //facing = "left";
        }
        else if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            move(2);
            //facing = "right";
        }
        else if(Greenfoot.isKeyDown("up")  || Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 2);
            //facing = "up";
        }
        else if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 2);
            //facing = "down";
        }
        eat();
    }
    /**
    * Eat the coin and spawn new coin if a coin is eaten.
    */
    public void eat()
    {
        if(isTouching(Coin.class))
        {
            removeTouching(Coin.class);
            MyWorld world = (MyWorld) getWorld();
            world.createCoin();
            world.increaseScore();
            kingSound.play();
        }
    }
    
}
