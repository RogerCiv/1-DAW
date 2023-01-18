package com.persona.clases;

public class ImplementacionPersona implements Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private Direccion direccion;
    private String telefono;
    private EstadoCivil estadoCivil;
    private Persona pareja;

    public void Persona(String nombre, String apellido1, String apellido2, int edad, String calle, String ciudad,
            String Pais, String telefono, EstadoCivil ec, Persona pareja) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        if (comprobarEdad()) {
            this.edad = edad;
        }

        this.direccion = new Direccion(calle, ciudad, Pais);
        this.telefono = telefono;
        this.estadoCivil = ec;
        this.pareja = pareja;
    }

    private boolean comprobarEdad() {
        if (edad >= 0 && edad < 18) {
            throw new IllegalArgumentException("Edad incorrecta");
        } else {
            return true;
        }
    }

    private boolean comprobarEstadoCivil() {
        return false;
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return this.nombre;
    }

    @Override
    public String getApellido1() {
        // TODO Auto-generated method stub
        return this.apellido1;
    }

    @Override
    public String getApellido2() {
        // TODO Auto-generated method stub
        return this.apellido2;
    }

    @Override
    public Direccion getDireccion() {
        // TODO Auto-generated method stub
        return this.direccion;
    }

    @Override
    public String getTelefono() {
        // TODO Auto-generated method stub
        return this.telefono;
    }

    @Override
    public EstadoCivil getEstadoCivil() {
        // TODO Auto-generated method stub
        return this.estadoCivil;
    }

    @Override
    public Persona getPareja() {
        // TODO Auto-generated method stub
        return this.pareja;
    }

}