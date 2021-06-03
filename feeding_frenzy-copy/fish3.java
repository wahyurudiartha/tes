import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fish3 extends Actor
{
    /**
     * Act - do whatever the fish3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move (5) ;  
        if (Greenfoot.getRandomNumber (20) < 10)  
        {  
            turn (Greenfoot.getRandomNumber (50) - 20) ;  
        }   
        if (getX () <= 5 || getX() >= getWorld().getWidth () - 5)  
        {  
            turn (180) ;  
        }  
        if (getY () <= 5 || getY() >= getWorld().getHeight () - 5)  
        {  
            turn (180) ;  
        }  
        if(isTouching(IkanJahat.class))
        {
            Level1.hp.add(-1);
            getWorld().addObject(new fish3(), Greenfoot.getRandomNumber(getWorld().getWidth()),0);
            if(Level1.hp.getValue()==0)
            {
                getWorld().addObject(new loose(),getWorld().getWidth()/2,getWorld().getHeight()/2);
                Greenfoot.playSound("eating.wav");
                removeTouching(IkanJahat.class);
                Greenfoot.delay(350);  
                Greenfoot.setWorld(new MenuScreen());
            }
            getWorld().removeObject(this);
        }
    }    
}
