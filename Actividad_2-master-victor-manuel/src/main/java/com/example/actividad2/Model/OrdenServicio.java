package com.example.actividad2.Model;

import java.time.LocalDate;

public class OrdenServicio {

    private LocalDate fecha;
    private Bicicleta bicicleta;
    private Mecanico mecanico;
    private String motivo;
    private String diagnostico;
    private double costo;

    public OrdenServicio(LocalDate fecha, Bicicleta bicicleta, Mecanico mecanico,
                         String motivo, String diagnostico, double costo) {
        this.fecha = fecha;
        this.bicicleta = bicicleta;
        this.mecanico = mecanico;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.costo = costo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    @Override
    public String toString() {
        return fecha + " - " + bicicleta.getSerial() + " - $" + costo;
    }
}