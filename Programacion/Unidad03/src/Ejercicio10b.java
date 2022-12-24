
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
Usa la clase StringTokenizer para hacer un programa que pregunte al usuario
"Escriba una frase" y nos muestre en una línea diferente cada palabra de la frase y además, el
número total de palabras encontradas.
 */
public class Ejercicio10b {
    public static void main(String[] args) {
       System.out.println("Escribe una frase");
       String frase = new Scanner(System.in).nextLine();
       StringTokenizer token1 =  new StringTokenizer(frase, " ");
       
        boolean repetir = true;
        int contador = 0;
        while(repetir){
            
            boolean token2 = token1.hasMoreTokens();
            
            if(token2 == false){
                repetir= false;
            }else{
                String pal = token1.nextToken();
                System.out.println(pal);
                contador++;
            }
        }
        System.out.println("El numero de palabras es de "+contador);
    }
}
