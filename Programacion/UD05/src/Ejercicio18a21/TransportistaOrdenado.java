package Ejercicio18a21;

import java.util.Collections;

public class TransportistaOrdenado extends Transportista{
    //Es un tipo de transportista, que cuando recibe la orden de enviar los paquetes, primero ordena la lista de paquetes por prioridad. A continuación,
    //los envía de la forma indicada en el ejercicio anterior.
   
    public TransportistaOrdenado(long te) {
        super(te);
        //TODO Auto-generated constructor stub
    }

    @Override
     public void enviar(){
        Collections.sort(paquetes);
        super.enviar();
    }
    
}
