import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @ Brady
 * @ Version Dec 2022
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        
        //King king = new King();
        //addObject(king, 300, 300);
        
    }
    
    public void createKing()
    {
        King king = new King();
        int x = 300;
        int y = 300;
        addObject(king, x, y);    
    }
    
    
    public void createChecker()
    {
        King king = new King();
        int x = 300;
        int y = 300;
        addObject(king, x, y); 
    }
}
