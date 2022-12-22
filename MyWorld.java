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
        super(600, 600, 1);
        
        // Create the elephant object
        King king = new King();
        addObject(king, 300, 300);
        
        Checker checker = new Checker();
        addObject(checker, 300, 0);
        
        //Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        
        //createChecker();
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
     * Create a new apple at random location at top of screen.
     */
    public void createApple()
    {
        Checker checker = new Checker();
        //checker.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(600);
        addObject(checker, x, y);
    }
    
    
    
}
