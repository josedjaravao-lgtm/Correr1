package com.example.actividad2;

import com.example.actividad2.View.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(
                getClass().getResource("View/clientes.fxml")
        );
        stage.setScene(new Scene(root));
        stage.setTitle("Sistema Taller de Bicicletas");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}