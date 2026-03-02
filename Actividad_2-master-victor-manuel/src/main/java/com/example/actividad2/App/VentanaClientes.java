package com.example.actividad2.View;

import com.example.actividad2.Model.Cliente;
import com.example.actividad2.Model.Taller;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VentanaClientes extends Stage {

    public VentanaClientes() {

        TextField txtId = new TextField();
        txtId.setPromptText("ID");

        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Nombre");

        TextField txtTelefono = new TextField();
        txtTelefono.setPromptText("Teléfono");

        TextField txtDireccion = new TextField();
        txtDireccion.setPromptText("Dirección");

        Button btnGuardar = new Button("Guardar");

        btnGuardar.setOnAction(e -> {
            Cliente c = new Cliente(
                    txtId.getText(),
                    txtNombre.getText(),
                    "N/A",
                    0,
                    txtTelefono.getText(),
                    txtDireccion.getText()
            );
            Taller.clientes.add(c);
            alerta("Cliente registrado");
        });

        VBox root = new VBox(10, txtId, txtNombre, txtTelefono, txtDireccion, btnGuardar);
        setScene(new Scene(root, 300, 250));
        setTitle("Clientes");
    }

    private void alerta(String msg) {
        Alert a = new Alert(Alert.AlertType.INFORMATION, msg);
        a.show();
    }
}