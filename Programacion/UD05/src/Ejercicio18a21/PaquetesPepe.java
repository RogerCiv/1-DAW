package Ejercicio18a21;


import java.util.List;

public class PaquetesPepe implements EmpresaPaqueteria {
    private TransportistaOrdenado pepe;

    public PaquetesPepe(){
        this.pepe = new TransportistaOrdenado(30);
    }



    @Override
    public void registrarPedido(Paquete p) {
        // TODO Auto-generated method stub
        pepe.subirCamion(p);
    }



    @Override
    public List<Transportista> getTransportista() {
        // TODO Auto-generated method stub

        return List.of(this.pepe);
    }




}
