module com.example.initialsummative {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.initialsummative to javafx.fxml;
    exports com.example.initialsummative;
}