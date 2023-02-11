package Ejercicio6y7;

public class Trabajador {

    //Un Trabajador es un empleado que tiene un nombre, sueldo,
    // dni (no es necesario comprobar que la letra es correcta) y métodos getter
    private String dni;
    private String nombre;
    protected int sueldo;

    public Trabajador(String nombre, int sueldo, int numDNI, char letraDNI){
        this.dni = " "+numDNI+letraDNI;
       // this.dni = String.valueOf(numDNI)+String.valueOf(letraDNI);
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }
    
}
