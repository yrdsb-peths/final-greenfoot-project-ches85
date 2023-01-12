import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @ Brady
 * @ Version Dec 2022
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(580, 580, 1);
        
        // Create the king object
        King king = new King();
        addObject(king, 300, 300);
        
        Draught draught = new Draught();
        addObject(draught, 300, 0);
        
        //Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        
        createCoin();
        
    }
    
    /**
     * Increase score
     */
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
     //   if(score % 5 == 0)
        {
        //    level += 1;
        }
    }
    
    
    /**
     * End the game and draw 'Game Over'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 300);
    }
    
    
    /**
     * Create a new apple at random location at top of screen.
     */
    public void createCoin()
    {
        Coin Coin = new Coin();
        //Coin.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(600);
        addObject(Coin, x, y);
    }
    
    
    
}
