
import java.util.Scanner;

/**
 * Haz un programa que pregunte un número al usuario y nos muestre la lista de
 * todos sus divisores.
 */
public class Ejercicio36 {

    public static void main(String[] args) {

        System.out.println("Introduce un numero entero");
        int num = new Scanner(System.in).nextInt();
        
        for(int i =1 ; i<=num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }

    }
}
