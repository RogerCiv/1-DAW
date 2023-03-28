
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


// Ejercicio 01: hay que hacerlo sin usar expresiones regulares

/*
    Creamos la siguiente record:
    Serie
    private String titulo;
    private int añoInicio
    private int añoFinalizacion

    public Serie(String t,int ai, int af)
public static Optional<Serie> parse(String s) // el string tiene este formato: titulo(añoinicio-añofin)
*/

/// Ejercicio 02:

/*
 Haz una tranformacion que reciba un Lis<List<String>> y lo transforma en un List<String>
    que tiene los String que salen de reunir de todas las listas.
*/

public class Ejercicios {
    public static void main(String[] args) {
        Function<List<List<String>>, List<String>> f = metalista -> 
        {
            List<String> r = new ArrayList<>();
            metalista.forEach(sublista -> r.addAll(sublista));
            return r;
        };
        
        
    }
}
