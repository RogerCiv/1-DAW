
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
Realiza un programa que pregunte al usuario una cadena de caracteres con su
NIF. El programa deberá analizarla y decir si se trata de un NIF correcto o incorrecto. Un NIF
correcto está formado por 8 dígitos y una letra. Los dígitos deben estar comprendidos entre 0
y 9 y la letra debe calcularse tal y como se indica en un ejercicio del tema 1.
 */
public class Ejercicio38b {
    public static void main(String[] args) {
         System.out.println("Mete DNI");
          String dni = new Scanner(System.in).nextLine();
          
          String num = dni.substring(0, 8);
          int numDni = Integer.parseInt(num);
          char letra = dni.charAt(8);
          
           char[] lista = {'T','R','W','A','G','M','Y','F','P','D','X','B',
        'N','J','Z','S','Q','V','H','L','C','K','E','T'}; 
           
           int resto = 0;
           for(int i = 0 ; i<lista.length; i++){
               resto=numDni%23;
           }
           if(letra==lista[resto]){
               System.out.println("DNI Correcto");
           }else{
               System.out.println("Incorrecto");
           }
    }
}
