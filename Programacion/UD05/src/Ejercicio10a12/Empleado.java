package Ejercicio10a12;

public class Empleado implements Nombrable {
    private String nombre;
    private double sueldo;
    private double dinero;

    public Empleado(String n, double s){{
        this.nombre = n;
        this.sueldo = s;
        this.dinero = 0;
    }

    

    }
    @Override
    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getDinero() {
        return dinero;
    }

    public void cobrar(double cantidad) throws CabreoException{
        if(cantidad<sueldo){
            this.dinero +=cantidad;
            throw new CabreoException("Al empleado"+getNombre()
            +" no se le han pagado"+(sueldo-cantidad)+" euros");
        }
        this.dinero += cantidad;
    }
}
