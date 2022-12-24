package clases.ejercicios.ejercicio23;

public class ejercicio23 {
    
    public boolean esPar(int n){

        return n== 0 ? true : !esPar (n-1);
    }
}
