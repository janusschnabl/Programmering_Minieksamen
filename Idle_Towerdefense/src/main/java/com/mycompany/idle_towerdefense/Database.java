/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.idle_towerdefense;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author danie
 */
public class Database {
    private final String connectionString = "jdbc:sqlite:src/Database.db";
   
   public ArrayList<Highscore> getAllHighscores() throws SQLException, Exception {
        
        ArrayList<Highscore> allHighscores = new ArrayList<>();
        
        Connection conn = null;
        Class.forName("org.sqlite.JDBC");
        
        //Skab forbindelse til databasen...
        
        try {          
          conn = DriverManager.getConnection(connectionString);
        } 
        catch ( SQLException e ) {
          //Skrive fejlhåndtering her
          System.out.println("DB Error: " + e.getMessage());
        }
        
        //Hent alle personer fra databasen v.h.a. SQL
        try{ 
            Statement stat = conn.createStatement();   

            //Læser fra database alt data fra databasetabellen people.   
            ResultSet rs = stat.executeQuery("User, Score");

            //Løber data igennem via en løkke og skriver det up.    
            while (rs.next()) {
                allHighscores.add(new Highscore(rs.getString("User"), rs.getInt("Score")));
            }
            rs.close();
        }
        catch ( SQLException e ) {
            //Skrive fejlhåndtering her
            System.out.println("DB Error: " + e.getMessage());
        }
        //Luk forbindelsen til databasen
        conn.close();
    
        return allHighscores;
    }
   public void saveHighscore(Highscore x) throws SQLException, Exception 
    {
        Connection conn = null;
        Class.forName("org.sqlite.JDBC");
        
        //Skab forbindelse til databasen...
        try {          
          conn = DriverManager.getConnection(connectionString);
        } 
        catch ( SQLException e ) {
          //Skrive fejlhåndtering her
        }
        
        String sql = "INSERT INTO Highscore(User, Score) VALUES('" + x.user + "', '" + x.score + "')";
 
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //pstmt.setString(1, name);
            //pstmt.setDouble(2, capacity);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }        
    }
}
