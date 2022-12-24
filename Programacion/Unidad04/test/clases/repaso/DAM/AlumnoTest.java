
package clases.repaso.DAM;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class AlumnoTest {
    
    public AlumnoTest() {
    }

    
    @Test
    public void test1() {
        //Crea un alumno de 10 años y cmprueba que su curso recomendado
        // es primaria.

        Alumno al1 = new Alumno("pepe", 10);

        assertEquals("primaria", al1.getCursoRecomendado());
    }
    @Test
    public void test2() {
        //Crea un alumno de 14 años y comprueba que esta en 3º Eso y la edad recoemndada para
        //3º eso es de 14 años.
        Alumno b = new Alumno("Paco",14);

        assertEquals("3º ESO", b.getCursoRecomendado());
      //assertEquals(14,b.getEdadRecomendad(b.getCursoRecomendado()));
    }
    @Test
    public void test3(){
        //Crea un colegio que se llame  IES HLANZ y añade un alumno.
        //comprueba que el colegio tiene 1 alumno
        Colegio c = new Colegio("IES HLANZ");
       // Alumno d = new Alumno("Pepe", 10);
        c.matricular(
                new Alumno("Pepe", 10),
                new Alumno("paco",11),
                new Alumno("ana",12)
        );
        assertEquals(3,c.getNumeroAlumnos());
    }
    @Test
    public void test4(){
        //crea el colegio de antes y añade estos alumnos
        /*
        Juan 13
        antonio 13
        ana 15
        julio 15
        pedro 13
        */
        //Comprueba que en 2º eso hay 3 alumnos
        // Y en cuarto de la eso hay 2
        Colegio c = new Colegio("IES HLANZ");
        c.matricular(
                new Alumno("juan",13),
                new Alumno("antonio", 13),
                new Alumno("ana",15),
                new Alumno("julio",15),
                new Alumno("pedro",13)
        );
        
       // assertEquals(3,c.getNumeroAlumnos2ºESO());
       // List<Alumno> lista =c.getAlumnos("4º ESO");
        assertEquals(2, c.getAlumnos("4º ESO").size());

        //comprueba que la edad media es de 13.8 años
        //deprecated
        assertEquals(13.8, c.getEdadMedia());
        //para arreglar esto damos un margen de error
        assertEquals(13.8, c.getEdadMedia(),0.01);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test5(){
        //crea un colegio que se llame COLE HLANZ y comprueba que se lanza
        //una IllegalArgumentException
        
        Colegio c = new Colegio("COLE HLANZ");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test6(){
        //Crea un alumno y comprueba y pide la edad recomendada para
        // el curso 9º ESO. Comprueba que se lanza una IllegalArgumentException
        Alumno a = new Alumno("pepe",15);

      int edad= a.getEdadRecomendad("9º ESO");
    }
    
}
