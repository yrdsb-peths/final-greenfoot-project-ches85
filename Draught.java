import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Draught here.
 * Food for our elephant.
 * 
 * @author Brady 
 * @version Dec 2022
 */
public class Draught extends Actor
{
    int speed = 1;
    //int direction = 1;
    int directionDown = 1;
    /**
     * Act - do whatever the Draught wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        setLocation(getX(), getY() + speed);
        
        if(getY() >= 200 || getY() <= 0)
        {
            speed = -speed;   
        }
        
        // Remove Draught and draw game over when Draught gets to bottom
        if(isTouching(King.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int Speed)
    {
        speed = Speed;
    }
    
    // Draught turn around for moving up and down
    //public void turnAround();
    //{
    //    turn(180);
    //}
    
}
