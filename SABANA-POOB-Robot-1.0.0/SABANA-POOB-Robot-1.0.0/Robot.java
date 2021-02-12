import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void robotMovement()
    {
        int locationX = getX();
        int locationY = getY();
        
        if(Greenfoot.isKeyDown("down")) 
        {
            locationX = getX();
            locationY = getY() + 2;
            setLocation(locationX, locationY);
        }
        
        else if (Greenfoot.isKeyDown("right")) 
        {
            locationX = getX() + 2;
            locationY = getY();
            setLocation(locationX, locationY);
        }
        
        else if (Greenfoot.isKeyDown("up")) 
        {
            locationX = getX();
            locationY = getY() - 2;
            setLocation(locationX, locationY);
        }
        
        else if (Greenfoot.isKeyDown("left")) 
        {
            locationX = getX() - 2;
            locationY = getY();
            setLocation(locationX, locationY);
        }
    }
    
    public void detectWallCollision()
    {
         boolean collisionWall = isTouching(Wall.class);
        
        if (collisionWall)
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.mp3");
        }
    }
    
    public void detectBlockCollision()
    {
        boolean collisionBlock = isTouching(Block.class);
        
        if (collisionBlock)
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.mp3");
        }
    }
    
    public void detectHome()
    {
        boolean collisionHome = isTouching(Home.class);
        
        if (collisionHome)
        {
            setLocation(48,50);
            Greenfoot.playSound("yipee.mp3");
        }
    }
    
    public void eatPizza()
    {
        boolean collisionPizza = isTouching(Pizza.class);
        
        if (collisionPizza)
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.mp3");
        }
    }
    
    public void act() 
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }
}
