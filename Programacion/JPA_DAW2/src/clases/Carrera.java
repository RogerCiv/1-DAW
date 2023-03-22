
package clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import org.hibernate.annotations.ManyToAny;

@Entity
public class Carrera implements Serializable{
    
    @Id @GeneratedValue
    private int id;
    
    private LocalDate fechaRealizacion;
    private String nombre;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Corredor> corredores;
    
    
    public Carrera(){
        
    }
    
    public Carrera(String n, LocalDate f){
        nombre = n;
        fechaRealizacion = f;
        corredores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorredores(List<Corredor> corredores) {
        this.corredores = corredores;
    }
    
    
}
