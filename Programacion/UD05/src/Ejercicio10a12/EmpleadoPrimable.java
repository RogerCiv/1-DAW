package Ejercicio10a12;

public class EmpleadoPrimable extends Empleado {

    private boolean primado;

    public EmpleadoPrimable(String n, double s) {
        super(n, s);
        this.primado = false;
        //TODO Auto-generated constructor stub
    }

    public void primar(){
        this.primado = true;
    }
    
    public boolean esPrimado() {
        return this.primado;
    }

   
}
