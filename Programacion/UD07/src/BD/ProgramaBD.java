
package BD;

import java.sql.*;

public class ProgramaBD {
    public static void main(String[] args) {
        //metiendolo dentro del try, cerramos la conexion al terminar sin tener que usar
        // conexion.close();
        try(
              Connection conexion = DriverManager.getConnection(
           "jdbc:mysql://localhost:3306/ALUMNOS_DAW",
                    "root",
                    ""
            );                
                ){
        
            System.out.println("Conexion establecidad correctamente");     
            
            
            //SELECT
            //se le pide a la conexion un objeto(Statement) que sabe hacer SQL
            Statement s = conexion.createStatement();
            //hago un String con la consulta
            String sql = "SELECT id,nombre AS Name,ciudad FROM Alumnos";
            
            // le mando el STring sql  al objeto Statement
             ResultSet r = s.executeQuery(sql);
             
             // recorremos el resulset y a mostrar los resultados
             //r.next() baja la fila seleccionada
             while(r.next()){
                 String n = r.getString("Name");
                 int i = r.getInt("id");
                 System.out.println(i+" : "+n);
             }
             

            
        }catch(SQLException error){
            System.out.println("Error");
            System.out.println(error.getMessage());
        }
    }
}
