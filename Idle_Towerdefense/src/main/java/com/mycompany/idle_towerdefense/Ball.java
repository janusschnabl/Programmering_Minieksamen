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
    int x = 50;
    int y = 50;
    
   
    void update(){
        x++;
        System.out.println(x);
    }
    
// public Ball(int _x, int _y) {
  //      x = _x;
    //    y = _y;
    //}

    public int getX() {
        return x;
    }

    public void setX(int _x) {
        this.x =_x;
    }
}

