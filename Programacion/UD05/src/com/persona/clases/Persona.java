package com.persona.clases;

public interface Persona {
    
    public String getNombre();
    public String getApellido1();
    public String getApellido2();

    public default String[] getApellidos(){
        String[] apellidos = {getApellido1(),getApellido2()};

        return apellidos;
    }
    public Direccion getDireccion();
    public String getTelefono();
    public EstadoCivil getEstadoCivil();
    public Persona getPareja();
}
