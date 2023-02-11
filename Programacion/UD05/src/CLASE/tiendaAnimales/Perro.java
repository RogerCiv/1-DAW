package CLASE.tiendaAnimales;

public class Perro {
    private String nombre;
    private int precio;
    private String raza;

    // precio >=0 y si no, IllegalArgumentException
    public Perro(String n, int p, String r){
        if(p<0){
            throw new IllegalArgumentException("Precio negativo");
        }
        this.nombre = n;
        this.precio = p;
        this.raza = r;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public String getRaza() {
        return this.raza;
    }
}
