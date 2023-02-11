package Ejercicio10a12;

public class CuerpoTecnico extends Empleado{
    private String puesto;


    public CuerpoTecnico(String n, double s, String p) {
        super(n, s);
        this.puesto = p;
        //TODO Auto-generated constructor stub
    }


    public String getPuesto() {
        return this.puesto;
    }
    
}
