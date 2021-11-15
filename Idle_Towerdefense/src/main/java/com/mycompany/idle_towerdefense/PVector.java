/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.idle_towerdefense;

import java.security.acl.Acl;

/**
 *
 * @author danie
 */
public class PVector {
    float x;
    float y;
    float z;

    public PVector() {
        x=0;
        y=0;
        z=0;
    }
    public PVector(float a,float b){
        x=a;
        y=b;
        z=0;
    }

    public PVector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    PVector add(PVector n){
        PVector r = new PVector();
        r.x = n.x+x;
        r.y = n.y+y;
        r.z = n.z+z;
        return r;
    }
}
