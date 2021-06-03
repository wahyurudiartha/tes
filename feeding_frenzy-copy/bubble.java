import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bubble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bubble extends Actor
{
    /**
     * Act - do whatever the bubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getY() - 5, getX());  
      if (getY() <= 0)  
      {  
          setLocation(getWorld().getHeight() + 20 , Greenfoot.getRandomNumber(600));  
      }  
    }    
}
