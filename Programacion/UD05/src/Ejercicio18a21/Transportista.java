package Ejercicio18a21;

import java.util.ArrayList;
import java.util.List;

public class Transportista {
    protected List<Paquete> paquetes;
    private long tiempoEntrega;

    //Constructor: crea un transportista que tarda en enviar un paquete
    // el número de minutos que se pasa como parámetro, y no tiene ningún paquete asignado.
    public Transportista(long te){
        this.paquetes = new ArrayList<>();
        this.tiempoEntrega = te;
    }
    //subirCamión: recibe un paquete y lo guarda en su camión
    public void subirCamion(Paquete p){
        this.paquetes.add(p);
    }
    //enviar: Simula el envío de paquetes por el transportista. Para ello el método recorre la lista de paquetes y por cada uno, hace una pausa de la cantidad de segundos
    //indicada en la propiedad “tiempoEntrega” y luego muestra por pantalla el mensaje “El paquete (producto) con prioridad (prioridad) ha llegado a: (destino
    //paquete)”. No se tendrá en cuenta la prioridad del paquete.
    public void enviar(){

        for(Paquete i : paquetes){
            try {
                Thread.sleep(tiempoEntrega*60*1000);
                System.out.println("El paquete "+i.getProducto()+" con prioridad "+i.getPrioridad()
                +" ha llegado a : "+i.getDireccionDestino());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        paquetes.clear();
    }
}
