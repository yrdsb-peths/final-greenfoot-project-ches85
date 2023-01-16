import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The enemy of the king, who must be avoided at all costs.
 * @author Brady 
 * @version Jan 2023
 */
public class RedCoin extends Actor
{
    // Speed of the red coin
    int speed = 1;
    // Direction the red coin is going
    int directionDown = 1;
    // Sound effect when red coin touches the king
    GreenfootSound coinSound = new GreenfootSound("gameoversound.mp3");
    /**
     * Act - Red coin moves up and down in order to block the king from getting the coins. 
     * As the coins are added, they will get progressively faster.
     */
    public void act() 
    {
        setLocation(getX(), getY() + speed);
        
        // When red coin reaches the bottom, it will move back up
        if(getY() >= 580 || getY() <= 0)
        {
            speed = -speed;   
        }
        // If red coin touches the king, the game is over and king is removed.
        if(isTouching(King.class))
        {
            removeTouching(King.class);
            MyWorld world = (MyWorld) getWorld();
            coinSound.play();
            world.gameOver();
        }
    }
    
    public void setSpeed(int Speed)
    {
        speed = Speed;
    }
}
