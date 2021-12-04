/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.idle_towerdefense;

import java.net.URL;
import java.util.ResourceBundle;
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
    
    @FXML
    TableView table;
    TableColumn<Highscore> name;
    TableColumn points;
    TextField User;
    
    
    public void initialize(URL url, ResourceBundle rb){
        Highscore.getHighscores();
        name  = new TableColumn<>("name");
        name.setCellFactory(new PropertyValueFactory<>("user"));
        table.getColumns().add(name);
        table.getColumns().add(points);
        for (int i = 0; i < Highscore.highscores.size(); i++) {
            table.getItems().add(Highscore.highscores.get(i).user);//,Highscore.highscores.get(i).score);
        }
    }
}
