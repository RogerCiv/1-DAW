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

    public  ImplementacionPersona(String nombre, String apellido1, String apellido2, int edad, String calle, String ciudad,
            String Pais, String telefono, EstadoCivil ec, Persona pareja) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        if (!comprobarEdad()) {
            throw new IllegalArgumentException("Edad incorrecta");
        }else {
            this.edad = edad;
        }
        this.direccion = new Direccion(calle, ciudad, Pais);
        this.telefono = telefono;
        if(!comprobarEstadoCivil()){
            throw new IllegalArgumentException("Estado civil incorrecto");
        }else{
            this.estadoCivil = ec;
        }
        
        this.pareja = pareja;
    }

    private boolean comprobarEdad() {
        
        return edad >= 0 ;
    }

    private boolean comprobarEstadoCivil() {
        /*
        return pareja.getPareja() != null && pareja.getEstadoCivil().equals(EstadoCivil.SOLTERO) || 
        pareja.getPareja() == null && pareja.getEstadoCivil().equals(EstadoCivil.CASADO) ;
      */
        return getPareja()!= null && getEstadoCivil().equals(EstadoCivil.CASADO) || 
        getPareja() == null && getEstadoCivil().equals(EstadoCivil.SOLTERO);
    

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
