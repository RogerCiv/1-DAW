
package clases;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
/*
Ejercicio para Jueves 23:
Clase Libro:
- int id;
- String titulo
- List<Autor> autores;
- Genero genero
- int numeroPaginas

public Libro()
public Libro(String  nombre)
getters y setters

Clase Autor:
- int id
- String nombre;
-List<Libro> libros;
public Libro()
public Libro(String nombre)
getters y setters

Class Genero:
- int id;
- String nombre;
- List<Libro> libros

public Genero()
public Genero(string nombre)
getters y setters


*/
public class Programa {
    public static void main(String[] args) {
        // este main llama al que quieras para que se ejecute
        main10(args);
    }
    
    public static void main10(String[] args) {
        //Crea dos carreras y apunta 3 corredores a esas carreras
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        Carrera ca = new Carrera("Carrera IESHLANZ", LocalDate.now());
        Carrera ca2 = new Carrera("Carrera Granada",LocalDate.now());
        
        Corredor c1 = new Corredor("Antonio",LocalDate.now().minusYears(20));
        Corredor c2 = new Corredor("Ana",LocalDate.now().minusYears(25));
        Corredor c3 = new Corredor("Bolt",LocalDate.now().minusYears(40));
        
        ca.getCorredores().addAll(List.of(c1,c2,c3));
        ca2.getCorredores().addAll(List.of(c1,c2));
        c1.getCarrera().addAll(List.of(ca,ca2));
        
        c2.getCarrera().addAll(List.of(ca,ca2));
        c3.getCarrera().add(ca);
        
        em.getTransaction().begin();
        em.persist(ca);
        em.persist(ca2);
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.getTransaction().commit();
        
        
        em.close();
    }
    
    public static void main9(String[] args) {
        //Creamos un Equipo con 3 corredores
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        Equipo e = new Equipo("Granada CF");
        
        Corredor c1 = new Corredor("Benitez", LocalDate.now().minusYears(30));
        Corredor c2 = new Corredor("Puertas",LocalDate.now().minusYears(25));
        Corredor c3 = new Corredor("Patrick",LocalDate.now());
        
        e.getCorredores().add(c1);
        e.getCorredores().add(c3);
        e.getCorredores().add(c2);
        c1.setEquipo(e);
        c2.setEquipo(e);
        c3.setEquipo(e);
        
        em.getTransaction().begin();
        em.persist(e);
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.getTransaction().commit();
        
        
        em.close();
        
    }
    
    public static void main8(String[] args) {
        //Creamos un corredor profesional con un carnet
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        CorredorProfesional c = new CorredorProfesional("Maria",
                                LocalDate.now().minusYears(25),
                                4,
                                "HLANZ");

        Carnet ca = new Carnet(LocalDate.now());
        
       c.setCarnet(ca);
       ca.setCorredor(c);
        em.getTransaction().begin();
        em.persist(c);
        em.persist(ca);
        em.getTransaction().commit();
        em.close();
    }
    
    // creamos un corredor de cada tipo
    public static void main7(String[] args) {
        // main(args);
         EntityManager em= Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
         
         Corredor c1 = new Corredor("Manuel",LocalDate.of(2000, Month.MARCH, 12));
         CorredorAmateur c2 = new CorredorAmateur("Luis",LocalDate.of(2005,06,04),29,8);
         CorredorProfesional c3 = new CorredorProfesional("Ismale",LocalDate.of(1998,3,3),1,"IES HLANZ");
         
         em.getTransaction().begin();
         em.persist(c1);
         em.persist(c2);
         em.persist(c3);
         em.getTransaction().commit();
         
         
         em.close();
    }
    
    /*
        Vamos a consultar los corredores con el nombre que el usuario inrtoduzca por teclado,
        usando TypedQuery (Forma no vulnerable)
    */
    public static void main6(String[] args) {
        EntityManager em= Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        System.out.println("Nombre del corredor: ");
        String nombre = new Scanner(System.in).nextLine();
        
        Query consulta = em.createQuery("SELECT c FROM Corredor c WHERE c.nombre = ?1");
        consulta.setParameter(1,nombre);
        List<Corredor> listaC = consulta.getResultList();
        for(Corredor c : listaC){
            System.out.println(c.getNombre()+" "+c.getFechaNacimiento());
        }

        em.close();
    }
    
    
    
    /*
        Vamos a modificar el nombre de alvaro a "Alvaro Manuel" 
        y ademas vamos a borrar el objeto con id 3.
    */
    public static void main5(String[] args) {
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
