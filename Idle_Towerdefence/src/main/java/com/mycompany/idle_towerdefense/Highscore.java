/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.idle_towerdefense;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class Highscore{
    static Database db = new Database();
    static public ArrayList<Highscore> highscores = new ArrayList();
    String user;
    int score;

    public Highscore(String U,int S) {
        user = U;
        score = S;
    }

    public int getScore() {
        return score;
    }

    public String getUser() {
        return user;
    }
        
    static public void sortHighscores(){
    }
    static public void getHighscores(){
        try {
            highscores = db.getAllHighscores();
        } catch (Exception ex) {
            Logger.getLogger(Highscore.class.getName()).log(Level.SEVERE, null, ex);
        }
        sortHighscores();
    }
    
    public void saveHighscore(){
        try {
            db.saveHighscore(this);
        } catch (Exception ex) {
            Logger.getLogger(Highscore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
