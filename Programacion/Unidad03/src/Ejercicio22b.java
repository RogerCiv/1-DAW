/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
Realiza un programa que calcule la suma de todos los números de esta lista:
2,9,4,5,6,1,2,3,45,2,1,2,65,3,2,6,1,2,3,5,2,2,6,67,11,67,3,2,1,7,8,5,3,27,8,93,1,6
 */
public class Ejercicio22b {
    public static void main(String[] args) {
        
        int[] lista = {2,9,4,5,6,1,2,3,45,2,1,2,65,3,2,6,1,2,3,5,2,2,6,67,11,67,3,2,1,7,8,5,3,27,8,93,1,6};
        
        int suma = 0;
        
        for(int i = 0; i<lista.length;i++){
            suma += lista[i];

        }
        
        System.out.println(suma);
    }
}
