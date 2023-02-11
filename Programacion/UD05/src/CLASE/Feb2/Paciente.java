package CLASE.Feb2;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    
    private int numeroSeguridadSocial;
    private String nombre;
    private List<String> enfermedades;

    public Paciente(int ns, String n){
        this.numeroSeguridadSocial = ns;
        this.nombre = n;
        this.enfermedades = new ArrayList<>();
    }

    @Override
    public String toString(){
        return numeroSeguridadSocial+" - "+nombre+" : "+enfermedades.toString();
    }
    /*
     * Este metodo devuelve true si el parametro "o"  es de tipo Paciente y 
     * coincide su nombre, nss y enfermedades co nlos del objeto que estamos programanado.
     
    @Override
    public  boolean equals(Object o){
        boolean resultado = false;
        if(o instanceof Paciente p){
            resultado = this.nombre.equals(p.nombre) &&
                        this.numeroSeguridadSocial==p.numeroSeguridadSocial &&
                        this.enfermedades.equals(p.enfermedades);
        }

        return resultado;
    }

    @Override
    public int hashCode(){
        return 3*numeroSeguridadSocial + 17 * nombre.hashCode()
                + 7 * enfermedades.hashCode();
    }
    */

    
    public int getNumeroSeguridadSocial() {
        return this.numeroSeguridadSocial;
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<String> getEnfermedades() {
        return this.enfermedades;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numeroSeguridadSocial;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((enfermedades == null) ? 0 : enfermedades.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Paciente other = (Paciente) obj;
        if (numeroSeguridadSocial != other.numeroSeguridadSocial)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (enfermedades == null) {
            if (other.enfermedades != null)
                return false;
        } else if (!enfermedades.equals(other.enfermedades))
            return false;
        return true;
    }

    
}
