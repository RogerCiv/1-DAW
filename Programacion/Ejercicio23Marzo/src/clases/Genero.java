
package clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Genero  implements Serializable{
    @Id @GeneratedValue
    private int id;
    private String nombre;
    private List<Libro> libros;
    
    
    public Genero(){
        
    }
    public Genero(String nombre){
        this.nombre = nombre;
        libros = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    
}
