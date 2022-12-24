
import java.util.Scanner;



/**
Realiza un programa que pregunte al usuario "¿Eres mayor de edad (si/no)?". Si el
usuario escribe "Si", el ordenador mostrará un mensaje "El usuario es mayor de edad". Si el
usuario escribe "No", el ordenador mostrará "El usuario es menor de edad". Si el usuario
escribe cualquier otra cosa, el ordenador mostrará "No te entiendo" y volverá a hacer la
pregunta hasta que el usuario escriba lo correcto
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        
        
        
        boolean repetir = true;
       
        while(repetir){
            System.out.println("¿Eres mayor de edad? (Si/no)");
             String opcion = new Scanner(System.in).nextLine();
            switch(opcion){
               
                case "si","SI" -> { 
                    System.out.println("Eres mayor de edad");
                    repetir = false;
                }
                case "no","NO" -> {
                    System.out.println("Eres menor de edad");
                    repetir = false;
                }
                default -> System.out.println("No te entiendo");
            }
        }
      
        System.out.println("Fin del programa");
    }
}
