package CLASE.Feb16;

public abstract class Funcion {
    
    private String nombre;


    public Funcion(String n){
        this.nombre = n;
    }


    public String getNombre() {
        return this.nombre;
    }

    public abstract double calcularY(double x);
    
}
