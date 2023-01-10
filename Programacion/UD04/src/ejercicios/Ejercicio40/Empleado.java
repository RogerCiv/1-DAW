package ejercicios.Ejercicio40;

import java.util.ArrayList;
import java.util.List;

// El constructor principal declara e inicializa las propiedades sin más
public record Empleado(String nombre, List<Empleado> subordinados) {
    

    // El segundo constructor crea un empleado que no tiene subordinados (su lista
    // de
    // subordinados es un ArrayList vacío)
    public Empleado(String nombre) {
        this(nombre, new ArrayList<>());

    }

    // El primer método mostrarSubordinados muestra en pantalla el nombre del
    // empleado y
    // llama al segundo método mostrarSubordinados pasando un 1 como parámetro
    public void mostrarSubordinados() {
        mostrarSubordinados(1);
    }

    // El segundo método mostrarSubordinados hace esto:
    // o Recorre la lista de subordinados
    // o Muestra el nombre de cada empleado subordinado, pero antes imprime una
    // secuencia de tantos guiones consecutivos (-) como indica el parámetro “tabs”
    // o A continuación llama al método mostrarSubordinados del empleado que está
    // siendo recorrido, pero añadiendo 1 a la cantidad de tabs (eso se hace para
    // que al
    // mostrar en pantalla la salida parezca un árbol)
    private void mostrarSubordinados(int tabs) {
        // o Recorre la lista de subordinados
        for (Empleado i : subordinados) {
            // Muestra el nombre de cada empleado subordinado, pero antes imprime una
            // secuencia de tantos guiones consecutivos (-) como indica el parámetro “tabs”
            for (int j = 0; j < tabs; j++) {
                System.out.print("-");
            }
            System.out.println(i.nombre());
            // A continuación llama al método mostrarSubordinados del empleado que está
            // siendo recorrido, pero añadiendo 1 a la cantidad de tabs (eso se hace para
            // que al
            // mostrar en pantalla la salida parezca un árbol)
            i.mostrarSubordinados(tabs+1);
        }
    }
}
