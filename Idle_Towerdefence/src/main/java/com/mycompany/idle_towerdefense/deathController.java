/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.idle_towerdefense;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Clara Maj
 */
public class deathController implements Initializable{
    
    static int currentScore;
    
    @FXML
    TableView table;
    TableColumn name;
    TableColumn points;
    TextField User;
    
    
    public void initialize(URL url, ResourceBundle rb){
        ObservableList<TableData> allData = FXCollections.observableArrayList(
            new TableData("1", "test 1"),
            new TableData("2", "test 2")
        );
        
        points.setText("hello");
        
        name.setCellValueFactory(new PropertyValueFactory<TableData, String>("column 1"));
        points.setCellValueFactory(new PropertyValueFactory<TableData, String>("column 2"));
        
        table.setItems(allData);
        
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
    public void addName(){
        Highscore.highscores.add(new Highscore(User.getText(),currentScore));
        currentScore=0;
        
    }
    
    @FXML
    public void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
