package Ejercicio10a12;

import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol implements Nombrable{
    private String nombre;
    private List<Empleado> empleados;
    private double presupuesto;

    public EquipoFutbol(String n, double p){
        this.nombre = n;
        this.empleados = new ArrayList<>();
        this.presupuesto = p;
    }


    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return this.nombre;
    }


    public List<Empleado> getEmpleados() {
        return this.empleados;
    }


    public double getPresupuesto() {
        return this.presupuesto;
    }

    public void addEmpleado(Empleado e){
        int coach = 0;
        for(Empleado i : empleados){
            if(i instanceof Entrenador){
                coach++;
            }
        }
        if(coach >= 1 && e instanceof Entrenador a){
            throw new IllegalArgumentException("Solo puede haber un entrenador");  
        }
        if(e instanceof Futbolista f){
            empleados.add(e);
        }
        if(empleados.size() > 25){
            throw new IllegalArgumentException("El equipo admite hasta 25 jugadores en plantilla");
        }
        

    }

    public void pagarSueldoEmpleados(){
        double pagos = 0;
        for(Empleado i : empleados){
            pagos = i.getSueldo();
            i.cobrar(i.getSueldo());
            this.presupuesto -= pagos;
            if(i instanceof EmpleadoPrimable a && a.esPrimado()){
                i.cobrar(i.getSueldo()*1.1);
                
            }
            if(presupuesto <pagos){
                int jPendientes = empleados.size();
                for(Empleado e : empleados){
                    if(){

                    }
                }
            }
            i.cobrar(i.getSueldo());
        }
    }
    
}
