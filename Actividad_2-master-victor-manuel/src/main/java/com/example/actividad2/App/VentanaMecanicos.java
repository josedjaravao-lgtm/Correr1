package com.example.actividad2.View;

import com.example.actividad2.Model.Mecanico;
import com.example.actividad2.Model.Taller;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VentanaMecanicos extends Stage {

    public VentanaMecanicos() {

        TextField txtId = new TextField("ID");
        TextField txtNombre = new TextField("Nombre");
        TextField txtEspecialidad = new TextField("Especialidad");
        TextField txtCodigo = new TextField("Código");

        Button btnGuardar = new Button("Guardar");

        btnGuardar.setOnAction(e -> {
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
        });

        VBox root = new VBox(10, txtId, txtNombre, txtEspecialidad, txtCodigo, btnGuardar);
        setScene(new Scene(root, 300, 250));
        setTitle("Mecánicos");
    }

    private void alerta(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).show();
    }
}