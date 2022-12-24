/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
Las notas de un alumno en una asignatura son: 4,6,8,5,2,9,6. El profesor solo
calcula la media del alumno si todas sus notas son mayores o iguales a 3. Realiza un programa
que muestre por pantalla si el alumno tiene derecho o no a que se calcule su nota media. El
programa deberá ser eficiente, lo que significa que si se descubre una nota menor que 3, el
programa deberá finalizar inmediatamente el bucle sin continuar analizando más notas.
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        
        int[] notas = {4,6,8,5,2,9,6};
        
        for(int i = 0 ; i<notas.length ;i++){
            if(notas[i]<=3){
                System.out.println("No puedes media");
            }else{
                System.out.println("Si");
            }
        }
    }
}
