import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fish1 extends Actor
{
    /**
     * Act - do whatever the fish1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move (3) ;  
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
            Greenfoot.playSound("eating.wav"); 
            Level1.score.add(10);
            getWorld().addObject(new fish(),Greenfoot.getRandomNumber(getWorld().getWidth()),0);
            getWorld().removeObject(this);
        }
    }    
}
