package Colegio;

import java.util.HashMap;
import java.util.Map;

public class JefeEstudios extends EmpleadoColegio{
    private Map<String,Integer> notasAsignaturas;

    public JefeEstudios (String nombre, String colegio){
        super(nombre,colegio);
        this.notasAsignaturas = new HashMap<>();
    }

    public int getNumeroSuspensos(String asignatura){
        if(!notasAsignaturas.containsKey(asignatura)){
          throw new IllegalArgumentException("La asignatura no se encuentra");
        }
        return  notasAsignaturas.get(asignatura);
    }
    

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        // TODO Auto-generated method stub
        int contador = 0;
        if(nota.getValoracion().esSuspenso()){
            if(notasAsignaturas.containsKey(p.getAsignatura())){
                contador++;
                notasAsignaturas.put(p.getAsignatura(),notasAsignaturas.get(p.getAsignatura()));
            }else{

            }
           
        }
    }
}
