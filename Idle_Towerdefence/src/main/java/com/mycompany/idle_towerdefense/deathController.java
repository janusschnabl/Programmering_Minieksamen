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

/**
 *
 * @author Clara Maj
 */
public class deathController implements Initializable{
    
    @FXML
    TableView table;
    TableColumn name;
    TableColumn points;
    
    public void initialize(URL url, ResourceBundle rb){
        
    }
}
