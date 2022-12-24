
import java.util.Scanner;


/**
Un profesor hace diez exámenes y calcula la nota de la asignatura haciendo la
nota media, pero si alguna de las notas es suspenso, entonces la calificación de la asignatura es
suspenso. Realiza un programa que pida una por una las notas y muestre al final la nota de la
asignatura. El programa deberá detenerse si alguno de los exámenes está suspenso.
 */
public class Ejercicio29e {
    public static void main(String[] args) {
        
        boolean repetir = true;
        int nota = 5;
        double media = 0;
        int suma = 0;
        while(repetir && nota>4){
            System.out.println("Introduce una nota");
             nota = new Scanner(System.in).nextInt();
        }
        
        System.out.println();
    }
}
