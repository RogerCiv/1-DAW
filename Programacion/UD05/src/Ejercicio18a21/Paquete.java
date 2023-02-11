package Ejercicio18a21;

public class Paquete implements Comparable<Paquete> {
    

    public static int ALTA = 1;
    public static int MEDIA = 1;
    public static int BAJA =3;
    private String producto;
    private String direccionDestino;
    private int prioridad;

    public Paquete(String pro, String dd, int pri){
        this.producto = pro;
        this.direccionDestino = dd;
        if(pri == ALTA || pri == MEDIA || pri == BAJA){
            this.prioridad = pri; 
        }else{
            throw new IllegalArgumentException("Nivel de prioridad invalido.");
        }
    }


    public String getProducto() {
        return producto;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public int getPrioridad() {
        return prioridad;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((producto == null) ? 0 : producto.hashCode());
        result = prime * result + ((direccionDestino == null) ? 0 : direccionDestino.hashCode());
        result = prime * result + prioridad;
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
        Paquete other = (Paquete) obj;
        if (producto == null) {
            if (other.producto != null)
                return false;
        } else if (!producto.equals(other.producto))
            return false;
        if (direccionDestino == null) {
            if (other.direccionDestino != null)
                return false;
        } else if (!direccionDestino.equals(other.direccionDestino))
            return false;
        if (prioridad != other.prioridad)
            return false;
        return true;
    }
   

    @Override
    public int compareTo(Paquete p) {
        // TODO Auto-generated method stub

        return this.prioridad - p.prioridad;
    }
    
}
