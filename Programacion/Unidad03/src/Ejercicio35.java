
import java.util.Scanner;


/**
 Realiza un programa que pida un número entero al usuario y muestre por pantalla
la tabla de multiplicar de dicho número.
 */
public class Ejercicio35 {
    
    public static void main(String[] args) {
        
        System.out.println("Introduce un numero entero");
        int num = new Scanner(System.in).nextInt();
        
     
        for(int i = 0 ; i<11;i++){
           
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
    
}
