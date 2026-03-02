package com.example.actividad2.Controller;

import com.example.actividad2.Model.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class OrdenesFechaController {

    @FXML private DatePicker datePicker;
    @FXML private ListView<OrdenServicio> listaOrdenes;

    @FXML
    private void buscarPorFecha() {
        listaOrdenes.getItems().clear();
        LocalDate fecha = datePicker.getValue();
        for (OrdenServicio o : Taller.ordenes) {
            if (o.getFecha().equals(fecha)) {
                listaOrdenes.getItems().add(o);
            }
        }
    }
}