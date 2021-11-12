package com.mycompany.idle_towerdefense;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {
public boolean start = false;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
        start = true;
    }
}
