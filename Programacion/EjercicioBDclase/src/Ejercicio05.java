
import java.util.Scanner;

/*
Programa que pregunte al usuario el nombre de un alumno y nos myestre el numero de alumnos que viven en su misma ciudad
*/
import java.sql.*;
public class Ejercicio05 {
    public static void main(String[] args) {
        System.out.println("Introduce nombre de alumno: ");
        String alumno = new Scanner(System.in).nextLine();
        
        try(
             Connection c = DriverManager.getConnection(
             "jdbc:mysql://localhost:3306/ALUMNOS_DAW",
                     "root",
                     ""
             );
                ){
            
            String sql = "SELECT  COUNT(ciudad) AS total FROM Alumnos WHERE ciudad = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, alumno);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                String total = r.getString("total");
                System.out.println(total);
            }
            
        }catch(SQLException error){
            System.out.println("Error");
            System.out.println(error.getMessage());
        }
    }
}
