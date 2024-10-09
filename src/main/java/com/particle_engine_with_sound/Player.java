/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- a moving particle. 
 * 
 */
package com.particle_engine_with_sound;


import processing.core.*;
    public class Player extends Particle{
        Player(float x_, float y_, float radius_, int c, PApplet main_){
            super(x_,y_,radius_, c, main_);    
        }
        
        public void draw(){
            //draws an ellipse
            main.fill(particleColor);
            main.square(x, y, size);
            move();  
        }


        public void keyPressed(){
            //adds directional inputs to the particles
            
            if (main.key =='w'){
                        y_direction=-1;
                        yVel = 10;
                        x_direction =0;
            }
            if (main.key =='s'){
                        y_direction=1;
                        yVel = 10;
                        x_direction =0;
                    }
            if (main.key =='a'){
                        x_direction=-1;
                        xVel = 10;
                        y_direction = 0;
                    }
            if (main.key =='d'){
                        x_direction=1;
                        xVel = 10;
                        y_direction = 0;
                    }
        
            }
        
        //     radius =30;
        // damageTaken(){
        //     radius -=5;
        //     Player.Draw();
        // }
        // pointGained(){
        //     radius +=5;
        //     Player.Draw();
        // }
        // if (radius==0){
        //     gameOver()
        // }
        // if (radius ==100){
        //     gameOver()
        // }

}

