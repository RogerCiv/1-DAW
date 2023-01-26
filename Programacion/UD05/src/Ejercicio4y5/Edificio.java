package Ejercicio4y5;

public class Edificio {
    private String direccion;
    private int numeroPlantas;


    public Edificio(String d, int np){
        this.direccion = d;
        this.numeroPlantas = np;
    }


    public String getDireccion() {
        return direccion;
    }


    public int getNumeroPlantas() {
        return numeroPlantas;
    }
    
}
