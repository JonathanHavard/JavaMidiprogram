/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- a moving particle. 
 * 
 */
package com.particle_engine_with_sound;

//import javafx.css.Size;
import processing.core.*;

public class Ball2 extends Particle{
Ball2(float x_, float y_, float radius_, PApplet main_, int c){
    super(x_,y_,radius_, c, main_);    
}

public void draw(){
    //draws an ellipse
    main.fill(255,0,0);
    main.ellipse(x, y, size, size);
    main.line(x-(size/2), y, x+(size/2), y);
    move();
    }
}