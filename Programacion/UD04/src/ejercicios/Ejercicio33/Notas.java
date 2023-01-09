package ejercicios.Ejercicio33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Notas {
    private List<Double> notas;

    // El constructor inicializa la propiedad “notas” con un ArrayList<Double>
    public Notas() {
        notas = new ArrayList<>();
    }

    // añadirNota: Añade a la lista de notas la nota que se pasa como parámetro.
    public void añadirNota(double n) {
        notas.add(n);
    }

    // getTotalNotas: Devuelve la cantidad de notas que se pasa como parámetro
    public int getTotalNotas() {
        return notas.size();
    }

    /*
     * calcularNotaMedia: Devuelve un double rellenado con la nota media de todas
     * las
     * notas que hay en la lista. En caso de que la lista esté vacía se lanzará una
     * IllegalStateException con el mensaje “no hay notas para calcular la media”
     */
    public double calcularNotaMedia() {
        if (notas.isEmpty()) {
            throw new IllegalStateException("No hay notas para calcular la nota media");
        }
        int total = 0;
        for(Double i : notas){
            total += i;
        }
        return  total/notas.size();
    }

    /*
     * calcularNotaMáxima: Devuelve un double rellenado con la nota máxima de todas las
    notas que hay en la lista. En caso de que la lista esté vacía se lanzará una
    IllegalStateException con el mensaje “no hay notas para calcular la nota máxima”
     */
    public double calcularNotaMáxima(){
        if(notas.isEmpty()){
            throw new IllegalStateException("la lista esta vacia");
        }
        return Collections.max(notas);
    }
}
