package com.example.actividad2.Model;

public class Cliente extends Persona {

    private String address;

    public Cliente(String id, String name, String gender, Integer age, String phone, String address) {
        super(id, name, gender, age, phone);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " - ID: " + Id;
    }
}