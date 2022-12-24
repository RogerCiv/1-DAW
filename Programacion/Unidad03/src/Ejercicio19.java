
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
Realiza un programa que pregunte por teclado una dirección IP y un número
entero. El programa usará la clase InetAddress para realizar la cantidad de pings indicada a la
dirección IP, midiendo el tiempo empleado en hacer cada uno (clases Instant y Duration), y
mostrará el resultado de esta forma:
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.println("Introduce la direccion IP");
        String ip = new Scanner(System.in).nextLine();
        
       
        try {
            InetAddress ipFinal = InetAddress.getByName(ip);
            boolean posible = ipFinal.isReachable(10000);
            System.out.println(posible);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Ejercicio19.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException error){
            System.out.println("Error de : " +error);
        }
        
    }
}
