
package clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
Ejercicio para Martes 21:
Clase Libro
- String titulo
- String autor
- int numeroPaginas
+Libro() // Obligatorio para JPA
+ Libro(String t, String a, int np)
+ getters y setters para todo

Hacer un programa que tenga estas opciones:
1.-Crear nuevo libro ---- Te prgeunta todo, y graba un libro en la unidad de persistencia
2.- Consultar libros por autor -- te pregunta el nombre de un autor y te muestra todos sus libros
3.- Consulta libros grandes --- muestra el titulo de todos los libros que tienen mas de 400 paginas
4.- Actualizar libro -> te pregunta el titilo del libro y te permite actualizar su numero de paginas.
5.- Salir.
*/
@Entity
public class Libro implements Serializable{
    
    @Id @GeneratedValue
    private int id;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    //COnstructor vacio para que funciones JPA
    public Libro(){
        
    }
    
    public Libro(String t, String a, int np){
        titulo = t;
        autor = a;
        numeroPaginas = np;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getId() {
        return id;
    }
    

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
