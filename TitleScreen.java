import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Title Screen.
 * 
 * @author Brady
 * @version Jan 2022
 */

public class TitleScreen extends World
{
    Label titleLabel = new Label("The King", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        addObject(titleLabel, 200, 100);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if the user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //King_black king = new King();
        //addObject(king,451,100);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,90,255);
        Label label2 = new Label("Use arrow keys to move", 40);
        addObject(label2,90,255);
        label.setLocation(275,262);
        label2.setLocation(262,313);
        label.setLocation(277,231);
    }
}

