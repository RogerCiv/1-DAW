
/*
Programa que pregunte por teclado al usuario el id de un alumno y nos muestre toda la informacion de ese alumno
*/
import java.util.Scanner;
import java.sql.*;

public class EJercicio02 {
    public static void main(String[] args) {
        
        System.out.println("Introduce el ID del alumno a buscar: ");
        int id = new Scanner(System.in).nextInt();
        
        try(
               Connection conexion = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/ALUMNOS_DAW",
                       "root",
                       ""
               );
             ){
            
            String sql = "SELECT nombre,ciudad FROM Alumnos WHERE id = "+id;
            Statement s = conexion.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
              
               String n = r.getString("nombre");
               String c = r.getString("ciudad");
                System.out.println(n+" - "+c);
            }
            
        }catch(SQLException error){
            System.out.println("Error");
            System.out.println(error.getMessage());
        }
    }
}
