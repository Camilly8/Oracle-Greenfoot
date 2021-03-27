import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class policia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Policia extends Actor
{   
    int vidas = 3;
    private int counter = 0;
    /**
     * Act - do whatever the policia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Policia(){
        setRotation(270);
    }

    public void act(){
        mover();
        getWorld().showText("vidas: " + vidas, 40, 450);

    }    

    private void mover(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() -3);
        }

        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() +3);
        }

        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-4, getY());
        }

        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+4, getY());
        }

        if(counter-- < 0) {
            if(Greenfoot.isKeyDown("space")){
                getWorld().addObject(new Bala(), getX(), getY());
                counter=20;
            }
        }
        if(getY() == 0){
            getWorld().showText("You Win", 300, 150);
            Greenfoot.stop();
        }

        if(isTouching(Zumbi.class)){
            vidas = vidas - 1;
            removeTouching(Zumbi.class);
        }   

        if(vidas == 0){
            getWorld().showText("Game over", 300, 150);
            Greenfoot.stop();
        }
    }
} 
