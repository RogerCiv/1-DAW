/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

public class Programa {
    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("LIBROS").createEntityManager();
        
      

        boolean repetir = true;
        while(repetir){
  
               System.out.println("""
                           1.- Crear nuevo libro.
                           2.- Consultar libros por autor.
                           3.- Consulta libros grandes.
                           4.- Actualizar libro
                           5.- Salir
                           """);
               int opcion = new Scanner(System.in).nextInt();
               
               switch(opcion){
                   case 1 -> {
                       System.out.println("Introduce el titulo del libro: ");
                       String titulo = new Scanner(System.in).nextLine();
                       System.out.println("Introduce el nombre del autor del libro: ");
                       String autor = new Scanner(System.in).nextLine();
                       System.out.println("Introduce la cantidad de paginas del libro: ");
                       int numPag = new Scanner(System.in).nextInt();
                       
                       Libro libro = new Libro(titulo,autor,numPag);
                       em.getTransaction().begin();
                       em.persist(libro);
                       em.getTransaction().commit();
                   }
                   case 2 -> {
                       System.out.println("Introduce el nombre del autor para buscar sus libros: ");
                       String autor = new Scanner(System.in).nextLine();
                       Query q = em.createQuery("SELECT l FROM Libro l WHERE l.autor = :autor").setParameter("autor", autor);
                       List<Libro> librosAutor = q.getResultList();
                       for(Libro i : librosAutor){
                           System.out.println(i.getTitulo());
                       }
                   }
                   case 3 -> {
                      Query q = em.createQuery("SELECT l FROM Libro l WHERE l.numeroPaginas > 400");
                       List<Libro> librosPaginas = q.getResultList();
                       for(Libro i : librosPaginas){
                           System.out.println(i.getTitulo());
                       }
                   }
                   case 4 -> {
                       System.out.println("Introduce el titulo del libro para actualizar su numero de paginas: ");
                       String titulo = new Scanner(System.in).nextLine();
                       System.out.println("Introduce el numero de paginas del libro a actualizar: ");
                       int numPag = new Scanner(System.in).nextInt();
                       Libro l = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo ")
                               .setParameter("titulo", titulo)
                               .getSingleResult();
                       l.setNumeroPaginas(numPag);
                       
                       em.getTransaction().begin();
                       em.persist(l);
                       em.getTransaction().commit();
                       
                   }
                   case 5 -> repetir = false;
                   
                   default -> System.out.println("Opcion no valida.");
               }
            }
        
        em.close();
        }
     
}
