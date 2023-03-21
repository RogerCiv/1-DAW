


import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
@Entity
public class CorredorProfesional extends Corredor implements Serializable{
    private int numeroTrofeos;
    private String club;
    
    public CorredorProfesional(){
        
    }
    
    public CorredorProfesional(String nombre, LocalDate fechaNac, int numeroTrofeos, String club){
        super(nombre,fechaNac);
        this.numeroTrofeos= numeroTrofeos;
        this.club = club;
    }

    public int getNumeroTrofeos() {
        return numeroTrofeos;
    }

    public String getClub() {
        return club;
    }

    public void setNumeroTrofeos(int numeroTrofeos) {
        this.numeroTrofeos = numeroTrofeos;
    }

    public void setClub(String club) {
        this.club = club;
    }
    
    
}
