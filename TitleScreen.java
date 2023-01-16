import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * The first screen that the player will see, before the game starts.
 * @author Brady
 * @version Jan 2023
 */

public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        // Create the title screen
        prepare();
    }

    /**
     * The main world act loop. This allows the game to start.
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
     * Elements of the title screen. This includes all captions, and objects that will appear.
     */
    private void prepare()
    {
        //King_black king = new King();
        //addObject(king,451,100);
        Label label = new Label("Press <space> to Start", 50);
        addObject(label,90,255);
        Label label2 = new Label("Arrow keys or WASD to move", 40);
        addObject(label2,90,255);
        Label label3 = new Label("Collect the coins", 40);
        addObject(label3,174,337);
        label3.setLocation(204,340);
        Label label4 = new Label("Run from the red coin", 40);
        addObject(label4,97,387);
        label.setLocation(270,189);
        label2.setLocation(270,259);
        label3.setLocation(175,324);
        label4.setLocation(215,392);
        Coin coin = new Coin();
        addObject(coin,465,316);
        King king = new King();
        addObject(king,419,103);
        King_title king_title = new King_title();
        addObject(king_title,166,68);
        king_title.setLocation(173,89);
        Red_Coin_Image red_Coin_Image = new Red_Coin_Image();
        addObject(red_Coin_Image,478,399);
        coin.setLocation(473,314);
    }
}

