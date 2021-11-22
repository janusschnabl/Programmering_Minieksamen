/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.idle_towerdefense;

/**
 *
 * @author danie
 */
public class Quadtree {
    PVector location;
    PVector bounds;
    float h;
    float b;
    
    Quadtree(PVector l, PVector b){
        location = l;
        bounds = b;
    }
}
