package clases.repaso.DAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Alumno {
    // Propiedad de la clase (estática)
    private static int totalAlumnos = 0;
    // esta lista guarda todos los alumnos que se crean
    private static List<Alumno> alumnosCreados = new ArrayList<>() ;
    //propiedades(Atributos, variables de instancia)
    private String nombre;
    private int edad;

    // inicializa las propiedades con los parámetros recibidos
    // la edad tiene que estar entre 4 y 50. si la edad es incorrecta, se lanzará
    // una
    // IllegalArgumentException con el mensaje “Edad incorrecta”

    public Alumno(String n, int e) {
        nombre = n;

        if (e >= 4 && e <= 50) {
            edad = e;
        } else {
            throw new IllegalArgumentException("Edad incorrecta");
        }
        //contar totalAlumnos contando los objetos creados
        totalAlumnos++;
    }

    // + Alumno(String n, int a, int b)
    // crea un alumno con edad aleatoria entre [a,b]

    public Alumno(String n, int a, int b) {
        this(n, new Random().nextInt(a, b));
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // devuelve el curso del alumno, teniendo en cuenta su edad:
    // * menos de 12 años → primaria
    // * 12 años → 1o eso, 13 años → 2o eso, 14 años → 3o eso, 15 años → 4o eso
    // * resto de los casos → enseñanza post obligatoria
    // + String getCursoRecomendado()

    public String getCursoRecomendado() {
        String curso = "";
        return curso = edad < 12 ? "primaria"
                : edad == 12 ? "1º ESO"
                        : edad == 13 ? "2º ESO"
                                : edad == 14 ? "3º ESO"
                                        : edad == 15 ? "4º ESO" : "enseñanza post obligatoria";

    }

    // devuelve la edad recomendada para el curso que pasa como parámetro. Se usa la
    // tabla anterior
    // La edad recomendada para post obligatoria es 16
    // La edad recomendada para primaria es 8
    // Si el curso no es válido, se lanzará una IllegalArgumentException con el
    // mensaje “curso
    // incorrecto”
    // + int getEdadRecomendad(String curso)
    public int getEdadRecomendad(String curso) {
        int respuesta = 0;

        if (curso.equals("primaria")) {
            respuesta = 8;
        } else if (curso.equals("enseñanza post obligatoria")) {
            respuesta = 16;
        } else {
            throw new IllegalArgumentException("Curso incorrecto");
        }
        return respuesta;
    }
    
    //MËTODOS ESTÁTICOS

    //este metodo devuelve cuantos objetos hay

    public static int getNumeroTotalAlumnos(){
        return totalAlumnos;
    }

    // este metodo devuelve el alumno cuyo nombre se pasa como parametro

    public static Alumno getAlumno(String nombre){
        Alumno a = null;
       /*
       for(Alumno i : alumnosCreados){
          if(i.getNombre().equals(nombre)){
             respuesta = i;
           }
        }
       */ 
       for(int i = 0; i<alumnosCreados.size() && a == null;i++){
        Alumno alumno = alumnosCreados.get(i);
        String n = alumno.getNombre();
        if(n.equals(nombre)){
            a = alumno;
        }
       }
        return a;
    }
}
