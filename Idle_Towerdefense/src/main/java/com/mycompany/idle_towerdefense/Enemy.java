/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.idle_towerdefense;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Enemy {
    static ArrayList<Enemy> enemies = new ArrayList();
    PVector position = new PVector();
    PVector velocity = new PVector();
    float size;
    float damage;

    public Enemy(PVector p, PVector v) {
        position = p;
        velocity = v;
        size = 10;
        damage = 10;
    }
    
    void updatePosition(){
        position.add(velocity);
    }
}
