
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Ejercicio29c {
    public static void main(String[] args) {
        int nota = 5;
        int contador = 0;
        double suma = 0;
         List<Integer> lista = new ArrayList<>();
        while(nota>=0 && nota<11 && contador<10){
            System.out.println("Introduce la nota:");
            nota = new Scanner(System.in).nextInt();
            if(nota>=5 && nota <=10){
            lista.add(nota);
            contador++;
            suma +=nota;
            }else{
                System.out.println("Has suspendido");
            }
        }
        System.out.println("Tu nota media es de :"+suma/lista.size());
         System.out.println(lista);
    }
}
