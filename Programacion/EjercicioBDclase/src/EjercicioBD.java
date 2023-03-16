import java.sql.*;
import java.util.Scanner;
public class EjercicioBD {
    public static void main(String[] args) {
        
        try(
            Connection  conexion = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/ALUMNOS_DAW",
                    "root",
                    ""
            );
            ){
            String ciudad = new Scanner(System.in).nextLine();
            Statement s = conexion.createStatement();
            String sql = "SELECT COUNT(id) FROM Alumnos WHERE CIUDAD = '"+ciudad+"'";
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                int valor = r.getInt("COUNT(id)");
                System.out.println(valor);
                
            }
            
        }catch(SQLException error){
            System.out.println("error");
            System.out.println(error.getMessage());
        }
        
    }
}