import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class King here.
 * The king, the one who stands above all.
 * @author Brady
 * @version Jan 2023
 */

public class King extends Actor
{
    // Sound effect when king eats the coin
    GreenfootSound kingSound = new GreenfootSound("coinsound.mp3");
    
    /**
     * Act - The king can move up, down, right and left, and can eat the coins.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            move(1);
        }
        else if(Greenfoot.isKeyDown("up")  || Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 1);
        }
        else if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 1);
        }
        // Eat the coin
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
