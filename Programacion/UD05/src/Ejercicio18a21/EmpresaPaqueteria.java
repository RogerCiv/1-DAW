package Ejercicio18a21;

import java.util.List;

public interface EmpresaPaqueteria {
    public void registrarPedido(Paquete p);
    public List<Transportista> getTransportista();
    public default void enviarPaquetes(){
        List<Transportista> t = getTransportista();

        for(Transportista i : t){
            i.enviar();
        }
    }

}
