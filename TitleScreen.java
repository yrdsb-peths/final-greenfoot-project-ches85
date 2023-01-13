import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Title Screen.
 * 
 * @author Brady
 * @version Jan 2022
 */

public class TitleScreen extends World
{
    //Label titleLabel = new Label("The King", 80);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        //addObject(titleLabel, 200, 100);
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
        label4.setLocation(240,392);
        Coin coin = new Coin();
        addObject(coin,465,316);
        coin.setLocation(409,326);
        King king = new King();
        addObject(king,419,103);
        King_title king_title = new King_title();
        addObject(king_title,166,68);
        king_title.setLocation(173,89);
        Red_Coin_Image red_Coin_Image = new Red_Coin_Image();
        addObject(red_Coin_Image,478,399);
        coin.setLocation(471,306);
        coin.setLocation(473,314);
        label4.setLocation(182,399);
    }
}

