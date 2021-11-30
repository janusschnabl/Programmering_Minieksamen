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
public class Sorting {
    public static ArrayList sort(ArrayList<Highscore> prev){
        prev = new ArrayList();
        ArrayList<Highscore> next = new ArrayList();
        next.add(prev.get(0));
        for(int i = 1; i<prev.size();i++){
            int m = 0;
            while(prev.get(i).score > next.get(m).score && m<next.size()){
                m++;
            }
            next.add(m,prev.get(i));
        }
        return next;
    }
}
