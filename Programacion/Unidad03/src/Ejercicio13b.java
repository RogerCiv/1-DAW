
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Utiliza las clases PrintWriter y BufferedReader de la librería de entrada y
 * salida para realizar un programa que muestre al usuario este menú de opciones
 * que se repite continuamente hasta que se pulsa la opción de salir: 1. Añadir
 * nuevo alumno 2. Ver los datos de un alumno 3. Salir Al pulsar cada opción,
 * sucede esto:  Opción 1: El programa preguntará el dni, nombre, dirección y
 * teléfono de un alumno y guardará estos tres últimos datos en líneas
 * diferentes en un archivo de texto llamado (poner el dni).txt  Opción 2: El
 * programa pregunta un dni y recupera del archivo (poner el dni).txt el nombre,
 * dirección y teléfono del alumno, mostrándolos por pantalla.  Opción 3: El
 * programa finalizará.
 */
public class Ejercicio13b {

    public static void main(String[] args) {

        boolean repetir = true;

        while (repetir) {

            System.out.println("""
                               
                               1. A;adir nuevo alumno.
                               2. Ver los datos de un alumno.
                               3. Salir
                               """);
            int opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce el DNI");
                    String dni = new Scanner(System.in).nextLine();
                    System.out.println("Introduce el nombre");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Introduce la direccion");
                    String direccion = new Scanner(System.in).nextLine();
                    System.out.println("Introduce el telefono");
                    int tel = new Scanner(System.in).nextInt();

                    try {
                        PrintWriter write = new PrintWriter("D:/" + dni + ".txt");
                        write.println(nombre);
                        write.println(direccion);
                        write.println(tel);
                        write.close();

                    } catch (FileNotFoundException error) {
                        System.out.println("Error");
                    }

                }
                case 2 -> {
                    System.out.println("Introduce el DNI para comprobar");
                    String dni2 = new Scanner(System.in).nextLine();

                    try {
                        FileReader file = new FileReader("D:/" + dni2 + ".txt");
                        BufferedReader reader = new BufferedReader(file);

                        String nombre = reader.readLine();
                        String direccion = reader.readLine();
                        String tel = reader.readLine();
                        System.out.println("Nombre: " +nombre);
                        System.out.println("Direccion: "+direccion); 
                        System.out.println("Telefono: "+tel);

                    } catch (FileNotFoundException error) {
                        System.out.println("Error");
                    } catch (IOException ex) {
                        System.out.println("Error IO");
                    }

                }
                
                case 3 -> repetir = false;
                default -> System.out.println("Solo números entre 1 y 3");
            }
        }
    }

}
