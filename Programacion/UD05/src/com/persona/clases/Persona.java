package com.persona.clases;

public interface Persona {
    //metodos abstractos
    public String getNombre();
    public String getApellido1();
    public String getApellido2();
    public Direccion getDireccion();
    public String getTelefono();
    public EstadoCivil getEstadoCivil();
    public Persona getPareja();
    
    public default String[] getApellidos(){
        String[] apellidos = {getApellido1(),getApellido2()};

        return apellidos;

        //return new String[] {getApellido1(),getApellido2()};
    }
}
