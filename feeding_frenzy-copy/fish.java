import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fish extends Actor
{
    /**
     * Act - do whatever the fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //setLocation(getX()+2,getY()); 
        //if(isAtEdge())
          //  setLocation(Greenfoot.getRandomNumber(getWorld().getHeight()),0);
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
            //removeTouching(IkanJahat.class);
            //getWorld().addObject(new ledakan(),getX(),getY());
            Greenfoot.playSound("eating.wav"); 
            Level1.score.add(10);
            getWorld().addObject(new fish(),Greenfoot.getRandomNumber(getWorld().getWidth()),0);
            getWorld().removeObject(this);
        }
        /*else if(isTouching(IkanJahat.class))
        {
            //removeTouching(IkanJahat.class);
            //getWorld().addObject(new ledakan(),getX(),getY());
            Greenfoot.playSound("eating.wav"); 
            Level1.score.add(10);
            getWorld().addObject(new fish(),Greenfoot.getRandomNumber(getWorld().getWidth()),0);
            getWorld().removeObject(this);
        }*/
    }    

}
