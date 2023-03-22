

package clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable{
    @Id @GeneratedValue
    private int id;
    private String titulo;
    
    private List<Autor> autores;
    
    private Genero genero;
    private int numeroPaginas;
    
    public Libro(){
        
    }
    
    public Libro(String t, int np){
        titulo = t;
        numeroPaginas = np;
        autores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    
}
