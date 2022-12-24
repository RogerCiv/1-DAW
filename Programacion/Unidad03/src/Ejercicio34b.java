/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 Calcula la suma de los cuadrados de los números comprendidos entre 5 y 13:
52 +62+72+82+92+102+112+122+132
 */
public class Ejercicio34b {
    public static void main(String[] args) {
        
        int suma = 0;
        
        for(int i = 5; i<=13; i++){
            suma+= Math.pow(i, 2);
        }
        System.out.print(suma);
    }
}
