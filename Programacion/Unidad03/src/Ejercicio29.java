
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Un profesor hace diez exámenes y calcula la nota de la asignatura haciendo la
 * nota media, pero si alguna de las notas es suspenso, entonces la calificación
 * de la asignatura es suspenso. Realiza un programa que pida una por una las
 * notas y muestre al final la nota de la asignatura. El programa deberá
 * detenerse si alguno de los exámenes está suspenso
 */
public class Ejercicio29 {

    public static void main(String[] args) {

        int nota = 0;
        int contador = 0;
        double suma = 0;
        boolean repetir = true;
        List<Integer> lista = new ArrayList<>();
        while (repetir && contador < 10) {
            System.out.println("Introduce la nota:");
            nota = new Scanner(System.in).nextInt();
            if (nota >= 0 && nota < 5) {
                System.out.println("Has   suspendido");
                repetir = false;

            } else if (nota >= 5 && nota < 11) {

                lista.add(nota);
                contador++;
                suma += nota;
                
            } else {
                System.out.println("Nota incorrecta, introduce notas del 0 al 10");
                repetir = false;
            }

        }
System.out.println("Tu nota media es de :" + suma / lista.size());
        System.out.println(lista);
    }
}
