
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio40 {
    public static void main(String[] args) {
        
        List<Integer> notas = new ArrayList<>();
        double suma = 0;
        for(int i = 0; i<10; i++){
            System.out.println("Introduce una nota");
           
            
            boolean repetir = true;
            int nota = 0;
            while(repetir){
                 nota = new Scanner(System.in).nextInt();
                 if(nota>=0 && nota<=10){
                     repetir=false;
                 }else{
                     System.out.println("Nota incorrecta");
                 }
                 notas.add(nota);
                 suma+=nota;
            }
            
        }
        System.out.println("Nota media de " +suma/10);
    }
}
