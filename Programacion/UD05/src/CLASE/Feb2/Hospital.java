package CLASE.Feb2;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Paciente> pacientes;

    public Hospital(){
        pacientes = new ArrayList<>();
        pacientes.add(new Paciente(123456, "Paco"));
    }

    // Este metodo devuelve true si el paciente esta en el Hospital.
    public boolean pacienteIngresado(Paciente p){
        // Contains usa equals para saber si un objeto esta en la lista.
        return pacientes.contains(p);
    }
}
