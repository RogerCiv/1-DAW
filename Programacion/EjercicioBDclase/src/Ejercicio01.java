/*
    Creamos un nuevo proyecto y hacemos un programa que muestre en pantalla el nombre
de los alumnos que no tienen rellena la ciudad
*/
import java.sql.*;

public class Ejercicio01 {
    public static void main(String[] args) {
        
        try(Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ALUMNOS_DAW",
                "root",
                ""
        )){
            String sql = "SELECT nombre,ciudad FROM Alumnos WHERE ciudad IS NULL";
            
            Statement s = conexion.createStatement();
            
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                String n = r.getString("nombre");
                System.out.println(n);
                
            }
            
            
        }catch(SQLException error){
            System.out.println("Error");
            System.out.println(error.getMessage());
        }
    }
}
