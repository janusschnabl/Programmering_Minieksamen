/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.idle_towerdefense;

/**
 *
 * @author janus
 */
public class Ball {

    x = 50;
    y = 50;
    PVector position = new PVector(50,50);

    //PVector pos = new PVector(x,y);
     
    void update(){
        position.x++;
        System.out.println(position.x);
    }
    
// public Ball(int _x, int _y) {
  //      x = _x;
    //    y = _y;
    //}

    public int getX() {
        return (int) position.x;
    }

   /* public void setX(int _x) {
        this.x =_x;
    }*/
    public void setX(int _x) {
        this.position.x =_x;
    }
}

