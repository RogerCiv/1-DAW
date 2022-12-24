
import java.io.*;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class Ejercicio13 {

    public static void main(String[] args) {

        boolean salir = true;

        while (salir) {

            System.out.println("1. Añadir nuevo alumno");
            System.out.println("2. Ver los datos de un alumno");
            System.out.println("3. Salir");

            System.out.println("Elige la opcion deseada");
            int opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Has seleccionado la opcion 1");
                    System.out.println("Introduce tu DNI:");
                    int dni = new Scanner(System.in).nextInt();
                    System.out.println("Introduce tu nombre");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Introduce tu direccion");
                    String address = new Scanner(System.in).nextLine();
                    System.out.println("Introduce tu telefono");
                    String tel = new Scanner(System.in).nextLine();
                    try {
                        PrintWriter file = new PrintWriter("d:/" + dni + ".txt");
                        file.println("Nombre: " + nombre);
                        file.println("Direccion: " + address);
                        file.println("Telefono: " + tel);
                        file.close();
                    } catch (FileNotFoundException error) {
                        System.out.println("Error de " + error);
                    }
                }
                case 2 -> {
                    System.out.println("Has seleccionado la opcion 2");
                    try {
                        System.out.println("Introduce el DNI del alumno");
                        int dni2 = new Scanner(System.in).nextInt();
                        FileReader archivo = new FileReader("d:/" + dni2 + ".txt");
                        BufferedReader leer = new BufferedReader(archivo);
                        String linea;
                        boolean repetir = true;
                        while (repetir) {
                            if ((linea = leer.readLine()) != null) {
                                System.out.println(linea);
                                System.out.println();
                                
                            } else {
                                repetir = false;
                            }
                        }
                    } catch (FileNotFoundException error) {
                        System.out.println("Error de " + error);
                    } catch (IOException error) {
                        System.out.println("error de " + error);
                    }
                }

                case 3 -> salir = false;
                default -> System.out.println("Solo números entre 1 y 4");
            }
        }
    }
}
