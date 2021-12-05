/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.idle_towerdefense;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author clara
 */
public class TableData {
    private SimpleStringProperty column1;
    private SimpleStringProperty column2; 

   public TableData(String column1, String column2) {
        this.column1 = new SimpleStringProperty(column1);
        this.column2 = new SimpleStringProperty(column2);
    }
    
    public String getColumn1(){
        return column1.get();
    }
    public String getColumn2(){
        return column2.get();
    }
}


