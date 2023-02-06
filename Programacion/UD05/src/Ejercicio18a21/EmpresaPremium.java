package Ejercicio18a21;

import java.util.List;
import java.util.Map;



public class EmpresaPremium implements EmpresaPaqueteria {
    private Transportista rapido;
    private Transportista medio;
    private Transportista lento;

    public EmpresaPremium(){
        this.rapido = new Transportista(10);
        this.medio = new Transportista(25);
        this.lento = new Transportista(30);
    }
    @Override
    public void registrarPedido(Paquete p) {
        // TODO Auto-generated method stub
     /*
     if(p.getPrioridad() == Paquete.ALTA){
        this.rapido.subirCamion(p);
      }else if(p.getPrioridad() == Paquete.MEDIA){
        this.medio.subirCamion(p);
      }else{
        this.lento.subirCamion(p);
      }     
     */ 
    /* 
      Map<Integer, Transportista> m = Map.of(
            Paquete.BAJA, lento,
            Paquete.MEDIA, medio,
            Paquete.ALTA, rapido
      );
      m.get(p.getPrioridad()).subirCamion(p);
      */
      Map.of(
            Paquete.BAJA, lento,
            Paquete.MEDIA, medio,
            Paquete.ALTA, rapido
      ).get(p.getPrioridad())
       .subirCamion(p);

    }
    @Override
    public List<Transportista> getTransportista() {
        // TODO Auto-generated method stub
        return null;
    }
   
}
