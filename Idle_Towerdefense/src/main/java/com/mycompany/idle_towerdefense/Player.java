/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.idle_towerdefense;

import java.util.Vector;

/**
 *
 * @author danie
 */
public class Player {
    Vector<Float> position;
    float size;
    float HP;
    
    Player(Vector<Float> p,float s, float hp){
        position = p;
        size = s;
        HP = hp;
    }
    
    void shoot(){
        
    }
}
