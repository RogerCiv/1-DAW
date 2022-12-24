
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger
 */
public class Ejercicio43 {
    public static void main(String[] args) {
        
        boolean[][] bool = new boolean[4][3];
        Random r = new Random();
         int contTrue = 0;
         int contFalse=0;
         
         for(int i=0; i<bool.length;i++){
             for(int j = 0 ; j<bool[i].length;j++){
                 bool[i][j]=r.nextBoolean();
                 System.out.print(bool[i][j]+" ");
                 if(bool[i][j]==true){
                     contTrue++;
                 }else{
                     contFalse++;
                 }
             }
             System.out.println();
         }
        
         System.out.println("True "+contTrue );
         System.out.println("False "+contFalse );
    }
}
