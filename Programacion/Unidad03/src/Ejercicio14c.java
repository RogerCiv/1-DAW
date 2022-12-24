
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 Realiza un programa que pida una por una, las notas de los alumnos
comprendidas entre 0 y 10 sin decimales. Cuando el usuario introduzca un -1, se mostrará la
mayor nota, la menor, y la nota media de todos ellos.
 */
public class Ejercicio14c {
    public static void main(String[] args) {
        int nota=0;
      boolean repetir = true;
        List<Integer> lista = new ArrayList<>();
        
        while(repetir){
            System.out.println("Introduce una nota");
             nota = new Scanner(System.in).nextInt();
            if(nota>=0 && nota<=10){
                lista.add(nota);
            }else{
                repetir =false;
            }
            
        }
        double n = 0;
        
        for(int i = 0 ; i<lista.size(); i++){
            n+=lista.get(i);
        }
        System.out.println(Collections.max(lista));
        System.out.println(Collections.min(lista));
         System.out.println("La nota media es :" + n / lista.size());
    }
}
