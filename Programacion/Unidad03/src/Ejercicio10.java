
import java.util.Scanner;
import java.util.StringTokenizer;


/**
Usa la clase StringTokenizer para hacer un programa que pregunte al usuario
"Escriba una frase" y nos muestre en una línea diferente cada palabra de la frase y además, el
número total de palabras encontradas
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        
        System.out.println("Escriba una frase");
        String frase = new Scanner(System.in).nextLine();
        StringTokenizer token = new StringTokenizer(frase," ");
        
        int contador = 0;
        boolean repetir = true;
        
         while(repetir){
           boolean token2 = token.hasMoreTokens();
            
            
            if(token2 == false){
                repetir = false;
            }else{
                
            String palabras = token.nextToken();
            System.out.println(palabras);
            contador++;
            }
            
      
             
        }
            System.out.println("El numero de palabras es de : "+contador);   
    }
}
