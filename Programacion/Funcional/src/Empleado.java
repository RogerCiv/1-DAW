
public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private String puesto;
    private int sueldo;
    
    public Empleado(String n, String p, int s){
        nombre = n;
        puesto = p;
        sueldo = s;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int compareTo(Empleado o) {
       return this.sueldo - o.sueldo;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    
    
}
