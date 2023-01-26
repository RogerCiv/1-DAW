package CLASE;

public class Persona {
    String nombre;
    private int edad;
    public double altura;
    protected double peso;

    public Persona(String n, int e, double t, double p){
        this.nombre = n;
        this.edad = e;
        this.altura = t;
        this.peso = p;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
}
