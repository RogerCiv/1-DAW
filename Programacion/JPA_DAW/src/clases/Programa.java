
package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    /*
        Vamos a modificar el nombre de alvaro a "Alvaro Manuel" 
        y ademas vamos a borrar el objeto con id 3.
    */
    public static void main(String[] args) {
        EntityManager em= Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        //Empezamos recuperamos el objeto que necesitamos, con JPQL
        Corredor alvaro = (Corredor) em.createQuery("SELECT c FROM Corredor c WHERE c.nombre = 'Alvaro'").getSingleResult();
        
        //Recupero el corredor con id=3
        Corredor id3 = em.find(Corredor.class, 3);
        
        
        //
        alvaro.setNombre("Alvaro Manuel");
        
        em.getTransaction().begin();      
        em.persist(alvaro); // actualiza el corredor Alvaro
        em.remove(id3);// Borra el corredor con id 3
        
        em.getTransaction().commit();
        
        
        
        em.close();
    }
    
    
    
    
    
    
    
    /*
    Programa que muestra en pantalla el nombre de todos los corredores
    */
    public static void main4(String[] args) {
       EntityManager em= Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
       
       //Vamos a hacer una consulta en lenguaje JPQL que nos recupera todos los objetos de la clase Corredor.
       
       Query q = em.createQuery("SELECT c FROM Corredor c");
       List<Corredor> resultado = q.getResultList();
       
       for(Corredor c : resultado){
           System.out.println(c.getNombre());
       }
       
       em.close();
    }
    
    
    
    
    
    
    /*  haz un programa con este menu de opciones:
    1) Nuevo corredor
    2) Salir
    Si pulsamos 1) nos prgeuntara nombre y fecha de nacimiento y creara el corredor en la BD
    Al pusar 2), se cerrara la unidad de persistencia
    !IMPORTANTE: La unidad de persistencia se crea al principio, antes de que aparezca el menu
    */
    public static void main3(String[] args) {
        EntityManager em= Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
         boolean repetir = true;
         while(repetir){
        System.out.println("""
                           1. Nuevo corredor.
                           2. Salir
                           """);
        int opcion = new Scanner(System.in).nextInt();
        
       
       
            switch(opcion){
            case 1 ->{
                System.out.println("Introduce el nombre del corredor: ");
                String nombre = new Scanner(System.in).nextLine();
                System.out.println("Introduce la fecha de nacimiento (formato año-mes-dia): ");
                String fecha = new Scanner(System.in).nextLine();
                /*
                LocalDate fechaNac = LocalDate.parse(fecha);
                Corredor c = new Corredor(nombre,fechaNac);
                */
                Corredor c = new Corredor(nombre,LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                em.getTransaction().begin();
                em.persist(c);
                em.getTransaction().commit();
            }
            case 2 -> {
                System.out.println("Saliendo...");
                
                repetir = false;
            }
            default -> System.out.println("Opcion no valida");
        }
            em.close();
        }
        
    }
    
    
    
    
    
    
    //vamos a recuperar el corredor que hicimos antes.
    public static void main2(String[] args) {
        EntityManager em= Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        
        Corredor c = em.find(Corredor.class,1);
        System.out.println(c.getNombre());
        System.out.println(c.getFechaNacimiento());
        
        em.close();
        
    }
    
    
    
    // Ejemplo que crea un corredor y lo guarda en la BD.
    public static void main1(String[] args) {
        //Nos conectamos a la unidad de persistencia CARRERA
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        //Creamos un corredor.
        Corredor c = new Corredor("Alvaro",LocalDate.now().minusYears(20));
        
        //Guardamos el corredor en la unidad de persistencia.
        em.getTransaction().begin();//comenzamos a modificar la BD
        em.persist(c);//Hacemos lo que sea en la BD
        em.getTransaction().commit();//Confirmamos lo que hemos hecho
        
        // Nos desconectamos
        em.close();
    }
}
