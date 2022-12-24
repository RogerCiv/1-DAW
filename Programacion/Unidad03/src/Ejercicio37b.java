
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
Haz un programa que pregunte un número al usuario y nos muestre por pantalla
si es primo o no. De las dos formas que hay de hacer el ejercicio, elige la que más fácil te sea:
1. Se generan todos los números desde 2 hasta el que hay antes del número. Si alguno de
los números generados es un divisor, entonces ya sabemos que el número no es
primo. En ese caso, se interrumpe la generación de números y hemos terminado. Si
por el contrario no hay divisores, entonces el número es primo.
2. Se generan todos los números desde 2 hasta el que hay antes del número y se cuenta
en una variable auxiliar el número de divisores que se van encontrando. Si al finalizar
el recorrido dicha variable es 0 el número es primo.
 */
public class Ejercicio37b {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        int num = new Scanner(System.in).nextInt();
        
        boolean repetir = true;
        int noPrimo=0;
        for(int i = 2; i<num && repetir;i++){
            if(num%i==0){
                System.out.println("No es primo");
                repetir=false;
            }
        }
        if(repetir){
            System.out.println("Es primo");
        }
    }
}
