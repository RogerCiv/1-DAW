
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio26b {
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        
        
        boolean repetir = true;
        
        while(repetir){
            
              System.out.println("""
                           
                           1. A;adir mensaje a la lista.
                           2. Consultar el numero de mensajes de a lista.
                           3. Consultar mensaje.
                           4. Comprobar mensaje.
                           5. Consultar todos lso mensajes.
                           6. Borrar la lista.
                           7. Salir
                           """);
              
              int opcion = new Scanner(System.in).nextInt();
              
              switch(opcion){
                  case 1 -> {
                      System.out.println("Crea una frase para a;adir a la lista");
                      String frase = new Scanner(System.in).nextLine();
                      lista.add(frase.toLowerCase());
                  }
                  case 2 -> {
                     System.out.println("En la lista hay un total de "+lista.size()+" mensajes");
                  }
                  case 3 -> {
                      if(lista.size()==0){
                          System.out.println("Esta vacia....");
                      }else{
                          System.out.println("Introduce el mensaje que deseas consultar (entre 0 y"+(lista.size()-1)+")");
                          int numMensajes =new Scanner(System.in).nextInt();
                          
                          if(numMensajes>=0 && numMensajes <= lista.size()){
                              System.out.println(lista.get(numMensajes));
                          }else{
                              System.out.println("Has introducido un numero incorrecto");
                          }
                      }
                  }
                  case 4 -> {
                      System.out.println("Introduce un mensaje para comparar y saber si esta en la lista");
                      String comparar = new Scanner(System.in).nextLine().toLowerCase();
                      if(lista.contains(comparar)){
                          System.out.println("Esta en la lista y su posicion es "+lista.indexOf(comparar));
                          
                      }else{
                          System.out.println("No se encuentra en la lista");
                      }
                  }
                  case 5 -> {
                      for(int i = 0 ; i < lista.size(); i++){
                          System.out.println("El mensaje de la posicion "+i+" es "+lista.get(i));
                      }
                  }
                  case 6  -> {
                      lista.clear();
                  }
                  case 7 -> repetir = false;
                  
                  default -> System.out.println("Elige bien, opcion entre 1 y 7");
                      
                 
                  
              
            
        
        
              }
        
        
        
    }
}
}
