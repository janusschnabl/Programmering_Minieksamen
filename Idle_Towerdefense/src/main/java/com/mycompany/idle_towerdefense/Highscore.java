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
public class Highscore {
    ArrayList<Highscore> highscores = new ArrayList<>();
    Database db = new Database();
    String user;
    int score;

    public Highscore(String U,int S) {
        user = U;
        score = S;
    }
    
}
