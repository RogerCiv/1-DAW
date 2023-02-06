package Ejercicio18a21;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmpresaLowCost implements EmpresaPaqueteria {
     private Transportista[] transportistas;
     private int siguienteTransportista;

     public EmpresaLowCost(int n){
        this.transportistas = new Transportista[n];
        for(int i=0; i<n; i++){
            int tiempo = new Random().nextInt(40, 81);
            this.transportistas[i] =new Transportista(tiempo);
         }
         this.siguienteTransportista = 0;
     }



    @Override
    public List<Transportista> getTransportista() {
        // TODO Auto-generated method stub
        List<Transportista> t = new ArrayList<>();
        for(int i = 0; i<this.transportistas.length; i++){
            t.add(this.transportistas[i]);
        }
        return t;
    }

    @Override
    public void registrarPedido(Paquete p) {
        // TODO Auto-generated method stub
        this.transportistas[this.siguienteTransportista].subirCamion(p);
        this.siguienteTransportista++;
        if(siguienteTransportista == transportistas.length){
            this.siguienteTransportista = 0;
        }
    }

   
    
}
