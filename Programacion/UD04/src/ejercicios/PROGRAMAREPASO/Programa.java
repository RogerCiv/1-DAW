package ejercicios.PROGRAMAREPASO;

import java.io.IOException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
      
        try {
            CatalogoTitulos catalogo;  catalogo = new CatalogoTitulosArchivos("titulos.txt");
       

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("""
                    1. Añadir título.
                    2. Consultar todos los títulos.
                    3. Cambiar estado del título.
                    4. Salir.
                    """);

            opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce un DNI: ");
                    String dni = new Scanner(System.in).nextLine();
                    System.out.println("Introduce un nombre: ");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Introduce estudios: ");
                    String estudios = new Scanner(System.in).nextLine();
                    System.out.println("Introduce un Estado (SIN RECIBIR = 0, RECIBIDO =1 o RECOGIDO = 2): ");
                    int estado = new Scanner(System.in).nextInt();
                    catalogo.añadirTitulo(dni, nombre, estudios, Estado.values()[estado]);
                }
                case 2 -> {
                    for (Titulo i : catalogo.getTitulos()) {
                        System.out.println(i.toString());
                    }
                }
                case 3 -> {
                    System.out.println("Introduce un DNI para buscar sus titulos");
                    String dni2 = new Scanner(System.in).nextLine();
                    Titulo ti = catalogo.getTitulo(dni2);
                    if (ti == null) {
                        System.out.println("DNI No tiene titulos");
                    } else {
                        //esto meterlo arriba en el IF y este if cambiarlo por un try catch.
                        System.out.println(
                                "En que nuevo estado queremos poner el titulo SIN RECIBIR = 0, RECIBIDO =1 o RECOGIDO = 2):");
                        int cambiarDNI = new Scanner(System.in).nextInt();
                        ti.setEstado(Estado.values()[cambiarDNI]);
                    }

                }
                case 4 -> {
                    catalogo.guardar();
                    break;
                }
                default -> {
                    System.out.println("Opcion incorrecta, prueba de nuevo");
                }
            }

        }
    } catch (IOException e) {
        System.out.println("Error al abrir el archivo de títulos");
        return;
        }
    }
  
}
