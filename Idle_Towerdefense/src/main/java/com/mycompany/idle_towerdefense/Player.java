/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.idle_towerdefense;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author danie
 */

public class Player {
    ArrayList<Projectile> projectiles = new ArrayList();
    PVector position= new PVector();
    float size;
    float HP;
    
    Player(PVector p,float s, float hp){
        position = p;
        size = s;
        HP = hp;
    }
    
    void shoot(){
        
    }
    
    void hitDetection(){
        for(int i = 0; i<Enemy.enemies.size(); i++){
            if(position.dist(Enemy.enemies.get(i).position))
        }
    }
}
