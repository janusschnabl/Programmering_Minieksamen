/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.idle_towerdefense;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Clara Maj
 */
public class deathController implements Initializable{
    
    static int currentScore=0;
    
    @FXML
    ObservableList<Highscore> allHighscore = FXCollections.observableArrayList();
   
    @FXML
    TableView table;
    @FXML
    TableColumn name;
    @FXML 
    TableColumn points;
    @FXML
    TextField User;
    @FXML
    Label EndScore;
    
    
    public void initialize(URL url, ResourceBundle rb){
        Database db = new Database();
        Sorting sorter = new Sorting();
        try {
            allHighscore.addAll(/*sorter.sort(*/db.getAllHighscores())/*)*/;
        } catch (Exception ex) {
            Logger.getLogger(deathController.class.getName()).log(Level.SEVERE, null, ex);
        }
        //points.setText("hello");
        
        name.setCellValueFactory(new PropertyValueFactory<Highscore, String>("user"));
        points.setCellValueFactory(new PropertyValueFactory<Highscore, Integer>("score"));
        
        table.setItems(allHighscore);
        
        EndScore.setText(String.valueOf(currentScore));
                
     }
    
    public void fill(){
        table.getItems().clear();
        Highscore.getHighscores();
        for (int i = 0; i < Highscore.highscores.size(); i++) {
            table.getItems().add(Highscore.highscores.get(i).user);
            table.getItems().add(Highscore.highscores.get(i).score);
        }
    }
    
    @FXML
    public void addName() throws Exception{
        Database db = new Database();
        Sorting sorter = new Sorting();
        ArrayList<Highscore> now = new ArrayList();
        Highscore.highscores.add(new Highscore(User.getText(),currentScore));
        db.saveHighscore(Highscore.highscores.get(Highscore.highscores.size()-1));
        currentScore=0;
        
        table.getItems().clear();
        now.addAll(db.getAllHighscores());
        allHighscore.addAll(sorter.sort(now));
        table.setItems(allHighscore);
    }
    
    @FXML
    public void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
