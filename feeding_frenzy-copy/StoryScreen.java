import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoryScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoryScreen extends Menus
{

    /**
     * Constructor for objects of class StoryScreen.
     * 
     */
    public StoryScreen()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BackBtn backBtn = new BackBtn();
        addObject(backBtn,403,399);
    }
}
