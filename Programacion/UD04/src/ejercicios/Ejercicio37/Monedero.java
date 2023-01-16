package ejercicios.Ejercicio37;

public class Monedero implements Adinerado{
    private double dinero;
    //El constructor crea un Monedero cuyo dinero almacenado es 0, y solo admite
    //almacenar hasta 1000 €.
    public Monedero(){
        if(this.dinero > 1000){
            throw new IllegalArgumentException(" Solo se puede almacenar hasta 1000$");
        }
       this.dinero = 0;
    }

    @Override
    public double getDineroTotal() {
        // TODO Auto-generated method stub
        return this.dinero;
    }

    @Override
    
    public boolean añadirDinero(int cantidad) {
        // TODO Auto-generated method stub
        /*return this.dinero + cantidad <= 1000;*/
        boolean respuesta = false;
        if(this.dinero + cantidad <= 1000){
            this.dinero += cantidad;
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        // TODO Auto-generated method stub
        boolean respuesta = false;
        if(this.dinero >= cantidad){
            this.dinero -= cantidad;
            respuesta = true;
        }
        
        return respuesta;
    }
    
}
