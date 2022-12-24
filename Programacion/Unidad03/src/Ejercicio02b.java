/*
Realiza un programa que muestre estas dos opciones al usuario:
1) Escribir dos frases en un archivo
2) Leer dos frases del archivo
Se hará un bloque switch-case que analice la opción elegida por el usuario. Si pulsa 1, se
creará un archivo llamado “frases.txt” con dos frases (las que tú quieras) en él. Si pulsa 2,
se leerá el archivo “frases.txt” y se mostrarán en pantalla las dos frases que contiene.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio02b {

    public static void main(String[] args) {

        System.out.println("""
                           
                           1) Escribir dos frases en un archivo.
                           2) Leer dos frases del archivo
                           """);

        int opcion = new Scanner(System.in).nextInt();

        switch (opcion) {
            case 1 -> {
                try {

                    PrintWriter writer = new PrintWriter(new File("D:/frases.txt"));
                    writer.println("Hola");
                    writer.println("Que tal");
                    writer.close();
                } catch (FileNotFoundException error) {
                    System.out.println("Error");
                }
            }
            case 2 -> {
                File file = new File("D:/frases.txt");
                try{
                     Scanner frase = new Scanner(file);
                     System.out.println(frase.nextLine()+" "+frase.nextLine());
                }catch(FileNotFoundException error){
                    System.out.println("error");
                }
               
            }
        }
    }
    }
