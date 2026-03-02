package com.example.actividad2.Controller;

import com.example.actividad2.Model.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HistorialController {

    @FXML private TextField txtSerial;
    @FXML private ListView<OrdenServicio> listaOrdenes;

    @FXML
    private void buscarHistorial() {
        listaOrdenes.getItems().clear();
        for (OrdenServicio o : Taller.ordenes) {
            if (o.getBicicleta().getSerial().equals(txtSerial.getText())) {
                listaOrdenes.getItems().add(o);
            }
        }
    }
}