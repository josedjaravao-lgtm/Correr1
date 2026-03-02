package com.example.actividad2.Model;

public class Mecanico extends Persona {

    private String specialty;
    private String internalCode;

    public Mecanico(String id, String name, String gender, Integer age, String phone,
                    String specialty, String internalCode) {
        super(id, name, gender, age, phone);
        this.specialty = specialty;
        this.internalCode = internalCode;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getInternalCode() {
        return internalCode;
    }

    @Override
    public String toString() {
        return name + " - " + specialty;
    }
}