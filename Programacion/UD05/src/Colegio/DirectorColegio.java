package Colegio;

import java.util.ArrayList;
import java.util.List;

public class DirectorColegio extends EmpleadoColegio{
    private String nombre;
    private List<Nota> notasColegio;

    public DirectorColegio(String nombre, String colegio){
        super(nombre,colegio);
        this.notasColegio = new ArrayList<>();
    }
    public double getNotaMediaColegio(){
        double notas = 0;

        for(Nota i: notasColegio){
            notas+=i.valorNumerico();
        }

        return notas/notasColegio.size();
    }
    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        // TODO Auto-generated method stub
        this.notasColegio.add(nota);
    }
}
