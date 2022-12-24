
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
Haz un programa que pida 6 palabras al usuario y las guarde en un List<String>. El
programa deberá recorrer dicha lista y mostrará por pantalla las que contienen la letra “a”.
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.println("Introduce 6 palabras");
        String palabras = new Scanner(System.in).nextLine();
        
        String[] array = palabras.split(" ");
        
        List<String> lista = Arrays.asList(array);
        for(String pal : lista){
            if(pal.contains("a")){
                System.out.println(pal);
            }
        }
        
    }
}
