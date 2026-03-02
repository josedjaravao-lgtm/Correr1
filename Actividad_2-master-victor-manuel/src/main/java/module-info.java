module com.example.actividad2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.example.actividad2.Controller to javafx.fxml;

    opens com.example.actividad2 to javafx.fxml;

    exports com.example.actividad2;
}