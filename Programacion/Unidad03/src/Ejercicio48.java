
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Roger
 */
public class Ejercicio48 {
    public static void main(String[] args) {
        //apartado C
        
        Map<String,Integer> usuarios = new HashMap<>();
        
        usuarios.put("Pepe", 9385);
        usuarios.put("Manuel", 1234);
        usuarios.put("Ana", 1085);
        
        System.out.println("Introduce el usuario");
        String usu = new Scanner(System.in).nextLine();
        System.out.println("Introduce la pass");
        int pass = new Scanner(System.in).nextInt();
        
        if(usuarios.containsKey(usu)){
            int check = usuarios.get(usu);
            if(pass == check){
                System.out.println("Acceso permitido");
            }else{
                System.out.println("Usuario/ pass erroneo");
            }
        }else{
            System.out.println("No existe el usuario");
        }
       
    }
}
