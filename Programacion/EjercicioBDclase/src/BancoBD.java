
import java.util.Scanner;
import java.sql.*;

public class BancoBD {
    public static void main(String[] args) {
        System.out.println("""
                           BANCO HLANZ
                           ------------
                           """);
        
        
        System.out.println("Usuario: ");
        String usuario = new Scanner(System.in).nextLine();
        System.out.println("Contraseña");
        String pw = new Scanner(System.in).nextLine();
        
        try(
                Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ALUMNOS_DAW",
                        "root",
                        ""
                );
                ){
           /*
            Enfoque vulnerable
            
            Statement s = conexion.createStatement();
            String sql = "SELECT * FROM Banco WHERE username = '"+usuario+"' AND clave2=md5 ('"+pw+"')";
            ResultSet r = s.executeQuery(sql);
            */
           
           String sql = "SELECT * FROM Banco WHERE Username=? AND Clave2=MD5(?)";
           PreparedStatement ps = conexion.prepareStatement(sql);
           ps.setString(1, usuario);//primer interrogante
           ps.setString(2,pw);// segundo interrogante
           ResultSet r = ps.executeQuery();   
           
            if(r.next()){
                String nombreCompleto = r.getString("Nombre");
                int saldo = r.getInt("Saldo");
                int id = r.getInt("id");
                boolean repetir = true;
                while(repetir){
         
                System.out.println("Bienvenido "+nombreCompleto);
                System.out.println("Tu saldo es : "+saldo);
                System.out.println("""
                                   1.- Sacar dinero
                                   2.- Hacer transferencia.
                                   3.- Domiciliar recibos.
                                   4.- Salir.
                                   """);
               
                 int opcion = new Scanner(System.in).nextInt();
                 if(opcion == 4){
                     repetir = false;
                 }else if (opcion == 1){
                     System.out.println("Cantidad a retirar: ");
                     int dinero = new Scanner(System.in).nextInt();
                     if(dinero<=saldo){
                       sql="UPDATE Banco SET saldo = saldo-"+dinero+" WHERE id ="+id;
                       ps.executeUpdate(sql);
                       saldo-=dinero;
                     }
                    
                 }else if (opcion == 2){
                     System.out.println("Cantidad a transferir");
                     int dinero = new Scanner(System.in).nextInt();
                     System.out.println("Username de destino: ");
                     String destino = new Scanner(System.in).nextLine();
                     String sql1 = "UPDATE Banco SET Saldo = Saldo-"+dinero+" WHERE ID = "+id;
                     String sql2 = "UPDATE Banco SET Saldo = Saldo"+dinero+" WHERE USERNAME ='"+destino+"'";
                     conexion.setAutoCommit(false);
                     Statement s1 = conexion.createStatement();
                     s1.executeUpdate(sql1);
                     Statement s2 = conexion.createStatement();
                     s2.executeUpdate(sql2);
                     conexion.commit();
                     
                 }
                 
              }
                
            }else{
                System.out.println("Usuario/contraseña incorrecta");
            }
            
        }catch(SQLException error){
            System.out.println("Error");
            System.out.println(error.getMessage());
        }
    }
}
