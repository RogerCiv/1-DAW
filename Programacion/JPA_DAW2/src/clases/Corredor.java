
package clases;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
/* Cuando quiera que una clase se guarde en la BD jago estsos pasos:
1) Pongo @Entity a la clase
2) La clase debe implementar la interfaz Serializable.
3) Le ponemos un constructor vacio a la clase.
4) Le ponemos getter y setters a todas las propiedades que se vayan a guardad en la BD.
5) Le ponemos @Id a la propiedad que queremos que sea la clave primaria.
    Si queremos que sea autoincrementado le pondremos @GeneratedValue.
*/
// para que eN BD haga herencia se pone @Inheritance
@Entity @Inheritance(strategy = InheritanceType.JOINED)
public class Corredor implements Serializable {
    
    @Id @GeneratedValue
    private int id;
    
    private String nombre;
    
    private LocalDate fechaNacimiento;
  
    public Corredor(){
        
    }
    //Este constructor crea un corredor con el nombre y fecha de nacimiento pasada como parametro
    public Corredor(String n, LocalDate fn){
        nombre = n ;
        fechaNacimiento = fn;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    

}
