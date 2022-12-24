
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Utiliza las clases y métodos de la librería de entrada y salida que se
 * indican a continuación para hacer un programa que pregunte por teclado la
 * ruta de un archivo de texto (.txt) y a continuación, use un BufferedReader
////// * para leer una por una todas sus líneas y mostrarlas por pantalla a la vez.
////// */
public class Ejercicio12 {

    public static void main(String[] args) {
        System.out.println("Introduce una ruta donde este el archivo .txt");
        String ruta = new Scanner(System.in).nextLine();
        int contador = 0;
        boolean repetir = true;
        while(repetir){
        try{
            FileInputStream stream = new FileInputStream(ruta);
            //stream.close();
            InputStreamReader rStream = new InputStreamReader(stream);
            BufferedReader reader = new BufferedReader(rStream);
            String linea;
              if ((linea = reader.readLine()) != null){
                 System.out.println(linea);
                 repetir = false;
                 contador++;
            }else{
                  repetir = false;
              }
           
            
        }catch(FileNotFoundException error){
            System.out.println("Error de : "+error);
        }catch(IOException error){
            System.out.println("Error de "+error);
        }
        }
        
////        System.out.println("\nPalabras contadas: " + contador);

    }
}
