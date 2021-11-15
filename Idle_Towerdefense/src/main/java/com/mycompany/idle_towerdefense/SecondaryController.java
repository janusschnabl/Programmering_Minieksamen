/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.idle_towerdefense;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author janus
 */
public class SecondaryController implements Initializable {
    
    int x;
    int y;

    @FXML
    Canvas canMain;
    GraphicsContext gc;
 
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gc = canMain.getGraphicsContext2D();
        ThreadHolder.INSTANCE.ar.s = this;
        ThreadHolder.INSTANCE.ar._update = true;
    } 
    
    
    @FXML
    public void update(){ 
        gc.clearRect(0, 0, 10000, 10000);
        gc.setFill(Color.WHITE);
        gc.fillOval(ThreadHolder.INSTANCE.ar.b.x,ThreadHolder.INSTANCE.ar.b.y,50,50);
        System.out.println("SUCCES");
    }
    
    
}
