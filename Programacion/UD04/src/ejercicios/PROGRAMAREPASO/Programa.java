package ejercicios.PROGRAMAREPASO;

import java.io.IOException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        try {
            CatalogoTitulos catalogo = new CatalogoTitulosArchivos("titulos.txt");

            int opcion = 0;
            while (opcion != 4) {
                System.out.println("""
                                   
                                   1. Añadir Titulo.
                                   2. Consultar todos los titulos.
                                   3. Cambiar estado del titulo.
                                   4. Salir.
                                   """);

                opcion = new Scanner(System.in).nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("introduce DNI");
                        String dni = new Scanner(System.in).nextLine();
                        System.out.println("introudce nombre:");
                        String nombre = new Scanner(System.in).nextLine();
                        System.out.println("Introduce estudios");
                        String estudios = new Scanner(System.in).nextLine();
                        System.out.println("Introduce estado: (SIN_RECIBIR = 0, RECIBIDO = 1, RECOGIDO = 2)");
                        int estado = new Scanner(System.in).nextInt();
                        catalogo.añadirTitulo(dni, nombre, estudios, Estado.values()[estado]);
                    }
                    case 2 -> {
                        for (Titulo i : catalogo.getTitulos()) {
                            System.out.println(i.toString());
                        }
                    }
                    case 3 -> {
                         
                        System.out.println("Introduce un dni para consultar");
                        String dniConsultar = new Scanner(System.in).nextLine();
                        Titulo ti = catalogo.getTitulo(dniConsultar);
                        System.out.println("A que estado cambiar? (SIN_RECIBIR = 0, RECIBIDO = 1, RECOGIDO = 2)");
                        int dniCambio = new Scanner(System.in).nextInt();
                        ti.setEstado(Estado.values()[dniCambio]);
                        catalogo.guardar();
                        
                    }
                    case 4 -> {
                        catalogo.guardar();
                        break;
                    }
                    default -> {
                        System.out.println("Error al elegir la opcion");
                    }
                }

            }

        } catch (IOException error) {
            System.out.println("Error al cargar el archivo");
        }
    }
}