/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- a moving particle. 
 * 
 */
package com.particle_engine_with_sound;

import processing.core.*;

public class Particle {
    PApplet main; //the main class -- provides all the functionality of processing

    float x; //location of particle
    float y; //location of particle
    float xVel = 10; //X velocity
    float yVel = 10; //Y velocity
    float y_direction = 1; //indicates the direction of the particle in the y direction (1 is up, -1 is down) 
    float x_direction = 1; //indicates the direction of the particle in the X direction (1 is right, -1 is left)
    float size; //particle size
    static int particleColor;
    float maxVel;
    float minVel;
    Particle(float x_, float y_, float size_, int c, PApplet main_){
        x = x_;
        y = y_;
        size = size_;
        particleColor = c;
    
        main = main_;
    
        maxVel = 50;
        minVel = 1;
        xVel = main.random(20);
        x_direction= main.random(-1,1);
        y_direction= main.random(-1,1);
        yVel = main.random(5);
        x = main.random(0,1000);
        y = main.random(0,1000);
        size = 50;
    }

    void move(){
        // particle movement
        y += yVel*y_direction;
        x += xVel*x_direction;
        if(y>main.height || y<0){
            y_direction *= -1;
           
        }
        if(x>main.width || x<0){
            x_direction *= -1;

        }
    }
    void moveP(){
        if(y>main.height || y<0){
            y_direction *= -1;
           
        }
        if(x>main.width || x<0){
            x_direction *= -1;

        }
    }
  
    void faster(){
        //increases particle speed
        if (yVel<maxVel){
            //adds a speed cap
    yVel*=1.1;
        }
        if (xVel<maxVel){
            //adds a speed cap
    xVel*=1.1;
    }
        
}
void slower(){
        //decreases particle speed
    if (yVel>minVel){
    yVel*=0.9;
    }
    if (xVel>minVel){
    xVel*=0.9;
    }
}
void lVel(){
    if (x_direction == 1){
    xVel--;
    }
}
void rVel(){
    if (x_direction == 1){
    xVel++;
    }
}
void dVel(){
    yVel++;
}
void uVel(){
    yVel--;
}

    public void draw() {
        
    }
    public void Reverse(){
        y_direction*=-1;
        x_direction*=-1;
    }
    void keyPressed(){}

}
