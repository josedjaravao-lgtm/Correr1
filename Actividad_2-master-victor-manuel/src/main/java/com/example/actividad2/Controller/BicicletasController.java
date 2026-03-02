package com.example.actividad2.Controller;

import com.example.actividad2.Model.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class BicicletasController {

    @FXML private TextField txtSerial, txtMarca, txtTipo, txtColor, txtYear;
    @FXML private ComboBox<Cliente> cbClientes;

    @FXML
    public void initialize() {
        cbClientes.getItems().addAll(Taller.clientes);
    }

    @FXML
    private void registrarBicicleta() {
        Bicicleta b = new Bicicleta(
                txtSerial.getText(),
                txtMarca.getText(),
                txtTipo.getText(),
                txtColor.getText(),
                Integer.parseInt(txtYear.getText()),
                cbClientes.getValue()
        );
        Taller.bicicletas.add(b);
        alerta("Bicicleta registrada");
    }

    private void alerta(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).show();
    }
}