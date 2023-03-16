
package clasesBD;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class CatalogoAlumnos {
    
    
    
    //Este metodo consulta la base de datos y nos devuelve una lista con todos lso alumnos de la base de datos.
    //Se crea un objeto Alumno por cada fila de la tabla alumnos
    
    public static List<Alumno> getAlumnos(){
        List<Alumno> lista = new ArrayList<>();
        try(
                Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ALUMNOS_DAW",
                        "root",
                        ""
                );
                ){
            
            String sql = "SELECT * FROM Alumnos ORDER BY nombre";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                int id = r.getInt("id");
                String n = r.getString("nombre");
                String ciudad = r.getString("ciudad");
               // Alumno a = new Alumno(id,n,ciudad); 
                lista.add(new Alumno(id,n,ciudad));               
            }
            
        }catch(SQLException error){
            System.out.println("error");
            System.out.println(error.getMessage());
        }
        return lista;
    }
    
    
    // Este metodo actualiza en la base de datos el alumno con id idAlumnoActualizado y devuelve un objeto
    //ALumno con el alumno actualizado
    //Usando PreparedStatement
    public static Alumno actualizar(int idAlumnoActualizado, String nombreNuevo, String ciudadNueva){
        
        try(
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ALUMNOS_DAW","root","");
            ){
            String sql = "UPDATE Alumnos SET nombre = ?,ciudad = ? WHERE id = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, nombreNuevo);
            p.setString(2, ciudadNueva);
            p.setInt(3, idAlumnoActualizado);
            p.executeUpdate();
 
        }catch(SQLException error){
            System.out.println("error");
            System.out.println(error.getMessage());
        }
        
        return new Alumno(idAlumnoActualizado,nombreNuevo,ciudadNueva);
    }
    
    public static void borrar(int id){
         try(
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ALUMNOS_DAW","root","");
            ){
            String sql = "DELETE FROM Alumnos WHERE id = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setInt(1, id);
            p.executeUpdate();
 
        }catch(SQLException error){
            System.out.println("error");
            System.out.println(error.getMessage());
        }
    }
}
