module com.example.ui_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ui_demo to javafx.fxml;
    exports com.example.ui_demo;
}