
import java.util.*;
/**
Realiza un programa que genere números enteros aleatorios entre 0 y 10 y los
muestre por pantalla. El programa terminará cuando el número generado sea el 10
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        
        int num = 0;
        while(num!=10){
            num =  (int) (Math.random()*(0-11)+11);
            System.out.println(num);
        }
        
    }
}
