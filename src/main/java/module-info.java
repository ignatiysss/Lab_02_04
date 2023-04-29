module com.example.lab_02_04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab_02_04 to javafx.fxml;
    exports com.example.lab_02_04;
}