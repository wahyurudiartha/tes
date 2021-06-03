import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends Menus
{

    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    public MenuScreen()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartBtn startBtn = new StartBtn();
        addObject(startBtn,102,172);
        startBtn.setLocation(708,306);
        HelpBtn helpBtn = new HelpBtn();
        addObject(helpBtn,126,221);
        StoryBtn storyBtn = new StoryBtn();
        addObject(storyBtn,78,327);
    }
}
