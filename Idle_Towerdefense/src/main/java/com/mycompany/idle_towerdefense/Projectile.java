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
    Vector<Double> position;// = new Vector<float>();
    Vector<Double> velocity;
    float size;
    float damage;

    public Projectile(Vector<Double> p, Vector<Double> v) {
        position = p;
        velocity = v;
        size = 10;
        damage = 10;
        //abc
    }
    
    
}
