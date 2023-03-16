
package clasesBD;


public class Alumno {
    private int id;
    private String nombre;
    private String ciudad;
    
    
    public Alumno(int id, String nombre, String ciudad){
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
    @Override
    public String toString(){
        return nombre;
    }
}
