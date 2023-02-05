package Ejercicio18a21;

import java.util.List;
import java.util.Random;

public class EmpresaLowCost implements EmpresaPaqueteria {
     private Transportista[] transportistas;
     private int siguienteTransportista;

     public EmpresaLowCost(int n){
        this.transportistas = new Transportista[n];
        for(int i=0; i<n; i++){
            int tiempo = new Random().nextInt(40, 80);
            this.transportistas[i] =new Transportista(tiempo);
        }
        this.siguienteTransportista =0;
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

    @Override
    public void enviarPaquetes() {
        // TODO Auto-generated method stub
        for(Transportista i : transportistas){
            i.enviar();
        }
    }
    
}
