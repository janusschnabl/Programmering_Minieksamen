module com.mycompany.idle_towerdefense {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.mycompany.idle_towerdefense to javafx.fxml;
    exports com.mycompany.idle_towerdefense;
}
