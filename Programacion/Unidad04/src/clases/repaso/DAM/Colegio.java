package clases.repaso.DAM;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Colegio {
    private String nombre;
    private List<Alumno> alumnos;

    // El nombre del colegio debe empezar por CEIP o IES. En caso contrario, se
    // lanzará una
    // IllegalArgumentException con el mensaje “nombre incorrecto”

    public Colegio(String n) {

        if (n.startsWith("CEIP") || n.startsWith("IES")) {
            nombre = n;
        } else {
            throw new IllegalArgumentException("nombre incorrecto");
        }
        alumnos = new ArrayList<>();
    }

    // devuelve el número de alumnos del colegio
    public int getNumeroAlumnos() {
        return alumnos.size();
    }

    // devuelve el n.o alumnos de 2o eso
    public int getNumeroAlumnos2ºESO() {
       /* int respuesta = 0;
        for (Alumno i : alumnos) {
            if (i.getCursoRecomendado().equals("2º eso")) {
                respuesta++;
            }
        }
        return respuesta;*/
        List<Alumno> lista = this.getAlumnos("2º eso");
        return lista.size();
    }

    // devuelve una lista con los alumnos del curso que pasamos como parámetro
    public List<Alumno> getAlumnos(String curso) {
        List<Alumno> respuesta = new ArrayList<>();

        for (Alumno i : alumnos) {
            if (i.getCursoRecomendado().equals(curso)) {
                respuesta.add(i);
            }
        }
        return respuesta;
    }

    // devuelve true si el alumno cuyo nombre se pasa como parámetro está en el
    // colegio. En caso de
    // que no esté, se lanzará una IOException con el mensaje “Alumno no encontrado”
    public boolean estaMatriculado(String nombre) throws IOException {
        boolean respuesta = false;

        for (Alumno i : alumnos) {
            if (i.getNombre().equals(nombre)) {
                respuesta = true;
            }
        }
        if (!respuesta) {
            throw new IOException("Alumno no encontrado");
        }
        return respuesta;

    }

    // este método guarda en el archivo que pasamos como parámetro el nombre de
    // todos los alumnos
    // del colegio. Si falla, lanza una IOException
    public void guardar(String archivo) throws IOException {
      
        PrintWriter file = new PrintWriter(archivo);
            for (Alumno i : alumnos) {
                file.println(i);
            }
            file.close();
    }
    // public void matricular(Alumno a) <--- Por defecto
    // si queremos meter muchos alumnos, hacemos un array [] pero con ...
    public void matricular(Alumno... a){
       // this.alumnos.add(a);
       for(Alumno i: a){
        alumnos.add(i);
       }
    }

    // devuelve la edad media de todos los alumnos
    public double getEdadMedia(){
        double acumulador =0;
        for(Alumno i : alumnos){
          acumulador += i.getEdad();
        }
        return acumulador/alumnos.size();
    }
}
