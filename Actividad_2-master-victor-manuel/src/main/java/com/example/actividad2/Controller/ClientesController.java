package com.example.actividad2.Controller;

import com.example.actividad2.Model.Cliente;
import com.example.actividad2.Model.Taller;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ClientesController {

    @FXML private TextField txtId;
    @FXML private TextField txtNombre;
    @FXML private TextField txtTelefono;
    @FXML private TextField txtDireccion;

    @FXML
    private void registrarCliente() {
        Cliente c = new Cliente(
                txtId.getText(),
                txtNombre.getText(),
                "N/A",
                0,
                txtTelefono.getText(),
                txtDireccion.getText()
        );
        Taller.clientes.add(c);
        alerta("Cliente registrado correctamente");
    }

    private void alerta(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).show();
    }
}