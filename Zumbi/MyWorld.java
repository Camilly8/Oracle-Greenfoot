import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a d0ate)
 */
public class MyWorld extends World
{
    int contador = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        Policia policia = new Policia();
        addObject(policia, 300, 750);
        prepare();
    }

    public void act(){
        gerar();
    }

    private void gerar(){
        Zumbi zumbi = new Zumbi();
        contador ++;
        if(contador == 60){
            addObject(zumbi, Greenfoot.getRandomNumber(560) + 20, 10);
            contador = 0;
        }

    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
    


  
