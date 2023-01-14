package ejercicios.Ejercicio37;

public interface Adinerado {
    //Ejercicio 38
    public static int TRANSFERENCIA_MINIMA = 1526;
    //getDineroTotal devuelve la cantidad de dinero que tenga el objeto
    public double getDineroTotal();
    //añadirDinero recibe una cantidad e incrementa la cantidad de dinero del objeto.
    //Devuelve false si no es posible añadir la cantidad de dinero al objeto.
    public boolean añadirDinero(int cantidad);
    //retirarDinero recibe una cantidad y decrementa la cantidad de dinero del objeto.
    //lDevuelve false si el objeto no tiene dinero suficiente para retirar dicha cantidad.
    public boolean retirarDinero(int cantidad);
    
    //Ejercicio 38
    //tieneDinero devuelve true si el adinerado tiene dinero.
    public default boolean tieneDinero(){
        return getDineroTotal()>0;
    }
    
    //transferirHacia ingresa en el “receptor” la cantidad de dinero que se retira del objeto
    //Adinerado que se está programando. El método devuelve false si no hay dinero
    //suficiente para la transferencia o dicho dinero no llega a la transferencia mínima

    public default boolean transferirHacia(Adinerado receptor, double cantidad){
        boolean respuesta = false;
        if(cantidad > getDineroTotal() && cantidad >= TRANSFERENCIA_MINIMA){
            
            retirarDinero( (int)cantidad);
            receptor.añadirDinero((int) cantidad);
            respuesta = true;
        }
        return respuesta;
    }

    //transferirDesde ingresa en el objeto Adinerado que se está programando la cantidad
    //de dinero que se extrae del “emisor”. El método devuelve false igual que el anterior.
    public default boolean transferirDesde(Adinerado emisor, double cantidad){
        boolean respuesta = false;
        if(cantidad >= TRANSFERENCIA_MINIMA && emisor.getDineroTotal() >= cantidad){
            emisor.retirarDinero((int) cantidad);
            añadirDinero((int) cantidad);
            respuesta = true;
        }

        return respuesta;
    }

    //transferir ingresa en el objeto “emisor” la cantidad de dinero que se extrae del objeto
    //“receptor”. El método devuelve false igual que el anterior.
    public static boolean transferir(Adinerado emisor, Adinerado receptor, double cantidad){
        boolean respuesta = false;
        if(cantidad >= TRANSFERENCIA_MINIMA && cantidad <= emisor.getDineroTotal()){
            receptor.retirarDinero((int) cantidad);
            emisor.añadirDinero((int) cantidad);
            respuesta = true;
        }
    
        return respuesta;
    }
}
