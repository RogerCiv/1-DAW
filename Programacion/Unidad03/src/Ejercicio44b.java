
import java.util.Scanner;


/**
Haz un programa que pregunte al usuario el número total de filas y el número
total de columnas, y cree una tabla de números, en la que cada número es la suma de su
número de fila y número de columna. Aquí tienes un ejemplo si elegimos 3 filas y 3 columnas:
 */
public class Ejercicio44b {
    public static void main(String[] args) {
        
        System.out.println("num filas");
        int filas = new Scanner(System.in).nextInt();
        System.out.println("num columnas");
        int col = new Scanner(System.in).nextInt();
        int[][] tabla = new int[filas][col];
        
        
        for(int i = 0; i<tabla.length ;i++){
            for(int j = 0; j<tabla[i].length; j++){
                tabla[i][j] = i+j;
                System.out.print(tabla[i][j]+" ");
            }
            
            System.out.println();
        }
    }
}
