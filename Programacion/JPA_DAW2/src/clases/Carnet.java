
package clases;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Carnet implements Serializable{
    
    @Id @GeneratedValue
    private int id;
    private LocalDate fechaExpedicion;
    
    @OneToOne
    private CorredorProfesional corredor;
    
    public Carnet(){
        
    }
    
    public Carnet(LocalDate fechaExpedicion){
        this.fechaExpedicion = fechaExpedicion;
        corredor=null;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public CorredorProfesional getCorredor() {
        return corredor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public void setCorredor(CorredorProfesional corredor) {
        this.corredor = corredor;
    }
    
}
