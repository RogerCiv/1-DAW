
import java.util.Scanner;
import java.sql.*;
/*
Haz un nuevo proyecto con un programa que prgeunte por teclado una ciudad y nos diga cuantos alumnos
hay en esa ciudad. Si la ciudad no existe, se mostrará un mesanje "Ciudad incorrecta"
*/
public class Ejercicio04 {
    public static void main(String[] args) {
        
        System.out.println("Introduce una ciudad: ");
        String ciudad = new Scanner(System.in).nextLine();
        
        try(
            Connection conexion = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/ALUMNOS_DAW",
                    "root",
                    ""
            );
            ){
            
            String sql = "SELECT COUNT(nombre) AS Total,ciudad FROM Alumnos WHERE ciudad = '"+ciudad+"'";
            
            Statement s = conexion.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                int t = r.getInt("Total");
                //String c = r.getString("ciudad");
                System.out.println(t);
            }
            
        }catch(SQLException error){
            System.out.println("error");
            System.out.println(error.getMessage());
        }
    }
}
