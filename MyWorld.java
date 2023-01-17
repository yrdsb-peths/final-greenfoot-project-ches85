import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world in which the king lives in.
 * @ Brady
 * @ Version Jan 2023
 */
public class MyWorld extends World
{
    // Variable to hold the score
    public int score = 0;
    // Variable for the level
    int level = 1;
    
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {    
       
        // Create a new world with 580x580 cells with a cell size of 1x1 pixels.
        super(580, 580, 1, false);
        
        // Create the king object
        King king = new King();
        addObject(king, 300, 300);
        
        // Create the red coin object
        RedCoin redCoin = new RedCoin();
        addObject(redCoin, 300, 0);
        
        //Create the label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        // Spawn new coins
        createCoin();
    }
    
    /**
     * Increase score on the counter
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 5 == 0)
        {
            level += 1;
            createRedCoin();
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
     * Create a new coin at random location at top of screen.
     */
    public void createCoin()
    {
        Coin coin = new Coin();
        int x = Greenfoot.getRandomNumber(580);
        int y = Greenfoot.getRandomNumber(580);
        addObject(coin, x, y);
    }
    
    /**
     * Create a new coin at random location at top of screen.
     */
    public void createRedCoin()
    {
        RedCoin redCoin = new RedCoin();
        redCoin.setSpeed(level);
        int x = Greenfoot.getRandomNumber(580);
        int y = 0;
        addObject(redCoin, x, y);
    }
}
