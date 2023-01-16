package ejercicios.Ejercicio37;

public class Banco implements Adinerado {
    private double dinero;

    //El constructor crea un Banco cuyo dinero almacenado es 0. Es posible ingresar cualquier
    //cantidad de dinero en el banco
    public Banco(){
        this.dinero = 0;
    }

    @Override
    public double getDineroTotal() {
        // TODO Auto-generated method stub
        return this.dinero;
    }

    @Override
    //añadirDinero recibe una cantidad e incrementa la cantidad de dinero del objeto.
    //Devuelve false si no es posible añadir la cantidad de dinero al objeto.
    public boolean añadirDinero(int cantidad) {
        // TODO Auto-generated method stub
        boolean respuesta = false;
        if(this.dinero> 0){
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
