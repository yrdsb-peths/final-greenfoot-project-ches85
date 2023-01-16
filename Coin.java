import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Coin, the food for the king.
 * @author Brady
 * @version Jan 2023
 */
public class Coin extends Actor
{
    // The default direction the coin is facing at the start of the animation
    String facing = "right";
    // Add in the images to an array
    GreenfootImage[] coinRight = new GreenfootImage[11];
    
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor - The code that gets run one time when object is created
     */
    public Coin()
    {
        for(int i = 0; i < coinRight.length;i++)
        {
            coinRight[i] = new GreenfootImage("images/coin_spin/coin" + i + ".png");
            coinRight[i].scale(70, 70);
        }
        
        // First image of coin
        setImage(coinRight[0]);
    }
    
    /**
     * Animate the coin, and make it spin around
     */
    int imageIndex = 0;
    public void animateCoin()
    {
        if(animationTimer.millisElapsed() < 50)
        {
            return;
        }    
        if(facing.equals("right"))
        {
            setImage(coinRight[imageIndex]);
            imageIndex = (imageIndex + 1) % coinRight.length;
        }
        // To mark the time
        animationTimer.mark();
    }
    
    /**
     * Act - To create the coin in the world.
     */
    public void act() 
    {
        // Creates instance of the world where the coin lives in
        setLocation(getX(), getY());
        
        // Animate the coin
        animateCoin();    
    }
}
