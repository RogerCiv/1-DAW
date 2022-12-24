
import java.util.*;

public class Ejercicio26 {
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();

       boolean repetir = true;
        while(repetir){

            System.out.println("""
                    1. Añadir mensaje a la lista.
                    2. Consultar el número de mensajes de la lista.
                    3. Consultar mensaje.
                    4. Comprobar mensaje.
                    5. Consultar todos los mensajes.
                    6. Borrar toda la lista.
                    7. Salir.
                    """);;
            int opcion = new Scanner(System.in).nextInt();

            switch(opcion){
                case 1 -> {
                    System.out.println("Introduce una frase:");
                    String frase = new Scanner(System.in).nextLine();
                    lista.add(frase);
                  
                }
                case 2 -> {
                    
                        System.out.println(lista.size());
                     
                   
                }
                case 3 ->{
                    if(lista.size() ==0){
                        System.out.println("No hay mensajes");

                    }else {
                        System.out.println("Introduce un numero a partir del 0:");
                        int num = new Scanner(System.in).nextInt();
                        if(num>=0 && num<=lista.size()){
                            System.out.println(lista.get(num));
                        }else{
                            System.out.println("Numero incorrecto");
                        }
                    }
                   
                }
                case 4 -> {
                    System.out.println("Introduce un mensaje para ver si esta en la lista");
                    String msg = new Scanner(System.in).nextLine();
                    int posicion = lista.indexOf(msg);
                    
                    if(posicion>-1){
                        System.out.println(msg+" estan en la posicion "+posicion);
                    }else{
                        System.out.println("el mensaje "+msg+" no esta en la lista");
                    }
                    
                }
                case 5 -> {
                    for(int i = 0 ; i<lista.size();i++){
                        System.out.println("El mensaje de la posicion "+i+" es "+lista.get(i));
                    }
                   
                }
                case 6 -> {
                    lista.clear();
                    System.out.println("La lista ha sido borrada");
                    
                }
                case 7 ->{
                    repetir = false;
                }
                default -> System.out.println("Opcion no valida");
            }
            


        }
    }
}
