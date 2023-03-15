
/*
Pregunte por teclado un String y una ciudad y nos muestre los nombres de los alumnos cuyo nombre contiene 
al string y son de la ciudad introducida
*/
import java.util.Scanner;
import java.sql.*;
public class Ejercicio03 {
    public static void main(String[] args) {
        
        System.out.println("Introduce un nombre a buscar: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce una ciudad :");
        String ciudad = new Scanner(System.in).nextLine();
        
        try(
                Connection conexion = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ALUMNOS_DAW",
                       "root",
                       ""
                );
                ){
            
            String sql = "SELECT nombre,ciudad FROM Alumnos WHERE nombre LIKE '%"+nombre+"%'";
            Statement s = conexion.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                String n = r.getString("nombre");
                String c = r.getString("ciudad");
                System.out.println(n+" - "+c);
            }
            
        }catch(SQLException error){
            System.out.println("error");
            System.out.println(error.getMessage());
        }
    }
}
