
import java.util.Optional;

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

public record Serie(String titulo, int añoInicio,int añoFinalizacion) {
    public static Optional<Serie> parse(String s){
        Optional<Serie> r = Optional.empty();
        
        return r;
    }
}
