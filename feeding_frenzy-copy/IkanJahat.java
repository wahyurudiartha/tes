import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IkanJahat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IkanJahat extends Actor
{
    public int totalPoisonEat = 0;  
    public int totalFishEat = 0;  
    //Score score_field = new Score("Score:" + totalFishEat);  
    public void act()   
    {  
        keyBoardControl();  
        //eat();  
        //checkScore();  
    }    

    /*public void checkScore()  
    {  
        if(totalPoisonEat >= 1)   
        {  
            setImage("fishMainDead.png");   
            loose alert_loose = new loose();  
            getWorld().addObject(alert_loose, 370, 300);     
            Greenfoot.delay(350);  
            Greenfoot.setWorld(new MenuScreen());  
        }  
        if(totalFishEat >= 10)   
        {  
            win alert_win = new win();  
            getWorld().addObject(alert_win, 370, 300);   
            Menus.titleSound.stop();  
            Greenfoot.playSound("fanfare.wav");  
            Greenfoot.stop();  
            Greenfoot.delay(350);  
            Greenfoot.setWorld(new MenuScreen());  
        }  
    }*/  

    public void keyBoardControl()  
    {   
        /*if (Greenfoot.isKeyDown("left") )  
        {  
        setImage("fishMain2left.png");      
        move (-3) ;  
        if (Greenfoot.isKeyDown("down"))  
        turn (-3) ;  
        if (Greenfoot.isKeyDown("up"))  
        turn (3);     
        }     
        if (Greenfoot.isKeyDown("right"))  
        {   
        setImage("fishMain2.png");  
        move (3);  
        if (Greenfoot.isKeyDown("down"))  
        turn (3) ;  
        if (Greenfoot.isKeyDown("up"))  
        turn (-3);  
        } */
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-7);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+7);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setImage("fishMain2left.png");
            setLocation(getX()-7,getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setImage("fishMain2.png");
            setLocation(getX()+7,getY());
        }
    }  

    /*public void eat()  
    {  
        Actor Score;  
        Actor fish;  
        fish = getOneObjectAtOffset(4, 4, fish.class);  
        getWorld().addObject(score_field, 90, 30);  
        if (fish != null)  
        {  
            World Sea;  
            Sea = getWorld() ;  
            Sea.removeObject(fish);  
            Greenfoot.playSound("eating.wav");  
            totalFishEat++;  
            score_field.setText("Score: " +totalFishEat);  
            hitafish();  
        }  
        Actor fish1;  
        fish1 = getOneObjectAtOffset(4, 4, fish1.class);  
        if (fish1 != null)  
        {  
            World world;  
            world = getWorld() ;  
            world.removeObject(fish1);  
            Greenfoot.playSound("eating.wav");  
            totalFishEat++;  
            score_field.setText("Score: " +totalFishEat);  
            hitafish();  
        }  
        /*Actor fish3;  
        fish3 = getOneObjectAtOffset(4, 4, fish3.class);  
        if (fish3 != null)  
        {  
            World world;  
            world = getWorld() ;  
            world.removeObject(fish3);  
            Menus.titleSound.stop();  
            Greenfoot.playSound("loose.mp3");  
            totalPoisonEat++;  
            hitafish(); 
        }
    }*/

    private void hitafish()  
    {  
        Levels SeaWorld = (Levels) getWorld();  
    }  
}
