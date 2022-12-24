
import java.util.Scanner;



/**
 *
Realiza un programa en el que haya una variable llamada "contraseña" iniciada
con el valor que tú quieras. A continuación el programa pedirá al usuario que introduzca la
contraseña. El usuario solo tiene 5 intentos para ponerla bien. En caso de que el usuario la
acierte, el programa dirá "Acceso permitido". Si se agotan los intentos, se mostrará "Acceso
denegado". En todo momento el programa mostrará el número de intentos restantes.
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        String password= "perro";
        
        
        boolean repetir = true;
        
    for(int i = 5; i>0 && repetir ; i--){
       
        System.out.println("Introduce la pass. te quedan "+i+" intentos");
        String pass = new Scanner(System.in).nextLine();
         
        
        if(pass.equals(password)){
            System.out.println("Acceso permitido");
            repetir=false;
        }else{
           System.out.println("acceso denegado");
        }
    }
    
        
    }
}
