
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/*

/**
Usa las clases LocalDate y DateTimeFormatter para hacer un programa que
pregunte al usuario un número de mes (entre 1 y 12) y un año. El programa mostrará por
pantalla todos los días de ese mes, con el siguiente formato: “día/mes/año y día de la semana”
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        System.out.println("Introduce el numero de mes(1 a 12)");
        int mes = new Scanner(System.in).nextInt();
        System.out.println("Introduce el a;o");
        int year = new Scanner(System.in).nextInt();

        int[] dias = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int contador = 0;
       
        boolean repetir = true;
        while (repetir) {
            LocalDate fecha = LocalDate.of(year, mes, dias[mes]);

            contador++;

            System.out.println(fecha);
            if (contador == dias[mes]) {
                repetir = false;
            }
        }
        // LocalDate fecha = LocalDate.of(mes, mes, mes);
    }
}
