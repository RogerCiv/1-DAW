
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



/**
Haz un programa que pida 6 palabras al usuario y las guarde en un List<String>. El
programa deberá mostrar por pantalla las palabras únicas (o sea, las palabras repetidas no se
mostrarán).
 */
public class Ejercicio28 {
    public static void main(String[] args) {
         System.out.println("Introduce 6 palabras");
        String palabras = new Scanner(System.in).nextLine();
        
        String[] array = palabras.split(" ");
        
        List<String> lista = Arrays.asList(array);
        
        Set<String> set = new HashSet<>(lista);
        
        for(String pal : set){
            System.out.println(pal);
        }
        
        
    }
}
