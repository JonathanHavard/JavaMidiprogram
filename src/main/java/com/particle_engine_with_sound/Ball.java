/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- a moving particle. 
 * 
 */
package com.particle_engine_with_sound;

//import javafx.css.Size;
import processing.core.*;

public class Ball extends Particle{
Ball(float x_, float y_, float radius_, int c, PApplet main_){
    super(x_,y_,radius_, c, main_);    
}

public void draw(){
    //draws an ellipse
    main.fill(0,255,20);
    main.ellipse(x, y, size/2, size/2);
    move();
    }
}