import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * Coin, the food for the king.
 * 
 * @author Brady
 * @version Dec 2022
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] coinRight = new GreenfootImage[11];
    
    //The default direction the coin is facing at the start of the animation
    String facing = "right";
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
                
        animationTimer.mark();
        
        //Initial elephant image
        setImage(coinRight[0]);
    }
    
    /**
     * Animate the coin
     */
    int imageIndex = 0;
    public void animateCoin()
    {
        if(animationTimer.millisElapsed() < 50)
        {
            return;
        }    
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(coinRight[imageIndex]);
            imageIndex = (imageIndex + 1) % coinRight.length;
        }
    }
    
    
    
    
    
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY());
        
        // Animate the coin
        animateCoin();       
        
    }
    // Creates instance of the world where the coin lives in
    //MyWorld world = (MyWorld) getWorld();
}
