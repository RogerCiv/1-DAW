
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        
          System.out.println("Mete DNI");
          String dni = new Scanner(System.in).nextLine();
          
          String num = dni.substring(0, 8);
          int numDni = Integer.parseInt(num);
          char letra = dni.charAt(8);
          
           char[] lista = {'T','R','W','A','G','M','Y','F','P','D','X','B',
        'N','J','Z','S','Q','V','H','L','C','K','E','T'}; 
           
           int resto = 0;
           
           for(int i =0; i<lista.length; i++){
               resto=numDni%23;
               
           }
           if(letra==lista[resto]){
                   System.out.println("Tu DNI es correcto");
               }else{
                   System.out.println("No es correcto");
               }
           
       
   }
}
