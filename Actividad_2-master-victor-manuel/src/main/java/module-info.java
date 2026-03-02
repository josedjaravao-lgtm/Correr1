module com.example.actividad2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.actividad2 to javafx.fxml;
    exports com.example.actividad2;
    exports com.example.actividad2.Controller;
    opens com.example.actividad2.Controller to javafx.fxml;
    exports com.example.actividad2.App;
    opens com.example.actividad2.App to javafx.fxml;
}