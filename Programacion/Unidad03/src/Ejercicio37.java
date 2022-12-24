
import java.util.Scanner;

public class Ejercicio37 {

    public static void main(String[] args) {
        System.out.println("Introduce un numero entero");
        int num = new Scanner(System.in).nextInt();
        int noPrimo =0;
        boolean repetir = true;
        for(int i = 2; i<num && repetir;i++){
            if(num%i==0){
                
                System.out.println("No es primo");
                repetir=false;
            }
        }
        if(repetir){
              System.out.println(" es primo");
        }
    }
}
