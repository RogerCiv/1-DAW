
import java.util.Random;


/**
Realiza un programa que genere números enteros aleatorios entre 0 y 10 y los
muestre por pantalla. El programa terminará cuando el número generado sea el 10
 */
public class Ejercicio05b {
    public static void main(String[] args) {
        Random r = new Random();
       
        boolean repetir = true;
        while(repetir){
             int aleatorio = r.nextInt(11);
            System.out.println(aleatorio);
            if(aleatorio==10){
                repetir=false;
            }
        }
    }
}
