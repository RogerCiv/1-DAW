package ejercicios.Ejercicio23;

public class ejercicio23 {
    
    public boolean esPar(int n){
       // return n % 2 == 0 ? true : false;
       return n == 0 ? true : !esPar(n-1);
    }
}
