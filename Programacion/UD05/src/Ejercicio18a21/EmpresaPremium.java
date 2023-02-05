package Ejercicio18a21;

import java.util.List;



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
      
    }
    
}
