package com.example.actividad2.Model;

public class Bicicleta {

    private String serial;
    private String marca;
    private String tipo;
    private String color;
    private int year;
    private Cliente cliente;

    public Bicicleta(String serial, String marca, String tipo, String color, int year, Cliente cliente) {
        this.serial = serial;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.year = year;
        this.cliente = cliente;
    }

    public String getSerial() {
        return serial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return serial + " - " + marca;
    }
}