
import java.util.Random;


/**
Haz un programa que cree una tabla de 4 filas y 3 columnas rellenada con
booleanos aleatorios. El programa mostrará la tabla en pantalla y después la recorrerá y nos
dirá cuántos true y cuántos false hay en la tabla.
 */
public class Ejercicio43b {
    public static void main(String[] args) {
        
        boolean[][] tabla = new boolean[4][3];
        
        Random r = new Random();
        
        int sumTrue = 0;
        int sumFalse= 0;
        for(int i = 0; i<tabla.length ;i++){
            for(int j = 0; j<tabla[i].length; j++){
                tabla[i][j]= r.nextBoolean();
                if(tabla[i][j]==true){
                    sumTrue++;
                }else{
                    sumFalse++;
                }
                System.out.print(tabla[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("True: "+sumTrue);
        System.out.println("False: "+sumFalse);
        
    }
}
