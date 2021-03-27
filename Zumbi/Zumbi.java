import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zumbi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zumbi extends Actor
{
    /**
     * Act - do whatever the Zumbi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Zumbi(){
        getImage().scale(75, 105);
    
    }
    public void act() 
    {
        setLocation(getX(), getY() + 3);
        
        if(isAtEdge()){
            getWorld().removeObject(this);
     } 
        }
        

        
       
    }        
    
       
    

