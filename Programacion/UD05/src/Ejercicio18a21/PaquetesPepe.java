package Ejercicio18a21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaquetesPepe implements EmpresaPaqueteria {
    private TransportistaOrdenado pepe;

    public PaquetesPepe(){
        this.pepe = new TransportistaOrdenado(30);
    }



    @Override
    public void enviarPaquetes() {
        // TODO Auto-generated method stub

        pepe.enviar();
        
    }



    @Override
    public void registrarPedido() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public List<Transportista> getTransportista() {
        // TODO Auto-generated method stub

        return null;
    }




}
