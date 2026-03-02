package com.example.actividad2.Controller;

import com.example.actividad2.Model.Mecanico;
import com.example.actividad2.Model.Taller;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MecanicosController {

    @FXML private TextField txtId;
    @FXML private TextField txtNombre;
    @FXML private TextField txtEspecialidad;
    @FXML private TextField txtCodigo;

    @FXML
    private void registrarMecanico() {
        Mecanico m = new Mecanico(
                txtId.getText(),
                txtNombre.getText(),
                "N/A",
                0,
                "N/A",
                txtEspecialidad.getText(),
                txtCodigo.getText()
        );
        Taller.mecanicos.add(m);
        alerta("Mecánico registrado");
    }

    private void alerta(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).show();
    }
}