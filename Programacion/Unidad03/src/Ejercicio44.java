
import java.util.Scanner;


public class Ejercicio44 {
    public static void main(String[] args) {
        
        System.out.println("Numero de filas");
        int filas = new Scanner(System.in).nextInt();
        System.out.println("Numero de columnas");
        int col = new Scanner(System.in).nextInt();
        
        int[][] tabla = new int[filas][col];
        
        for(int i = 0; i<tabla.length;i++){
            for(int j = 0 ; j<tabla[i].length; j++){
                tabla[i][j]= i+j;
                System.out.print(tabla[i][j]+" ");
            }
            System.out.println();
        }
    }
}
