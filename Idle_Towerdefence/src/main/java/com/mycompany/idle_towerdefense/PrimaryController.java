package com.mycompany.idle_towerdefense;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class PrimaryController {
public boolean start = false;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
            start = true;
    }

}
