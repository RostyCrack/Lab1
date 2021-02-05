import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @Cristian Rosero 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public void prepareScenario(){
        Robot robot = new Robot();
        addObject(robot,48, 50);
        
        Wall wall = new Wall();
        addObject(wall, 52, 147);
        
        Wall wall1 = new Wall();
        addObject(wall1, 159, 147);
        
        Wall wall2 = new Wall();
        addObject(wall2, 266, 147);
        
        Wall wall3 = new Wall();
        addObject(wall3, 587,147);
        
        Wall wall4 = new Wall();
        addObject(wall4, 692, 147);
        
        Wall wall5 = new Wall();
        addObject(wall5, 791, 147);
        
        Block block = new Block();
        addObject(block, 427, 145);
        
        Home home = new Home();
        addObject(home, 751, 552);
        
        ScorePanel scorepanel = new ScorePanel();
        addObject(scorepanel, 71, 554);
        
        Pizza pizza = new Pizza();
        addObject(pizza, 720, 46);
        
        Pizza pizza1 = new Pizza();     
        addObject(pizza1, 433, 38);
        
        Pizza pizza2 = new Pizza();        
        addObject(pizza2, 183, 302);
        
        Pizza pizza3 = new Pizza();
        addObject(pizza3, 682, 312);
        
        Pizza pizza4 = new Pizza();
        addObject(pizza4, 417, 537);
    }
    
        
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepareScenario();
        
    }
}
