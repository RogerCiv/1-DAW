
package clases;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;

@Entity
public class CorredorAmateur extends Corredor implements Serializable{
    
    private double velocidadMedia;
    private int experiencia;
    
    
    public CorredorAmateur(){
        
    }
    
    public CorredorAmateur(String nombre, LocalDate fechaNac ,double vm, int e){
        super(nombre,fechaNac);
        velocidadMedia = vm;
        experiencia = e;
    }

    public double getVelocidadMedia() {
        return velocidadMedia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setVelocidadMedia(double velocidadMedia) {
        this.velocidadMedia = velocidadMedia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    
}
