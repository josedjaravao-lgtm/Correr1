package com.example.actividad2.Controller;

import com.example.actividad2.Model.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class OrdenServicioController {

    @FXML private ComboBox<Bicicleta> cbBicicleta;
    @FXML private ComboBox<Mecanico> cbMecanico;
    @FXML private TextField txtMotivo, txtDiagnostico, txtCosto;

    @FXML
    public void initialize() {
        cbBicicleta.getItems().addAll(Taller.bicicletas);
        cbMecanico.getItems().addAll(Taller.mecanicos);
    }

    @FXML
    private void crearOrden() {
        OrdenServicio o = new OrdenServicio(
                LocalDate.now(),
                cbBicicleta.getValue(),
                cbMecanico.getValue(),
                txtMotivo.getText(),
                txtDiagnostico.getText(),
                Double.parseDouble(txtCosto.getText())
        );
        Taller.ordenes.add(o);
        alerta("Orden creada");
    }

    private void alerta(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).show();
    }
}