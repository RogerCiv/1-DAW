package Colegio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profesor {
    private String nombre;
    private String asignatura;
    private List<CalificacionListener> interesados;
    private Map<Alumno,Double> notas;

    public Profesor(String nombre, String asignatura){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.interesados = new ArrayList<>();
        this.notas = new HashMap<>();
    }

    public void addCalificacionListener(CalificacionListener interesado){
        this.interesados.add(interesado);
    }

    public void calificar(Alumno a, double n){
        this.notas.put(a,n);
        
    }


    public String getAsignatura() {
        return asignatura;
    }

    
}
