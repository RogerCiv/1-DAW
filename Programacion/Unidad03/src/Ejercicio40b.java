
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
Realiza un programa que pida diez notas por teclado y al final muestre su nota
media. Si alguna nota introducida es incorrecta (negativa o superior a 10) el programa la
preguntará nuevamente.
 */
public class Ejercicio40b {
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>();
       double suma = 0;
        for(int i = 0 ; i<10;i++){
            System.out.println("Introduce una nota");
            
            boolean repetir = true;
            int nota=0;
            while(repetir){
                nota =new Scanner(System.in).nextInt();
                
                if(nota>=0 && nota<=10){
                 
                    repetir=false;
                }else{
                    System.out.println("Nota incorrecta");
                }
                   suma+=nota;
                lista.add(nota);
            }
        }
        System.out.println("L:a media es de : "+suma/lista.size());
    }
}
