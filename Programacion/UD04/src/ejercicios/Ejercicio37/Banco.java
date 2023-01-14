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
        return dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        // TODO Auto-generated method stub
        this.dinero += cantidad;
        return true;
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        // TODO Auto-generated method stub
      /*
      boolean respuesta = false;
        if(this.dinero >= cantidad){
            respuesta = true;
        }
        return respuesta;
      */ 
      return this.dinero>= cantidad;
    }
}
