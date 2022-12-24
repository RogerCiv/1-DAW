
import java.util.Scanner;

/**
 * Según el reglamento de la federación de caza, un cazador no puede cazar más
 * piezas de las que se permiten en un día. Queremos hacer un programa que nos
 * lleve la cuenta de piezas cazadas e indique cuando se ha excedido el límite.
 * Para ello primero se leerá por teclado el límite del día y a continuación los
 * valores de las piezas cazadas en el orden que se obtienen. El programa
 * imprimirá un mensaje en el momento en que el límite haya sido excedido.
 * Después de que cada pieza ha sido registrada, el programa mostrará el número
 * total de piezas que se llevan hasta ese momento cazadas.
 */
public class Ejercicio07b {

    public static void main(String[] args) {

        int piezas = 30;
        System.out.println("Cuantas piezas puedes cazar hoy? : " + piezas);
        boolean repetir = true;
        int contador = 0;
        while (repetir) {
            System.out.println("Introduzca el numero de piezas cazadas: ");
            int num = new Scanner(System.in).nextInt();
            contador += num;
            System.out.println("Llevas cazadas " + contador + " piezas de " + piezas + " posibles");
            if (contador == 30) {
                System.out.println("Ya has llegado al limite de " + piezas + " piezas");
                repetir = false;
            }
        }

    }
}
