
import java.util.List;


public class Departamento {
    private String nombre;
    private List<Empleado> empleados;
    
    public Departamento(String nombre, List<Empleado> empleados){
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
}
