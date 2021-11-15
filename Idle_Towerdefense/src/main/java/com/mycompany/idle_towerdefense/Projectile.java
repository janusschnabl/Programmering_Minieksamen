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
public class Projectile {
    PVector position = new PVector();
    PVector velocity = new PVector();
    float size;
    float damage;

    public Projectile(PVector p, PVector v) {
        position = p;
        velocity = v;
        size = 10;
        damage = 10;
    }
    
    void updatePosition(){
        position.add(velocity);
    }
    
}
