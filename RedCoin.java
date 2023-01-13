import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCoin here.
 * Food for our elephant.
 * 
 * @author Brady 
 * @version Dec 2022
 */
public class RedCoin extends Actor
{
    int speed = 1;
    //int direction = 1;
    int directionDown = 1;
    /**
     * Act - do whatever the RedCoin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        setLocation(getX(), getY() + speed);
        
        if(getY() >= 580 || getY() <= 0)
        {
            speed = -speed;   
        }
        
        // Remove RedCoin and draw game over when RedCoin gets to bottom
        if(isTouching(King.class))
        {
            removeTouching(King.class);
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            //world.removeObject(this);
        }
    }
    
    public void setSpeed(int Speed)
    {
        speed = Speed;
    }
}
