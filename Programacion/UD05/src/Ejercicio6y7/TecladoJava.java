package Ejercicio6y7;

public class TecladoJava implements Teclado {

      //Es una implementación de teclado cuyo método escribirTexto recibe un mensaje y lo imprime por pantalla
    @Override
    public void escribirTexto(String mensaje) {
      System.out.println(mensaje);
        
    }
    
}
