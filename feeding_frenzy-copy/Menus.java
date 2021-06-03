import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menus extends World
{
    //public static GreenfootSound titleSound;
    public static GreenfootSound title = new GreenfootSound("title-theme.mp3");
    /**
     * Constructor for objects of class Menus.
     * 
     */
    public Menus()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        title.playLoop();
     /*if (this.getClass().getName().equalsIgnoreCase("MenuScreen"))  
     {   
       //titleSound = new GreenfootSound("title-theme.mp3");  
       //titleSound.stop();  
       //titleSound.setVolume(70);  
       //titleSound.playLoop();  
     }  
     else  
     {  
       addObject(new BackBtn(), 100, 400);  
     }*/ 
    }
}
