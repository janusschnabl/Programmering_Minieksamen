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
    public ArrayList<Highscore> sort(ArrayList<Highscore> prev){
        ArrayList<Highscore> next = new ArrayList();
        next.add(prev.get(0));
        for(int i = 0; i<prev.size();i++){
            int m = 0;
            while(prev.get(i).score > next.get(m).score && m<next.size()-1){
                m++;
            }
            next.add(m+1,prev.get(i));
        }
        return next;
    }
}
