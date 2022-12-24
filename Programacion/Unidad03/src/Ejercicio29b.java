
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Un profesor hace diez exámenes y calcula la nota de la asignatura haciendo la
 * nota media, pero si alguna de las notas es suspenso, entonces la calificación
 * de la asignatura es suspenso. Realiza un programa que pida una por una las
 * notas y muestre al final la nota de la asignatura. El programa deberá
 * detenerse si alguno de los exámenes está suspenso
 */
public class Ejercicio29b {

    public static void main(String[] args) {
        int i = 0;
        double suma = 0;
        int nota = 10;

        List<Integer> lista = new ArrayList<>();
        for (i = 0; i <= 10 &&nota>=5 && nota<=10; i++) {
            System.out.println("Introduce la nota:");
            nota = new Scanner(System.in).nextInt();
            
            lista.add(nota);
                suma += nota;
                System.out.println("Tu nota media es de :" + suma / lista.size());
            /*if (nota >= 5 && nota <= 10) {
                lista.add(nota);
                suma += nota;

            } else if (nota>=0 && nota <5){
               System.out.println("Suspenso");
            }*/
        }
       // System.out.println("Tu nota media es de :" + suma / lista.size());
    }
}
