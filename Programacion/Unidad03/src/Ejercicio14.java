
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

/**
 * Realiza un programa que pida una por una, las notas de los alumnos
 * comprendidas entre 0 y 10 sin decimales. Cuando el usuario introduzca un -1,
 * se mostrará la mayor nota, la menor, y la nota media de todos ellos.
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        int contador = 0;

        List<Integer> lista = new ArrayList<>();
        int nota = 0;
        boolean repetir = true;
        while (repetir) {
            System.out.println("Introduce notas de los usuarios( -1 para parar):");
            nota = new Scanner(System.in).nextInt();
            if (nota >= 0 && nota < 11) {
                lista.add(nota);
                contador++;

            } else {
                System.out.println("Se acabo");

                repetir = false;
            }

        }

        double n = 0;
        for (int i = 0; i < lista.size(); i++) {
            n += lista.get(i);

        }
        System.out.println("La nota media es :" + n / lista.size());
        System.out.println("La mayor nota es :" + Collections.max(lista));
        System.out.println("La menor nota es :" + Collections.min(lista));

    }
}
