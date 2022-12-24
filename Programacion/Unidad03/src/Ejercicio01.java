
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 Realiza un programa que muestre estas dos opciones al usuario:
1) Escribir dos frases en un archivo
2) Leer dos frases del archivo
*S e hará un bloque switch-case que analice la opción elegida por el usuario. Si pulsa 1, se
creará un archivo llamado “frases.txt” con dos frases (las que tú quieras) en él. Si pulsa 2,
se leerá el archivo “frases.txt” y se mostrarán en pantalla las dos frases que contiene.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        System.out.println("Elige entre las siguientes dos opciones:");
        System.out.println("1)Escribir dos frases en un archivo");
        System.out.println("2) Leer dos frases del archivo");
        int num = new Scanner(System.in).nextInt();
        String ruta = "D:/frases.txt";
        switch (num){
            case 1 :
                    System.out.println("Introduce frase 1 :");
                    String frase1 = new Scanner(System.in).nextLine();
                    System.out.println("Introduce frase 2 :");
                    String frase2 = new Scanner(System.in).nextLine();
                    
                try(PrintWriter archivo = new PrintWriter(ruta)){ 
                                                                              
                    archivo.print(frase1+" "+frase2);
                    
                }catch(IOException error){
                    System.out.println("Error opcion 1");
                }
                break;
            
            
            case 2 :
               File ruta2 = new File("D:/frases.txt");
                 try{
                     Scanner frase = new Scanner(ruta2);
                     System.out.println(frase.nextLine());
                 }catch(FileNotFoundException error){
                     System.out.println("error");
                 }
                break;
                    
        }
    }
}
