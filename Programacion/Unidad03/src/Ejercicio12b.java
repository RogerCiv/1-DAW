
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * tiliza las clases y métodos de la librería de entrada y salida que se indican
 * a continuación para hacer un programa que pregunte por teclado la ruta de un
 * archivo de texto (.txt) y a continuación, use un BufferedReader para leer una
 * por una todas sus líneas y mostrarlas por pantalla a la ve
 */
public class Ejercicio12b {

    public static void main(String[] args) {

        System.out.println("Introduce la ruta del archivo txt");
        String ruta = new Scanner(System.in).nextLine();
        boolean repetir = true;
        int contador = 0;

        while (repetir) {
            try {
                FileInputStream file = new FileInputStream(ruta);
                InputStreamReader stream = new InputStreamReader(file);
                BufferedReader reader = new BufferedReader(stream);
                 String linea;
            if((linea = reader.readLine())!= null){
            
                System.out.println(linea);
                repetir=false;
                contador++;
            }else{
                repetir=false;
            }
                
            } catch (FileNotFoundException  error) {
                System.out.println("error");
            }catch(IOException error){
                System.out.println("error");
            }
           
        }
        System.out.println("\nPalabras contadas: " + contador);

    }
}
