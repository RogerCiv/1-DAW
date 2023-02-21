package Colegio;

import java.util.ArrayList;
import java.util.List;

public record Alumno(String nombre, List<Nota> notas) implements CalificacionListener {

    public double getNotaMedia(){
        double notaM = 0;
        for(Nota i : notas){
            notaM+=i.valorNumerico();
        }
        return notaM/notas.size();

    }
    public Alumno(String nombre){
        this(nombre, new ArrayList<Nota>());
    }
    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        // TODO Auto-generated method stub
        /*
        if(a.equals(this)){
            notas.add(nota);
        }
        */
        if(a.nombre().equals(this.nombre())){
            notas.add(nota);
        }   
    }
}
