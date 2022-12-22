import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class TitleScreen here.
 * Title Screen.
 * 
 * @author Brady
 * @version Dec 13 2022
 */

public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 200, 100);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
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
        label.setLocation(203,224);
        label.setLocation(106,308);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,184,187);
        label2.setLocation(211,217);
        label2.setLocation(199,232);
        label2.setLocation(168,213);
        label.setLocation(228,276);
        label2.setLocation(233,213);
        label.setLocation(226,269);
        label2.setLocation(130,215);
        label2.setLocation(242,193);
        //elephant.setLocation(436,108);
        label2.setLocation(144,194);
        label.setLocation(269,312);
        label2.setLocation(173,234);
        label2.setLocation(230,234);
        label2.setLocation(261,240);
        label.setLocation(321,317);
        label.setLocation(247,310);
    }
}

