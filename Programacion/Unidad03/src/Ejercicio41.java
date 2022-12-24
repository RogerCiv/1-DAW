
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger
 */
public class Ejercicio41 {
    public static void main(String[] args) {
        //apartado A
        String[] nombre = {"pepe","ana","juan","roberta"};
        
        ///Apartado B
        
        int[][] notas = {
            {9, 5, 4, 3},
            {4, 8, 10, 2},
            {2, 5, 10, 2},
            {10, 10, 10, 9}
        };
        double media = 0;
        for(int i = 0; i<nombre.length;i++){
            double suma = 0;
            System.out.println(nombre[i]);
            for(int j = 0; j<notas[i].length;j++){
                suma+=notas[i][j];
            }
            media=suma/notas[i].length;
            System.out.println("La media es " + media);
        }
        
        
        
        
    }
}
